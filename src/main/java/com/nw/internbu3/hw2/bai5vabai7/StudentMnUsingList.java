package com.nw.internbu3.hw2.bai5vabai7;

import java.util.ArrayList;
import java.util.List;

public class StudentMnUsingList {
    private static StudentMnUsingList instance;
    private List<Student> students;

    private StudentMnUsingList() {
        students = new ArrayList<>();
    }

    public static StudentMnUsingList getInstance() {
        if (instance == null) {
           instance = new StudentMnUsingList();
        }
        return instance;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public List<Student> getBestStudents() {
        if (students.isEmpty()) {
            return new ArrayList<>();
        }

        double bestScore = students.stream()
                .mapToDouble(Student::getScore)
                .max()
                .orElse(Double.MIN_VALUE);

        List<Student> bestStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getScore() == bestScore) {
                bestStudents.add(student);
            }
        }
        return bestStudents;
    }

    public List<Student> getSortedStudentsByScore() {
        List<Student> sortedList = new ArrayList<>(students);
        int n = sortedList.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedList.get(j).getScore() > sortedList.get(j + 1).getScore()) {
                    // Hoán đổi
                    Student temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j + 1));
                    sortedList.set(j + 1, temp);
                }
            }
        }
        return sortedList;
    }
}
