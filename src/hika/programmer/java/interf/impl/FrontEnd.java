package hika.programmer.java.interf.impl;

import hika.programmer.java.domain.Language;
import hika.programmer.java.domain.Library;
import hika.programmer.java.domain.Program;
import hika.programmer.java.interf.Paper;
import hika.programmer.java.interf.Programmer;

public abstract class FrontEnd<T extends Paper> extends Programmer<T> {
    protected Language language;
    protected Library library;

    @Override
    protected Program makeProgram(String code) {
        return new Program(code);
    }

    @Override public String toString() {
        return "FrontEnd{" +
            "language=" + language +
            ", library=" + library +
            '}';
    }
}