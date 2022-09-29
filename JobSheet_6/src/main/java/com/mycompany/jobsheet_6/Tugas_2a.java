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

public class Tugas_2a {
    
    public static void main(String[]args){
        String angka ="";
        angka = JOptionPane.showInputDialog("Silahkan masukkan angka ");
        int a = Integer.valueOf(angka).intValue();
   
        String hasil ="";
        if (a >= 1 && a <= 10){
            hasil += "Valid number";
        }
        else{
            hasil += "Invalid Number";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
