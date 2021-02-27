/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DataBaseDao.CourseDao;
import Domain.Course;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author bitwayiki
 */
@ManagedBean
@SessionScoped
public class CourseModel {

    private Course course = new Course();
    

    private boolean updateCourse = false;

    

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    

  

    public boolean isUpdateCourse() {
        return updateCourse;
    }

    public void setUpdateCourse(boolean updateCourse) {
        this.updateCourse = updateCourse;
    }

    public String registerCourse() {
        try {

            CourseDao.createCourse(course);
            FacesContext.getCurrentInstance()
                    .addMessage(
                            null,
                            new FacesMessage(course.getCode() + " ", course.getCode() + ""));
        } catch (Exception e) {
            FacesContext.getCurrentInstance()
                    .addMessage(
                            null,
                            new FacesMessage("", ""));
        }
        course = new Course();
        return "Course.xhtml?faces-redirect=true";
    }

  
    

  

   

}
