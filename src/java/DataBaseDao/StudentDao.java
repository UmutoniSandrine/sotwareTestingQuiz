/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseDao;


import Domain.NewHibernateUtil;
import Domain.Student;

import java.util.List;
import org.hibernate.Session;


/**
 *
 * @author bitwayiki
 */
public class StudentDao {
    
     private static Session session;
      public static Student createStudent(Student student){
        session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
        return student;
    }
      
      public static Student update(Student student){
        session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(student);
        session.getTransaction().commit();
        session.close();
        return student;
    }
    
 
    
    public static Student delete(Student student){
        session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(student);
        session.getTransaction().commit();
        session.close();
        return student;
    }
    
    
    public static List<Student> findAll(){
        session = NewHibernateUtil.getSessionFactory().openSession();
        List<Student> students = session.createQuery("From Student").list();
        session.close();
        return students;
    }
    
    

    
    
}
