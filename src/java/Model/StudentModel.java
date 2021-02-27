/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DataBaseDao.CourseDao;
import DataBaseDao.StudentDao;
import Domain.Course;
import Domain.Student;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author bitwayiki
 */
@ManagedBean
@SessionScoped
public class StudentModel {

    private Student student = new Student();
    private List<Student> students = StudentDao.findAll();
    
    private String studentName = "";
    private int amount = 0;

    private List<Course> courses = CourseDao.findAllCourses();
    private List<Course> selectedCourses = new ArrayList<>();

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addSelectedCourse(Course c) {
        selectedCourses.add(c);

    }

    public void removeSelectedCourse(Course c) {
        selectedCourses.remove(c);

    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String deleteCourse(Course c) {
        selectedCourses.remove(c);
        return "Course.xhtml?faces-redirect=true";
    }

    public List<Course> getSelectedCourses() {
        return selectedCourses;
    }

    public void setSelectedCourses(List<Course> selectedCourses) {
        this.selectedCourses = selectedCourses;
    }
    
    public int totalCredit(){
        int i = 0;
        for (Course sc : selectedCourses) {
            i += sc.getCredits();
        }
        return i;
    }
    
    public int totalAmount(){
        int i = 0;
        for (Course sc : selectedCourses) {
            i += sc.getCredits() * 15000;
        }
        return i;
    }
    
    public String registerCourse(){
        
        try {
            student.setCourses(selectedCourses);
            StudentDao.createStudent(student);
            
            
            
            studentName = student.getName();
            amount = totalAmount();
            
            student = new Student();
            selectedCourses = new ArrayList<>();
            
            return "RegistrationFeedBack.xhtml?faces-redirect=true";
        } catch (Exception e) {
            e.printStackTrace();
            return "Course.xhtml?faces-redirect=true";
        }
        
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    

}
