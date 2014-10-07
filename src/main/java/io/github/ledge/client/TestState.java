package io.github.ledge.client;

import io.github.ledge.engine.GameEngine;
import io.github.ledge.engine.GameRegistry;
import io.github.ledge.engine.component.DisplayDevice;
import io.github.ledge.engine.state.GameState;
import io.github.ledge.engine.tick.Timing;
import io.github.ledge.input.InputSystem;
import io.github.ledge.render.tesselator.DrawMode;

import static org.lwjgl.opengl.GL11.*;

public class TestState implements GameState {

    private InputSystem inputSystem;

    public TestState() {
    }

    @Override
    public void init(GameEngine engine) {
        this.inputSystem = GameRegistry.get(InputSystem.class);
        this.initGl();
    }

    private void initGl() {
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glMatrixMode(GL_MODELVIEW);
    }

    @Override
    public void update(float v) {
        // Update logic etc
    }

    private int x;
    private int y;

    @Override
    public void render(float v) {
        GameRegistry.get(DisplayDevice.class).prepareToRender();

        x++;
        y++;

        glRotatef(x, 1.0f, 0.0f, 0.0f);
        glRotatef(y, 0.0f, 1.0f, 0.0f);

        glColor3f(1, 0, 0);

        glBegin(DrawMode.QUADS.mode());

        // top
        glColor3f(0.0f,1.0f,0.0f);
        glVertex3f( 0.5f, 0.5f,-0.5f);
        glVertex3f(-0.5f, 0.5f,-0.5f);
        glVertex3f(-0.5f, 0.5f, 0.5f);
        glVertex3f( 0.5f, 0.5f, 0.5f);

        // bottom
        glColor3f(1.0f,1.0f,0.0f);
        glVertex3f( 0.5f,-0.5f, 0.5f);
        glVertex3f(-0.5f,-0.5f, 0.5f);
        glVertex3f(-0.5f,-0.5f,-0.5f);
        glVertex3f( 0.5f,-0.5f,-0.5f);

        // front
        glColor3f(1.0f,0.0f,0.0f);
        glVertex3f( 0.5f, 0.5f, 0.5f);
        glVertex3f(-0.5f, 0.5f, 0.5f);
        glVertex3f(-0.5f,-0.5f, 0.5f);
        glVertex3f( 0.5f,-0.5f, 0.5f);

        // back
        glColor3f(1.0f,1.0f,0.0f);
        glVertex3f( 0.5f,-0.5f,-0.5f);
        glVertex3f(-0.5f,-0.5f,-0.5f);
        glVertex3f(-0.5f, 0.5f,-0.5f);
        glVertex3f( 0.5f, 0.5f,-0.5f);

        // left
        glColor3f(0.0f,0.0f,1.0f);
        glVertex3f(-0.5f, 0.5f, 0.5f);
        glVertex3f(-0.5f, 0.5f,-0.5f);
        glVertex3f(-0.5f,-0.5f,-0.5f);
        glVertex3f(-0.5f,-0.5f, 0.5f);

        // right
        glColor3f(1.0f,0.0f,1.0f);
        glVertex3f( 0.5f, 0.5f,-0.5f);
        glVertex3f( 0.5f, 0.5f, 0.5f);
        glVertex3f( 0.5f,-0.5f, 0.5f);
        glVertex3f( 0.5f,-0.5f,-0.5f);
        glEnd();
    }

    @Override
    public void handleInput(float delta) {
        this.inputSystem.update(delta);
    }

    @Override
    public void dispose() {
        this.inputSystem = null;
    }
}
