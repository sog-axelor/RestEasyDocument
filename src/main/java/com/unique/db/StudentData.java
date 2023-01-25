package com.unique.db;

import java.util.Arrays;
import java.util.List;

public class StudentData {
	
    private static final List<Student> students = Arrays.asList(
        new Student(1, "John ", "Doe"),
        new Student(2, "Jane ", "Smith"));

    public static List<Student> getStudents() {
        return students;
    }

    public static Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
