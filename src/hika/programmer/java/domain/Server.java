package hika.programmer.java.domain;

public class Server {
    private String name;

    public Server(String name) {
        this.name = name;
    }

    @Override public String toString() {
        return "Server{" +
            "name='" + name + '\'' +
            '}';
    }
}
