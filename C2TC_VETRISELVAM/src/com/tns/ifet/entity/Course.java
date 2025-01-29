//To define a entity class representing a Course
package com.tns.collegesystem.entity;

public class Course {
    private String courseName; // Name of the course

    // Default constructor that initializes a default course name
    public Course() {
        this.courseName = "Default Course"; // Default course name
    }
    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }
}
