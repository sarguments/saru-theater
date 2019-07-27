package hika.programmer.java.domain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Director {
    private Map<String, Paper> projects = new HashMap<>();

    public void addProject(String name, Paper paper) {
        projects.put(name, paper);
    }

    public void runProject(String name) {
        if (!projects.containsKey(name)) throw new RuntimeException("no project");
        deploy(name, projects.get(name).run());
    }

    private void deploy(String projectName, Program... programs) {
        System.out.println(projectName);
        Arrays.stream(programs).forEach(s -> System.out.println(s.toString()));
    }
}