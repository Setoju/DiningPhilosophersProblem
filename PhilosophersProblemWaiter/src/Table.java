import java.util.concurrent.Semaphore;

public class Table {
    private final Semaphore[] forks = new Semaphore[5];
    private final Semaphore waiter = new Semaphore(4);

    public Table() {
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Semaphore(1);
        }
    }

    public void getForks(int left, int right) {
        try {
            waiter.acquire();
            forks[left].acquire();
            forks[right].acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void putForks(int left, int right) {
        forks[left].release();
        forks[right].release();
        waiter.release();
    }
}