package com.tns.collegesystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tns.collegesystem.service.CollegeService;
import com.tns.collegesystem.service.StudentService;

public class App {
    public static void main(String[] args) {
        // Load Spring IoC Container from the applicationContext.xml file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the beans for CollegeService and StudentService using their id
        CollegeService collegeService = (CollegeService) context.getBean("collegeService");
        StudentService studentService = (StudentService) context.getBean("studentService");

        // Get the second CollegeService bean using its generated name (default name)
        CollegeService collegeService1 = (CollegeService) 
        		context.getBean("com.tns.collegesystem.service.CollegeService#0");
        
        CollegeService collegeService2 = (CollegeService) 
        		context.getBean("com.tns.collegesystem.service.CollegeService#1");
     
        CollegeService collegeService3 = (CollegeService) 
        		context.getBean("com.tns.collegesystem.service.CollegeService#2");
       
        // Display the college details using the CollegeService bean
        collegeService.displayCollegeDetails();

        // Display the student details using the StudentService bean
        studentService.displayStudentDetails();
        
        // Display details using the second CollegeService bean (default name)
        collegeService1.displayCollegeDetails();
        
        collegeService2.displayCollegeDetails();
        
        collegeService3.displayCollegeDetails();    
        
    }
}
