import java.io.FileNotFoundException;

class DivByZeroException extends ArithmeticException {
    public DivByZeroException() {
        super("Division by zero is not support");
    }
}

class EmptyArrayElement extends NullPointerException {
    public EmptyArrayElement(int idx) {
        super(String.format("Element with index %d not found", idx));
    }

    public EmptyArrayElement() {
        super("Element not found");
    }
}

class FileExist extends FileNotFoundException {
    public FileExist(String path) {
        super(String.format("File %s is not exist", path));
    }

    public FileExist() {
        super("File is not exist");
    }
}