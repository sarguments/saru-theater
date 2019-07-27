package hika.programmer.java.domain;

public class Program {
    private String name;

    public Program(String name) {
        this.name = name;
    }

    @Override public String toString() {
        return "Program{" +
            "name='" + name + '\'' +
            '}';
    }
}
