package hika.programmer.java.domain.impl;

import hika.programmer.java.domain.Language;
import hika.programmer.java.domain.Server;
import hika.programmer.java.domain.Paper;
import hika.programmer.java.domain.Programmer;

public abstract class ServerClient implements Paper {
    private Programmer backEndProgrammer;
    private Programmer frontEndProgrammer;

    protected Server server = new Server("test");
    protected Language backEndLanguage = new Language("java");
    protected Language frontEndLanguage = new Language("kotlinJS");

    public void setBackEndLanguage(Language backEndLanguage) {
        this.backEndLanguage = backEndLanguage;
    }

    public void setFrontEndLanguage(Language frontEndLanguage) {
        this.frontEndLanguage = frontEndLanguage;
    }

    public void setBackEndProgrammer(Programmer programmer) {
        backEndProgrammer = programmer;
    }

    public void setFrontEndProgrammer(Programmer programmer) {
        frontEndProgrammer = programmer;
    }

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