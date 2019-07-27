package hika.programmer.java.domain.impl;

import hika.programmer.java.domain.Language;
import hika.programmer.java.domain.Server;
import hika.programmer.java.domain.Paper;
import hika.programmer.java.domain.Programmer;

public abstract class ServerClient implements Paper {
    protected Programmer backEndProgrammer;
    protected Programmer frontEndProgrammer;

    private Server server = new Server("test");
    private Language backEndLanguage = new Language("java");
    private Language frontEndLanguage = new Language("kotlinJS");

    public Server getServer() {
        return server;
    }

    public Language getBackEndLanguage() {
        return backEndLanguage;
    }

    public Language getFrontEndLanguage() {
        return frontEndLanguage;
    }

    @Override public String toString() {
        return "ServerClient{" +
            "backEndProgrammer=" + backEndProgrammer +
            ", frontEndProgrammer=" + frontEndProgrammer +
            ", server=" + server +
            ", backEndLanguage=" + backEndLanguage +
            ", frontEndLanguage=" + frontEndLanguage +
            '}';
    }
}