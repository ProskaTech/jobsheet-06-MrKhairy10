/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
    * created by 21343083_Mubarakh Hayatna Khairy

*/

package com.mycompany.jobsheet_6;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */

public class Tugas_2b {
    public static void main(String[]args){
        String angka = "";
        angka = JOptionPane.showInputDialog("Silakan masukkan angka ");
        int b = Integer.valueOf(angka).intValue();
   
        String hasil="";
        switch(b){
            case 1:
                hasil+= "Valid Number"; 
                break;
            case 2:
                hasil+= "Valid Number"; 
                break;
            case 3:
                hasil+= "Valid Number"; 
                break;
            case 4: 
                hasil+= "Valid Number"; 
                break;
            case 5: 
                hasil+= "Valid Number"; 
                break;
            case 6: 
                hasil+= "Valid Number"; 
                break;
            case 7: 
                hasil+= "Valid Number"; 
                break;
            case 8: 
                hasil+= "Valid Number"; 
                break;
            case 9: 
                hasil+= "Valid Number"; 
                break;
            case 10: 
                hasil+= "Valid Number"; 
                break;
            default: 
                hasil+= "Invalid Number"; 
                break;
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}

