package hika.programmer.java.domain;

public class Library {
    private String name;

    public Library(String name) {
        this.name = name;
    }

    @Override public String toString() {
        return "Library{" +
            "name='" + name + '\'' +
            '}';
    }
}
