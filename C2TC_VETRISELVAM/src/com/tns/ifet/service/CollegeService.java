//To define a Service class for handling College-related operations
package com.tns.collegesystem.service;

import com.tns.collegesystem.entity.College;

public class CollegeService {
    private College college; // College entity reference

    // Constructor that manually instantiates the College entity
    public CollegeService() {
        this.college = new College(); // Manual instantiation (no injection)
    }

    // Method to display College details
    public void displayCollegeDetails() {
        System.out.println("College ID: " + college.getCollegeId()); // Display college ID
        System.out.println("College Name: " + college.getCollegeName()); // Display college name
    }
}
