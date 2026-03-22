package model;

public class Student {
    private String id;
    private String name;
    private String major;
    private String className;

    public Student(String id, String name, String major, String className) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getClassName() {
        return className;
    }
}