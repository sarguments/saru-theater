package hika.programmer.java.domain.impl;

import hika.programmer.java.domain.Language;
import hika.programmer.java.domain.Program;
import hika.programmer.java.domain.Server;
import hika.programmer.java.domain.Paper;
import hika.programmer.java.domain.Programmer;

public abstract class BackEnd<T extends Paper> extends Programmer<T> {
    protected Server server;
    protected Language language;

    @Override
    protected Program makeProgram(String code) {
        return new Program(code);
    }

    @Override public String toString() {
        return "BackEnd{" +
            "server=" + server +
            ", language=" + language +
            '}';
    }
}