package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course{
    private String courseName;
    private String courseNumber;
    

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super();
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    // constructor for college
    public IntroToProgrammingCourse(String courseName){
        this.setCourseName(courseName);
    }
    // overridden from course class
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }
    // overridden from course class.  Left final as this shouldn't change to much.
    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    // overridden from course class
    @Override
    public String getCourseName() {
        return courseName;
    }
    // overridden from course class. left final as this shouldn't change to much.
    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    
}
