package hika.programmer.java;

import hika.programmer.java.domain.Director;
import hika.programmer.java.domain.Program;
import hika.programmer.java.interf.Programmer;
import hika.programmer.java.interf.impl.BackEnd;
import hika.programmer.java.interf.impl.Client;
import hika.programmer.java.interf.impl.FrontEnd;
import hika.programmer.java.interf.impl.ServerClient;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.addProject("여행사A 프론트개편", new Client() {
            @Override
            public Program[] run() {
                FrontEnd<Client> frontEnd = new FrontEnd<>() {
                    @Override
                    public void setData(Client paper) {
                        library = paper.getLibrary();
                        language = paper.getLanguage();
                    }
                };

                setProgrammer(frontEnd);

                return new Program[]{frontEnd.getProgram(this)};
            }
        });

        director.runProject("여행사A 프론트개편");

        //----------------------------------------------------------------------------------------

        director.addProject("xx은행 리뉴얼", new ServerClient() {
            @Override
            public Program[] run() {
                Programmer<ServerClient> frontEnd = new FrontEnd<>() {
                    @Override public void setData(ServerClient paper) {language = paper.getFrontEndLanguage();}
                };
                Programmer<ServerClient> backEnd = new BackEnd<>() {
                    @Override public void setData(ServerClient paper) {
                        server = paper.getServer();
                        language = paper.getBackEndLanguage();
                    }
                };

                setFrontEndProgrammer(frontEnd);
                setBackEndProgrammer(backEnd);

                return new Program[]{frontEnd.getProgram(this), backEnd.getProgram(this)};
            }
        });
        director.runProject("xx은행 리뉴얼");
    }
}