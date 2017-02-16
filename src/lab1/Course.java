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
    private double credits;
    
   // I felt getCourseNumber should be abstract because course number can change.
    public abstract String getCourseNumber();

    public abstract void setCourseNumber(String courseNumber);
    // I was up in the air about credits.  I felt like these were less likely to change. 
    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        //have to take into account class audits and non credit classes.
        if(credits < 0.0 || credits > 5.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    // I felt courseName was something that could change or could be different between two programs.  
    public abstract String getCourseName();

    public abstract void setCourseName(String courseName); 
}
