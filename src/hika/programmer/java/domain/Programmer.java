package hika.programmer.java.domain;

public abstract class Programmer<T extends Paper> {
    public Program getProgram(T paper) {
        setData(paper);

        System.out.println(paper);

        return makeProgram("이것은 코드다");
    }

    public abstract void setData(T paper);

    protected abstract Program makeProgram(String code);

    @Override public String toString() {
        return "나는 프로그래머 입니다.";
    }
}