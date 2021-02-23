/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseDao;


import Domain.Course;
import Domain.NewHibernateUtil;
import java.util.List;


import org.hibernate.Session;


/**
 *
 * @author bitwayiki
 */
public class CourseDao {
     private static  Session session;
    public static  Course createCourse(Course c){
        session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();
        session.close();
        return c;
    }
      
      public  Course update(Course c){
        session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(c);
        session.getTransaction().commit();
        session.close();
        return c;
    }
    
 
    
    public static Course delete(Course c){
        session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(c);
        session.getTransaction().commit();
        session.close();
        return c;
    }
    
    
    public static List<Course> findAllCourses(){
        
        session = NewHibernateUtil.getSessionFactory().openSession();
        List<Course> courses= session.createQuery("From Course").list();
        session.close();
        return courses;
    }
      
}
