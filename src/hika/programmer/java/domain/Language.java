package hika.programmer.java.domain;

public class Language {
    private String name;

    public Language(String name) {
        this.name = name;
    }

    @Override public String toString() {
        return "Language{" +
            "name='" + name + '\'' +
            '}';
    }
}
