package patterns.creational.singleton;

import java.util.Objects;

public class Singleton {
    private static Singleton INSTANCE = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
