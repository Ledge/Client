package io.github.ledge.client;

import io.github.ledge.engine.GameRegistry;
import io.github.ledge.engine.LedgeEngine;
import io.github.ledge.engine.LedgeTiming;
import io.github.ledge.engine.tick.Timing;
import io.github.ledge.utils.LwjglUtils;

public class LedgeClient {

    public static void main(String[] args) {
        try {
            LwjglUtils.intializeLwjgl();

            GameRegistry.register(Timing.class, new LedgeTiming());

            LedgeEngine engine = new LedgeEngine();

            engine.run(new TestState());
        } catch (Exception e) {

        }
    }
}
