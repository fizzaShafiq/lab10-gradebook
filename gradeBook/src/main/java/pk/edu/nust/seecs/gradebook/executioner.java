/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author shafiq
 */
public class executioner{
    
    public static void main(String[] args) {
        executioner admin = new executioner();
        Thread t = new Thread((Runnable) admin);
        t.start();
    }

    public executioner(){
        
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        gradeBo gradeManager = applicationContext.getBean("gradeManager",gradeBo.class);
        
        //Executioner admin = new Executioner();
        Integer grade1 = gradeManager.addGrade("A", 15);
        this.add(gradeManager.addGrade("B", 7));
       
    }
   

    @Override
    public void run() {
        this.setVisible(true);
    }
    
}
