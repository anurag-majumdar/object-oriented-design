package patterns.creational.singleton;

/**
 * Simple synchronized singleton.
 */
public class LivingRoom {
    private static LivingRoom INSTANCE;
    private LivingRoom(){ }

    public synchronized static LivingRoom getInstance() {
        if(INSTANCE != null) {
            INSTANCE = new LivingRoom();
        }
        return INSTANCE;
    }
}
