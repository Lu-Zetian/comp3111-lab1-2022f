package Lab1;

public class Library {
    public static void main(String[] args) {
        Library lib = new Library();
        if (lib.someMethod()) {
            System.out.println("hello world");
        }
    }

    public boolean someMethod() {
        return true;
    }
}
