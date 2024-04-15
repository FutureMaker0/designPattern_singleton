package designpattern.singleton;

public class IdGenerator {
    private int id = 1000;
    private static IdGenerator idGenerator = new IdGenerator();

    private IdGenerator() {
    }

    public static IdGenerator getInstance() {
        return idGenerator;
    }

    public synchronized int getNextId() {
        return id++;
    }
}
