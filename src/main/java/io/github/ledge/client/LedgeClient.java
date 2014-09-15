package io.github.ledge.client;

import io.github.ledge.engine.GameRegistry;
import io.github.ledge.engine.LedgeEngine;
import io.github.ledge.engine.LedgeTiming;
import io.github.ledge.engine.tick.Timing;

public class LedgeClient {

    public static void main(String[] args) {
        GameRegistry.register(Timing.class, new LedgeTiming());

        LedgeEngine engine = new LedgeEngine();

        engine.run(new TestState());
    }
}
