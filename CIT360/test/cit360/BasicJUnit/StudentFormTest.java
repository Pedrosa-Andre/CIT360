/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.BasicJUnit;

import java.util.Arrays;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andre Matheus
 */
public class StudentFormTest {
    
    public StudentFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // JUnit is simply a test framework where you can write multiple tests in 
    // Java. It allows you to easily analyze if a code is working by executing 
    // it in a controlled environment and comparing its outputs using assert 
    // methods.

    // The main assert methods of JUnit are:
    //
    // assertEquals -> comparte two values and check if they are of the same 
    //  type and the same value (comparable to using .equals() method)*
    // assertArrayEquals -> compare two arrays and check if they are equal
    // assertSame -> verifies if both parameters refers to the same object
    //  (comparable to using == operator)*
    // assertNotSame -> verifies if both parameters don't refer to the same object
    // assertTrue -> verifies if a given condition is true
    // assertFalse -> verifies if a given condition is false
    // assertNull -> verifies if a given parameter is null
    // assertNotNull -> verifies if a given parameter is not null
    // assertThat ->
    //
    // * it's important to notice that the default .equals() method must be 
    // overridden in new classes you create to work properly because its default
    // code simply uses a == operator. This means that unless you "teach" how
    // .equals() should compare the instances of a given created class the
    // .equals() will behave the same way as using the == operator, in other
    // words, assertEquals and assertSame will also behave identically.
    /**
     * Test of getAge method, of class                                                          o StudentForm.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        StudentForm instance = new StudentForm();
        int result = instance.getAge();
        int expResult = 0;
        // When just instantiated the defalt age is 0.
        // The assertSame here verifies if the instance age is equal 0
        assertSame(expResult, result);
   }

    /**
     * Test of setAge method, of class                                                            o StudentForm.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 5;
        StudentForm instance = new StudentForm();
        instance.setAge(age);
        int result = instance.getAge();
        // The setAge method lacks a condition to verify a minimun age (8). The
        // assertTrue method here helps to notice the code is incomplete because
        // dosen't return an error message, like 'return -1 if age <= 8'.
        assertTrue("Age must be bigger than 8", result == -1);
    }

    /**
     * Test of getfName method, of class StudentForm.
     */
    @Test
    public void testGetfName() {
        System.out.println("getfName");
        StudentForm instance = new StudentForm();
        String expResult = "";
        String result = instance.getfName();
        //
        assertEquals(expResult, result);
    }

    /**
     * Test of setfName method, of class StudentForm.
     */
    @Test
    public void testSetfName() {
        System.out.println("setfName");
        String fName = "";
        StudentForm instance = new StudentForm();
        instance.setfName(fName);
        //
    }

    /**
     * Test of getlName method, of class StudentForm.
     */
    @Test
    public void testGetlName() {
        System.out.println("getlName");
        StudentForm instance = new StudentForm();
        String expResult = "";
        String result = instance.getlName();
        //
        assertEquals(expResult, result);
    }

    /**
     * Test of setlName method, of class StudentForm.
     */
    @Test
    public void testSetlName() {
        System.out.println("setlName");
        String lName = "";
        StudentForm instance = new StudentForm();
        instance.setlName(lName);
        //
    }

    /**
     * Test of getBothNames method, of class StudentForm.
     */
    @Test
    public void testGetBothNames() {
        System.out.println("getBothNames");
        StudentForm instance = new StudentForm();
        String[] expResult = null;
        String[] result = instance.getBothNames();
        //
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setBothNames method, of class StudentForm.
     */
    @Test
    public void testSetBothNames() {
        System.out.println("setBothNames");
        String[] bothNames = null;
        StudentForm instance = new StudentForm();
        instance.setBothNames(bothNames);
        //
    }

    /**
     * Test of getGrade method, of class StudentForm.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        StudentForm instance = new StudentForm();
        String expResult = "";
        String result = instance.getGrade();
        //
        assertNull("woooooow", result);
    }

    /**
     * Test of setGrade method, of class StudentForm.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        String grade = "A";
        StudentForm instance = new StudentForm();
        instance.setGrade(grade);
        //Check if a given grade is among the possible grades using assertThat
        assertThat(Arrays.asList(instance.getPossibleGrades()),hasItem(instance.getGrade()));
    }

    /**
     * Test of getPossibleGrades method, of class                                                    o StudentForm.
     */
    @Test
    public void testGetPossibleGrades() {
        System.out.println("getPossibleGrades");
        StudentForm instance = new StudentForm();
        String[] expResult = {"A","B","C","D","F"};
        String[] result = instance.getPossibleGrades();
        // The default StudentForm gradePossibilities Array must be {"A","B","C","D","F"}
        // here I use assertArrayEquals to verify if it is instatiated correctly.
        
        // Test if the default possibleGrades is correctt by comparing with
        // expResult using assertArrayEquals.
        assertArrayEquals(expResult, result);
    }

}
