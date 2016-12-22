package pk.edu.nust.seecs.gradebook;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import pk.edu.nust.seecs.gradebook.dao.CloDao;
import pk.edu.nust.seecs.gradebook.dao.ContentDao;
import pk.edu.nust.seecs.gradebook.dao.CourseDao;
import pk.edu.nust.seecs.gradebook.dao.GradeDao;
import pk.edu.nust.seecs.gradebook.dao.StudentDao;
import pk.edu.nust.seecs.gradebook.dao.TeacherDao;
import pk.edu.nust.seecs.gradebook.entity.Clo;
import pk.edu.nust.seecs.gradebook.entity.Course;
import pk.edu.nust.seecs.gradebook.entity.Teacher;

/**
 * My main Application. 
 * <p>
 This executes everything.
 */

public class App {

    
    public static void addClo(CloDao obj)
    {
        Scanner myreader = new Scanner(System.in);
        System.out.println("Enter name of clo"); 

        String a = myreader.nextLine();
        // Add new clo
        Clo clo = new Clo();
        clo.setName(a);
        System.out.println("Enter description of clo"); 

        String b = myreader.nextLine();
        clo.setDescription(b);
        System.out.println("Enter PLO");
        String c = myreader.nextLine();
        clo.setPlo(c);
        
        obj.addClo(clo);

        
    }
    public static void updateClo(CloDao obj)
    {
        
        Scanner myreader = new Scanner(System.in);
        System.out.println("Enter name of clo"); 

        String a = myreader.nextLine();
        // Add new clo
        Clo clo = new Clo();
        clo.setName(a);
        System.out.println("Enter description of clo"); 

        String b = myreader.nextLine();
        clo.setDescription(b);
        System.out.println("Enter PLO");
        String c = myreader.nextLine();
        clo.setPlo(c);
        
        obj.updateClo(clo);
    }
    
    public static void addTeacher(TeacherDao obj)
    {
        Scanner myreader = new Scanner(System.in);
        System.out.println("Enter teacher name"); 

        String a = myreader.nextLine();
        // Add new clo
        Teacher teach = new Teacher();
        teach.setName(a);
        System.out.println("Enter no of courses"); 
        int av = myreader.nextInt();
        Set<Course> newcourses = new HashSet<>(0);
        for(int i=0; i<av;i++)
        {
            Course newcourse = new Course();
            for(int j=0; j<av;j++)
            {
                System.out.println("Enter course name"); 
                
                String title = myreader.nextLine();
                newcourse.setClasstitle(title);
                
                System.out.println("Enter credit hours"); 
                
                int hrs = myreader.nextInt();
                newcourse.setCreditHours(hrs);
     
            }
            
            
            newcourses.add(newcourse);
        }
        teach.setCourses(newcourses);
        
        
        
        obj.addTeacher(teach);
    }
    
    public static void updateTeacher(TeacherDao obj)
    {
        Scanner myreader = new Scanner(System.in);
        System.out.println("Enter teacher name"); 

        String a = myreader.nextLine();
        // Add new clo
        Teacher teach = new Teacher();
        teach.setName(a);
        System.out.println("Enter no of courses"); 
        int av = myreader.nextInt();
        Set<Course> newcourses = new HashSet<>(0);
        for(int i=0; i<av;i++)
        {
            Course newcourse = new Course();
            for(int j=0; j<av;j++)
            {
                System.out.println("Enter course name"); 
                
                String title = myreader.nextLine();
                newcourse.setClasstitle(title);
                System.out.println("Enter credit hours"); 
                
                int hrs = myreader.nextInt();
                newcourse.setCreditHours(hrs);
     
            }
            
            
            newcourses.add(newcourse);
        }
        teach.setCourses(newcourses);
        
        
        
        obj.updateTeacher(teach);
    }
    
    public static void addCourse(CourseDao obj)
    {
        Scanner myreader = new Scanner(System.in);
        
 
        
        
            Course newcourse = new Course();
            
                System.out.println("Enter course name");

        String title = myreader.nextLine();
        newcourse.setClasstitle(title);
        System.out.println("Enter credit hours");

        int hrs = myreader.nextInt();
        newcourse.setCreditHours(hrs);
     
        
            
            
        
        
        
        
        
        obj.addCourse(newcourse);
    }
    
    public static void updateCourse(CourseDao obj)
    {
        Scanner myreader = new Scanner(System.in);
        
 
        
        
            Course newcourse = new Course();
            
                System.out.println("Enter course name");

        String title = myreader.nextLine();
        newcourse.setClasstitle(title);
        System.out.println("Enter credit hours");

        int hrs = myreader.nextInt();
        newcourse.setCreditHours(hrs);
     
        
            
            
        
        
        
        
        
        obj.updateCourse(newcourse);
    }
    
    
    public static void main(String[] args) {
        
        
        
       
        // Delete an existing clo
        //dao.deleteClo(1);
        Scanner reader = new Scanner(System.in); // Reading from System.in 
        System.out.println("Choose a process"); 
        System.out.println("1. Add clo"); 
        System.out.println("2. update clo"); 
        System.out.println("3. Add course");
        System.out.println("4. update course"); 
        System.out.println("5. Add teacher"); 
        System.out.println("6. update teacher"); 
        System.out.println("7. Add student"); 
        System.out.println("8. update student"); 
        System.out.println("9. add content"); 
        System.out.println("10. update content"); 
        System.out.println("11. add grades"); 
        System.out.println("12. update grades"); 
        System.out.println("Enter a number: "); 
        int a = reader.nextInt();
        CloDao clodao = new CloDao();
        TeacherDao tdao = new TeacherDao();
        StudentDao stddao = new StudentDao();
        GradeDao gdao = new GradeDao();
        CourseDao cdao = new CourseDao();
        ContentDao contdao = new ContentDao();
        switch(a)
                {
            case 1:
                 addClo(clodao);
                 break;
            case 2:
                 updateClo(clodao);
                 break;
            case 3:
                addCourse(cdao);
                break;
            case 4:
                updateCourse(cdao);
                break;
            case 5:
                addTeacher(tdao);
                break;
            case 6:
                updateTeacher(tdao);
                break;
            default:
                break;
                }
        // Get all clos
        for (Clo iter : clodao.getAllClos()) {
            System.out.println(iter);
        }

        // Get clo by id
        System.out.println(clodao.getCloById(1));

        
    }

}