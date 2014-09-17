package io.github.ledge.client;

import com.google.common.collect.Lists;
import io.github.ledge.engine.LedgeEngine;
import io.github.ledge.engine.subsystem.SubSystem;
import io.github.ledge.engine.subsystem.TimeSystem;
import io.github.ledge.engine.subsystem.lwjgl.LwjglAudio;
import io.github.ledge.engine.subsystem.lwjgl.LwjglGraphicsSystem;
import io.github.ledge.engine.subsystem.lwjgl.LwjglInputSystem;

import java.util.List;

public class LedgeClient {

    public static void main(String[] args) {
        List<SubSystem> subSystems = Lists.<SubSystem>newArrayList(new LwjglGraphicsSystem(), new TimeSystem(), new LwjglAudio(), new LwjglInputSystem());

        LedgeEngine engine = new LedgeEngine(subSystems);

        try {

            engine.init();

            engine.run(new TestState());
        } finally {
            try {
                engine.dispose();
            } catch (Exception e) {
                // Oops!
                e.printStackTrace();
            }
        }
    }
}
