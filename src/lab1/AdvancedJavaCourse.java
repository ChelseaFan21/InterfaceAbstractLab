/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author brandonstoiber
 */
public class AdvancedJavaCourse extends Course {
     private String prerequisites;
    // private CourseReportService newReport;
     
     // get rid of super and use setter methods for super.
    public AdvancedJavaCourse(String courseName, String courseNumber, double numberOfCredits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setNumberOfCredits(numberOfCredits);
        this.setPrerequisites(prerequisites);
       // newReport = new CourseReportService();
    }
    // prerequisites belong in superclass
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Error: prerequisites cannot be null of empty string");
           
        }
        this.prerequisites = prerequisites;
    }
    // variation - reason for subclasses
//    public void advancedContent(){
//        newReport.addInformation("The content in this course is more challenging than "
//                + "Introduction to Java.");
//    }



}
