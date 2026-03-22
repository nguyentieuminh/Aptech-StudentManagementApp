package model;

public class Grade {
    private String studentId;
    private String courseId;
    private double midterm;
    private double finalExam;

    public Grade(String studentId, String courseId, double midterm, double finalExam) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.midterm = midterm;
        this.finalExam = finalExam;
    }

    public double getAverage() {
        return (midterm + finalExam) / 2;
    }
}