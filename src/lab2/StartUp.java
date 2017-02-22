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
public class StartUp {
    public static void main(String[] args) {
        AdvancedJavaCourse class1 = new AdvancedJavaCourse("Advanced Java", "150 - 1", 3, "Intro to Java");
        IntroJavaCourse class2 = new IntroJavaCourse("Intro to Java", "110 - 1", 3, "Intro to Programming");
        IntroToProgrammingCourse class3 = new IntroToProgrammingCourse("Intro to Programming", "100 - 1", 2);
        
        System.out.println("Advanced Java Course");
        System.out.println("\n" + class1.getCourseName() + ", " + class1.getCourseNumber() + ", " + class1.getCredits() + ", " + class1.getPrerequisites() + "\n");
        
        System.out.println("Intro to Java");
        System.out.println("\n" + class2.getCourseName() + ", " + class2.getCourseNumber() + ", " + class2.getCredits() + ", " + class2.getPrerequisites() + "\n");
        
        System.out.println("Intro to Programming");
        System.out.println("\n" + class3.getCourseName() + ", " + class3.getCourseNumber() + ",  " + class3.getCredits() + "\n");
        
        lab1.College newCollege = new lab1.College();
        
        newCollege.addCollegeCourse("Intro to Java");
        newCollege.addCollegeCourse("Advanced Java");
        newCollege.addCollegeCourse("Intro to Programming");
        
   
       newCollege.displayCourses();
       
      
              
    }
}

