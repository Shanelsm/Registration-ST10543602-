/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class Registration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Login login = new Login();
        
        String username = "";
        String password = "";
        String cellPhoneNumber = "";
        System.out.println("==== REGISTRATION ====");
        
        //Stores first & last name for welcome message.
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        
        //Get users input.
        while(true){
        System.out.print("Enter username: ");
        username = input.nextLine();
        boolean usernameValid = login.checkUsername(username);  
        if (!usernameValid) {
        System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        } 
        else {
        System.out.println("Username successfully captured.");
        break;
            }
        }
        
        while(true){
        System.out.print("Enter password: ");
        password = input.nextLine();
        boolean passwordValid = login.checkPasswordComplexity(password);
        if (!passwordValid) {
        System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        } 
        else {
        System.out.println("Password successfully captured.");
        break;
            }
        }
        
        while(true){
        System.out.print("Enter cellphone number: ");
        cellPhoneNumber = input.nextLine();
        boolean cellPhoneNumberValid = login.checkCellPhoneNumber(cellPhoneNumber);
        if (!cellPhoneNumberValid) {
        System.out.println("Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.");
        } 
        else {
        System.out.println("Cell number successfully captured.");
        break;
            }
        }

        //Call register method to save user & show final registration.
        String registrationMessage = login.registerUser(username, password, cellPhoneNumber);
  
        System.out.println();
        System.out.println(registrationMessage);
        System.out.println();
        System.out.println("==== LOGIN ====");
        
        System.out.print("Enter username to login: ");
        String loginUsername = input.nextLine();
        System.out.print("Enter password to login: ");
        String loginPassword = input.nextLine();
        
        boolean loginSuccess = login.loginUser(username, password, loginUsername, loginPassword);
        
        String loginStatus = login.returnLoginStatus(loginSuccess, firstName, lastName);
        System.out.println(loginStatus);
    }
}