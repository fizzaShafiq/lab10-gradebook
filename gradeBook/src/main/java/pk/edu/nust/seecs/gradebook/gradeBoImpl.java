/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import pk.edu.nust.seecs.gradebook.dao.GradeDao;
import pk.edu.nust.seecs.gradebook.entity.Grade;


public class gradeBoImpl implements gradeBo {
     @Autowired
    
    GradeDao grdobj;
    
   @Override
     public void addGrade(String name, int score)
    {
        
        Grade grd = new Grade();
       // System.out.println("Enter grade");

        grd.setName(name);
       // System.out.println("Enter score");

        grd.setScore(score);
    
        grdobj.addGrade(grd);
    }
}
