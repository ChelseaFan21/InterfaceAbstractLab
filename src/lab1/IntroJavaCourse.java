package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends Course{
    private String courseName;
    private String courseNumber;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }
    //Constructor for college class

    IntroJavaCourse(String courseName) {
        this.setCourseName(courseName);
    }
    // Overridden from course class
    @Override
    public String getCourseName() {
        return courseName;
    }
    // Overridden from course class.  I left this final because I didn't think the method would change much.
    @Override
    public final void setCourseName(String courseName) {
            if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    
    }
    // Overridden from course class
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }
    // Overridden from course class. Left final
    @Override
    public final void setCourseNumber(String courseNumber) {
        //encapsulate with validation
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    // Left prerquisites in as not all classes have prerequisites. 
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

 

}
