package com.nw.internbu3.hw2.bai5vabai7;

public class StudentExercise7 extends Student{
    private Grade grade;
    public StudentExercise7(String name, double score) {
        super(name, score);
        this.grade =classify(score);
    }

    private Grade classify(double score) {
        if (score >= 8.5) return Grade.EXCELLENT;
        if (score >= 7.0) return Grade.GOOD;
        if (score >= 5.0) return Grade.AVERAGE;
        return Grade.WEAK;
    }
    public Grade getGrade() {
        return grade;
    }

    @Override
    public void setScore(double score) {
        super.setScore(score);
        this.grade =classify(score);
    }

    @Override
    public String toString() {
        return "{" + super.toString() +
                " grade=" + grade +
                '}';
    }
}
