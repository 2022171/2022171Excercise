/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2022171excercise;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner myKB = new Scanner(System.in);
        
        String name;
        int age;
        
        System.out.println("What is your name");
        
        name = myKB.nextLine();
        
        System.out.println("What is your age?");
        
        age = myKB.nextInt();
    }
    
    
    
}
