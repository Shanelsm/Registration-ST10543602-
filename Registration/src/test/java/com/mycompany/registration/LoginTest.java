/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUsername method, of class Login.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username = "Le_ru";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "@18Leruo18";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String cellPhoneNumber = "0769860640";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkCellPhoneNumber(cellPhoneNumber);
        assertEquals(expResult, result);

    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "Le_ru";
        String password = "@18Leruo18";
        String phone = "0769860640";
        Login instance = new Login();
        String expResult = "User is successfully registered";
        String result = instance.registerUser(username, password, phone);
        assertEquals(expResult, result);

    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String storedUsername = "Le_ru";
        String storedPassword = "@18Leruo18";
        String enteredUsername = "Le_ru";
        String enteredPassword = "@18Leruo18";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginUser(storedUsername, storedPassword, enteredUsername, enteredPassword);
        assertEquals(expResult, result);

    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loginStatus = true;
        String firstName = "Leruo";
        String lastName = "Matsubane";
        Login instance = new Login();
        String expResult = "Welcome "+ firstName + " " + lastName+ ", it is great to see you again.";
        String result = instance.returnLoginStatus(loginStatus, firstName, lastName);
        assertEquals(expResult, result);

    }
    
}
