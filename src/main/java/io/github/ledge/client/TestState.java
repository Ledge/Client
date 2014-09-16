package io.github.ledge.client;

import io.github.ledge.engine.GameEngine;
import io.github.ledge.engine.GameRegistry;
import io.github.ledge.engine.component.DisplayDevice;
import io.github.ledge.engine.state.GameState;
import org.lwjgl.opengl.Display;

import static org.lwjgl.opengl.GL11.*;

public class TestState implements GameState {

    public TestState() {
    }

    @Override
    public void init(GameEngine engine) {
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(-2.0f, 2.0f, -2.0, 2.0, 0.0f, 60.0f);
        glMatrixMode(GL_MODELVIEW);
    }

    @Override
    public void update(float v) {
    }

    private int rotation;

    @Override
    public void render(float v) {
        GameRegistry.get(DisplayDevice.class).prepareToRender();

        rotation++;

        glRotatef(rotation, 0, 0, 1);

        glBegin(GL_TRIANGLE_STRIP);
        glColor3f(0.5f, 0.5f, 1.0f);
        glVertex3f(1.0f, 1.0f, -20);
        glVertex3f(-1.0f, 1.0f, -20);
        glVertex3f(1.0f, -1.0f, -20);
        glVertex3f(-1.0f, -1.0f, -20);
        glEnd();
    }

    @Override
    public void handleInput(float v) {
    }

    @Override
    public void dispose() {
    }
}
