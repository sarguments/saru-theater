package hika.programmer.java.domain.impl;

import hika.programmer.java.domain.Language;
import hika.programmer.java.domain.Library;
import hika.programmer.java.domain.Paper;

public abstract class Client implements Paper {
    private Library library = new Library("vueJS");
    private Language language = new Language("kotlinJS");

    protected FrontEnd programmer;

    @Override public String toString() {
        return "Client{" +
            "library=" + library +
            ", language=" + language +
            ", programmer=" + programmer +
            '}';
    }

    public Library getLibrary() {
        return library;
    }

    public Language getLanguage() {
        return language;
    }
}