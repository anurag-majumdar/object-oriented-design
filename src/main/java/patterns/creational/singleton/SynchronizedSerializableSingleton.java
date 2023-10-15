package patterns.creational.singleton;

import java.io.Serializable;
import java.util.Objects;

public class SynchronizedSerializableSingleton implements Serializable {
    /**
     * Preserves the serial version UID during serialization runtime creation.
     * Else, serialization runtime creates a new value.
     */
    private static final long serialVersionUID = 1L;
    private static SynchronizedSerializableSingleton INSTANCE = null;

    private SynchronizedSerializableSingleton() {
    }

    /**
     * Draconian Synchronization.
     *
     * @return SynchronizedSerializableSingleton
     */
    public static synchronized SynchronizedSerializableSingleton getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new SynchronizedSerializableSingleton();
        }
        return INSTANCE;
    }

    //    /**
    //     * Double Check Synchronization.
    //     *
    //     * @return SynchronizedSerializableSingleton
    //     */
    //    public static SynchronizedSerializableSingleton getInstance() {
    //        SynchronizedSerializableSingleton sss = INSTANCE;
    //        if (Objects.isNull(sss)) {
    //            Object lock;
    //            synchronized (lock) {
    //                sss = INSTANCE;
    //                if (Objects.isNull(sss)) {
    //                    INSTANCE = sss = new SynchronizedSerializableSingleton();
    //                }
    //            }
    //        }
    //    }

    /**
     * Prevents creating a new instance after deserialization.
     *
     * @return SynchronizedSerializableSingleton
     */
    protected Object readResolve() {
        return getInstance();
    }
}
