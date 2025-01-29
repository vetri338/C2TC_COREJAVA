//To define a entity class representing a College
package com.tns.collegesystem.entity;

public class College {
    private int collegeId; // ID of the college
    private String collegeName; // Name of the college

    // Default constructor that initializes default values
    public College() {
        this.collegeId = 1; // Default ID
        this.collegeName = "Default College"; // Default name
        System.out.println("constructor default"); // Message indicating the default constructor was called
    }

    // Getter for collegeId
    public int getCollegeId() {
        return collegeId;
    }

    // Getter for collegeName
    public String getCollegeName() {
        return collegeName;
    }
}
