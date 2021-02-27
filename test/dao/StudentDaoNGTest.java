/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Domain.NewHibernateUtil;
import java.time.LocalDate;
import java.time.Month;
import operation.AbstractTestClass;
import operation.CommonOperation;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author bitwayiki
 */

public class StudentDaoNGTest {
    @Test
    public StudentDaoNGTest() {
    }

    @BeforeTest
    public void init() {
        NewHibernateUtil.getSessionFactory();
    }

    @BeforeMethod
    public void initiateTest() {
        AbstractTestClass.execute(CommonOperation.POPULATE_ALL_TABLE);
    }

    @AfterMethod
    public void cleanTest() {
        AbstractTestClass.execute(CommonOperation.DELETE_ALL_ROW);
    }
     @Test
    public void testSomeMethod() {
    }

    
    

}
