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
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double numberOfCredits;
    
 
    public Course(String courseName, String courseNumber, double numberOfCredits){
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setNumberOfCredits(numberOfCredits);
    }
    public String getCourseNumber(){
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber){
           if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    
    }
    
   
    public double getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(double numberOfCredits) {
        //have to take into account class audits and non credit classes.
        if(numberOfCredits >= 0.0 || numberOfCredits <= 5.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0 to 4.0");
            System.exit(0);
        }
        this.numberOfCredits = numberOfCredits;
    }
    
    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseName){
             if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
        
    } 
}
