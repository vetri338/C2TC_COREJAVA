//To define a Service class for handling Student-related operations
package com.tns.collegesystem.service;

import com.tns.collegesystem.entity.Student;

public class StudentService {
    private Student student; // Student entity reference

    // Constructor that manually instantiates the Student entity
    public StudentService() {
        this.student = new Student(); // Manual instantiation (no injection)
    }

    // Method to display Student details
    public void displayStudentDetails() {
        System.out.println("Student ID: " + student.getStudentId()); // Display student ID
        System.out.println("Student Name: " + student.getStudentName()); // Display student name
    }
}
