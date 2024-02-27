import java.io.IOException;

public class Task2 implements AutoCloseable {
    private Integer count;

    public Task2() {
        this.count = 0;
    }

    public void checkClose() throws IOException {
        if (this.count == null)
            throw new IOException("Экземпляр закрыт!");
    }

    public void add() throws IOException {
        checkClose();
        this.count++;
    }

    public Integer getCount() throws IOException {
        checkClose();
        return this.count;
    }

    @Override
    public void close() {
        this.count = null;
    }
}
