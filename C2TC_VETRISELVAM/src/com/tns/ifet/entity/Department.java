//To define a entity class representing a Department
package com.tns.collegesystem.entity;

public class Department {
    private String departmentName; // Name of the department

    // Default constructor that initializes a default department name
    public Department() {
        this.departmentName = "Default Department"; // Default department name
    }
    // Getter for departmentName
    public String getDepartmentName() {
        return departmentName;
    }
}
