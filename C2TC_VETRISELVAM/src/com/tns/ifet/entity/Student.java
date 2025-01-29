//To define a entity class representing a Student
package com.tns.collegesystem.entity;

public class Student {
    private int studentId; // Student's unique ID
    private String studentName; // Student's name

    // Default constructor that initializes a default student ID and name
    public Student() {
        this.studentId = 101; // Default ID for the student
        this.studentName = "Default Student"; // Default name for the student
    }

    // Getter for studentId
    public int getStudentId() {
        return studentId;
    }

    // Getter for studentName
    public String getStudentName() {
        return studentName;
    }
}
