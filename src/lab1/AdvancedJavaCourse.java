package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course{
    private String courseName;
    private String courseNumber;
    private String prerequisites;

    
    //Constructor for College
    public AdvancedJavaCourse(String courseName){
        this.setCourseName(courseName);
    }
    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    // Left prerequisites in this class because it isn't part of other courses
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    // overridden because its abstract in course.
    @Override
    public String getCourseName() {
        return courseName;
    }
    // overriden from course class
    @Override
    public final void setCourseName(String courseName) {
         if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    // overridden in course class
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }
    // overridden in course class.
    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
}
