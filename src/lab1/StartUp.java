/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author brandonstoiber
 */
public class StartUp {
    public static void main(String[] args) {
        AdvancedJavaCourse class1 = new AdvancedJavaCourse("Advanced Java", "150 - 1");
        IntroJavaCourse class2 = new IntroJavaCourse("Intro to Java", "110 - 1");
        IntroToProgrammingCourse class3 = new IntroToProgrammingCourse("Intro to Programming", "100 - 1");
        
        System.out.println("Advanced Java Course");
        //sets amount of credits for class
        class1.setCredits(4);
        // sets the prerequisites
        class1.setPrerequisites("Intro to Java");
        System.out.println(class1.getCourseName() + " " + class1.getCourseNumber() + " " + class1.getCredits() + " " + class1.getPrerequisites());
        
        System.out.println("Intro to Java");
        //sets amount of credits
        class1.setCredits(4);
        //sets prereqs.
        class1.setPrerequisites("Intro to Programming");
        System.out.println(class2.getCourseName() + " " + class2.getCourseNumber() + " " + class2.getCredits() + " " + class1.getPrerequisites());
        
        System.out.println("Intro to Programming");
        class3.setCredits(2);
        System.out.println(class3.getCourseName() + " " + class3.getCourseNumber() + " " + class3.getCredits());
        
        College newCollege = new College();
        newCollege.addCollegeCourse("Intro to Java");
        newCollege.addCollegeCourse("Advanced Java");
        newCollege.addCollegeCourse("Intro to Programming");
      
              
    }
}
