package com.nw.internbu3.hw2.bai5vabai7;

import java.util.Arrays;

public class TestHw5 {
    public static void main(String[] args) {
        // Array
        StudentMnUsingArray studentMn = StudentMnUsingArray.getInstance();
        studentMn.append(new Student("Minh", 7.5));
        studentMn.append(new Student("Lan", 8.9));
        studentMn.append(new Student("An", 6.2));
        studentMn.append(new Student("Khan", 8.9));
        studentMn.append(new Student("Mah", 8.9));
        studentMn.append(new Student("Maah", 6.2));
        System.out.println(Arrays.toString(studentMn.bestScore()));
        System.out.println(Arrays.toString(studentMn.sortUsingScore()));
        //List
        StudentMnUsingList studentManager = StudentMnUsingList.getInstance();
        studentManager.addStudent(new Student("Lan", 9.0));
        studentManager.addStudent(new Student("Tùng", 7.5));
        studentManager.addStudent(new Student("An", 9.0));
        studentManager.addStudent(new Student("Khan", 8.9));
        studentManager.addStudent(new Student("Mah", 8.9));
        studentManager.addStudent(new Student("Maah", 6.2));
        System.out.println(studentManager.getBestStudents());
        System.out.println(studentManager.getSortedStudentsByScore());
        //Bai 7
        StudentExercise7[] exercise7s = new StudentExercise7[studentMn.getLength()];
        for (int i = 0; i < studentMn.getLength(); i++) {
            exercise7s[i] = new StudentExercise7(studentMn.getStudents()[i].getName(), studentMn.getStudents()[i].getScore());
        }
        System.out.println(Arrays.toString(exercise7s));
    }
}
