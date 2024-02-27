import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        main2();
    }

    public static void main2() throws IOException {
        try (Task2 ct = new Task2()) {
            ct.add();
            ct.add();
            ct.add();
            System.out.println(ct.getCount());
            ct.close();
            ct.add();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
