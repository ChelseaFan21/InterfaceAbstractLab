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
public class CourseReportService {
     private String report = "";
    
    public void addInformation(String info){
        report = info;
    }
    public void outputReport(){
        System.out.println(report);
    }
    public void clearInformation(){
        report = "";
    }
}
