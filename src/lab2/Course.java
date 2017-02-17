/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author brandonstoiber
 */
public interface Course {
    //abstract getter methods
    public abstract String getCourseNumber();
    public abstract String getCourseName();
    public abstract double getNumberOfCredits();
    
    //abstract setter methods
    public abstract void setCourseNumber(String courseNumber);
    public abstract void setCourseName(String courseName);
    public abstract void setNumberOfCredits(double numberOfCredits);
    
}
