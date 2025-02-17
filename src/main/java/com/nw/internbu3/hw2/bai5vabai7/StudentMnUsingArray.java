package com.nw.internbu3.hw2.bai5vabai7;

import java.util.Arrays;

public class StudentMnUsingArray {
    private static StudentMnUsingArray instance;
    private Student[] students;
    private int length;

    private StudentMnUsingArray() {
        students = new Student[1];
        length = 0;
    }

    public static StudentMnUsingArray getInstance() {
        if (instance == null) {
            instance = new StudentMnUsingArray();
        }
        return instance;
    }

    // Tăng chiều dài mảng lên x2
    private void allocateMore() {
        Student[] newArray = new Student[2 * this.students.length];
        System.arraycopy(this.students, 0, newArray, 0, this.students.length);
        this.students = newArray;
    }

    // Thêm phần tử vào mảng
    public void append(Student student) {
        if (this.length >= this.students.length) {
            allocateMore();
        }

        this.students[this.length] = student;
        this.length++;
    }
    public Student[] bestScore() {
        if (this.length == 0) {
            return null;
        }

        // Bước 1: Tìm điểm số cao nhất
        double bestScore = students[0].getScore();
        for (int i = 1; i < length; i++) {
            if (students[i].getScore() > bestScore) {
                bestScore = students[i].getScore();
            }
        }

        // Bước 2: Đếm số sinh viên có điểm cao nhất
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (students[i].getScore() == bestScore) {
                count++;
            }
        }

        // Bước 3: Tạo mảng có kích thước đúng
        Student[] bestStudents = new Student[count];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (students[i].getScore() == bestScore) {
                bestStudents[index++] = students[i]; // Lưu sinh viên vào mảng
            }
        }

        return bestStudents;
    }

    public Student[] sortUsingScore() {
        Student[] newArray = new Student[length];
        System.arraycopy(this.students, 0, newArray, 0, this.length);
        for (int i = 0; i < this.length - 1; i++) {
            for (int j = i + 1; j < this.length; j++) {
                if (newArray[i].getScore() > newArray[j].getScore()) {
                    Student temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }


    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "StudentMnUsingArray{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
