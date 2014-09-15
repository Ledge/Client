package io.github.ledge.client;

import io.github.ledge.engine.GameEngine;
import io.github.ledge.engine.state.GameState;

import static org.lwjgl.opengl.GL11.*;

public class TestState implements GameState {

    public TestState() {
    }

    @Override
    public void init(GameEngine engine) {
        System.out.println("Init");
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, 800, 0, 600, 1, -1);
        glMatrixMode(GL_MODELVIEW);
    }

    @Override
    public void update(float v) {
    }

    @Override
    public void render(float v) {
        System.out.println("Tick!");
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        glLoadIdentity();

        glTranslatef(0.0f, 0.0f, -7.0f);
        glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
        glColor3f(0.5f, 0.5f, 1.0f);

        glColor3f(0.5f, 0.5f, 1.0f);

       /** glBegin(DrawMode.QUADS.mode());
            glColor3f(1.0f,1.0f,0.0f);
            glVertex3f( 1.0f, 1.0f,-1.0f);
            glVertex3f(-1.0f, 1.0f,-1.0f);
            glVertex3f(-1.0f, 1.0f, 1.0f);
            glVertex3f( 1.0f, 1.0f, 1.0f);
            glColor3f(1.0f,0.5f,0.0f);
            glVertex3f( 1.0f,-1.0f, 1.0f);
            glVertex3f(-1.0f,-1.0f, 1.0f);
            glVertex3f(-1.0f,-1.0f,-1.0f);
            glVertex3f( 1.0f,-1.0f,-1.0f);
            glColor3f(1.0f,0.0f,0.0f);
            glVertex3f( 1.0f, 1.0f, 1.0f);
            glVertex3f(-1.0f, 1.0f, 1.0f);
            glVertex3f(-1.0f,-1.0f, 1.0f);
            glVertex3f( 1.0f,-1.0f, 1.0f);
            glColor3f(1.0f,1.0f,0.0f);
            glVertex3f( 1.0f,-1.0f,-1.0f);
            glVertex3f(-1.0f,-1.0f,-1.0f);
            glVertex3f(-1.0f, 1.0f,-1.0f);
            glVertex3f( 1.0f, 1.0f,-1.0f);
            glColor3f(0.0f,0.0f,1.0f);
            glVertex3f(-1.0f, 1.0f, 1.0f);
            glVertex3f(-1.0f, 1.0f,-1.0f);
            glVertex3f(-1.0f,-1.0f,-1.0f);
            glVertex3f(-1.0f,-1.0f, 1.0f);
            glColor3f(1.0f,0.0f,1.0f);
            glVertex3f( 1.0f, 1.0f,-1.0f);
            glVertex3f( 1.0f, 1.0f, 1.0f);
            glVertex3f( 1.0f,-1.0f, 1.0f);
            glVertex3f( 1.0f,-1.0f,-1.0f);
        glEnd();
        */

        glBegin(GL_QUADS);
        glColor3d(1, 0, 0);
        glVertex3f(-1, -1, -10);
        glColor3d(1, 1, 0);
        glVertex3f(1, -1, -10);
        glColor3d(1, 1, 1);
        glVertex3f(1, 1, -10);
        glColor3d(0, 1, 1);
        glVertex3f(-1, 1, -10);
        glEnd();
    }

    @Override
    public void handleInput(float v) {
    }

    @Override
    public void dispose() {
    }
}
