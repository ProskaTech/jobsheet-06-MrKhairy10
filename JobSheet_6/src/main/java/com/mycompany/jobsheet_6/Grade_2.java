/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
    
    * created by 21343083_Mubarakh Hayatna Khairy
*/

package com.mycompany.jobsheet_6;

/**
 *
 * @author ASUS
 */

public class Grade_2 {
    
      public static void main(String[] args) {
        int grade = 92;
        
        switch(grade){
            case 100:
                System.out.println("Excellent!");
                break;
            case 90:
                System.out.println("Good Job!");
                break;
            case 80:
                System.out.println("Study Harder!");
                break;
            default:
                System.out.println("Sorry, You Failed.");
        }
    }    
}
