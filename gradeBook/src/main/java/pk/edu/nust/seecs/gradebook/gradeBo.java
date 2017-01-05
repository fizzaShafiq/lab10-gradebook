/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook;

import java.util.Scanner;
import pk.edu.nust.seecs.gradebook.dao.GradeDao;
import pk.edu.nust.seecs.gradebook.entity.Grade;

/**
 *
 * @author shafiq
 */
public interface gradeBo {
    
    /**
     *
     * @param obj
     */
    public void addGrade(String name, int score);
    
   
}
