package JavaGda34.weekend9_wzorceProjektowe.zad4_Singleton;

public class IdProducer {
    public static final IdProducer INSTANCE = new IdProducer();

    private int lastId = 0;

    private IdProducer() {
    }

    public int getNextId() {
        return ++lastId;
    }
}
