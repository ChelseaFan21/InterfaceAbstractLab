package lab1;



/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends Course{
    private String prerequisites;
//    private CourseReportService newReport;

    public IntroJavaCourse(String courseName, String courseNumber, double numberOfCredits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setNumberOfCredits(numberOfCredits);
        this.setPrerequisites(prerequisites);
//        newReport = new CourseReportService();
    }
  
    // Left prerquisites in as not all classes have prerequisites. 
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
        throw new IllegalArgumentException("Error: prerequisites cannot be null of empty string");
            
        }
        this.prerequisites = prerequisites;
    }
//    public void javaContent(){
//        newReport.addInformation("In order to be apart of this class you must have completed Intro to programming.");
//    }
 

}
