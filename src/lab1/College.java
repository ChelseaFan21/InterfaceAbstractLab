/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;

/**
 *
 * @author brandonstoiber
 */
public class College {
 private ArrayList<String> courses;

    //
    public College(){
     courses = new ArrayList();
    }
    // It works right now but I'm not sure I would be able to call the list of classes up. 
    public void addCollegeCourse(String courseName){
        //AdvancedJavaCourse newAdvance = new AdvancedJavaCourse(courseName);
       // IntroJavaCourse newJava = new IntroJavaCourse(courseName);
        //IntroToProgrammingCourse newProg = new IntroToProgrammingCourse(courseName);
       // newAdvance.setCourseName(courseName);
       // newJava.setCourseName(courseName);
       // newProg.setCourseName(courseName);
        courses.add(courseName);
        System.out.println(courseName + " has been added to the inventory");
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
    
  


 
 
    


 
    
   
    
}
