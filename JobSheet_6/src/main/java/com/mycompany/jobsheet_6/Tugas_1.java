/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

    * created by 21343083_Mubarakh Hayatna Khairy
*/

package com.mycompany.jobsheet_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author ASUS
 */

public class Tugas_1 {
    public static void main(String[]args){
        BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
        String a="";
        String b="";
        String c="";

        try{
            System.out.print("Masukkan nilai pertama Anda: ");
            a = nilai.readLine();
            System.out.print("Masukkan nilai kedua Anda: ");
            b = nilai.readLine();
            System.out.print("Masukkan nilai ketiga Anda: ");
            c = nilai.readLine();
        }
        
        catch(IOException e){
        System.out.println("Kata yang Anda masukkan salah, silahkan coba lagi.");
        }
        
        int pertama;
        int kedua;
        int ketiga;

        pertama = Integer.parseInt(a);
        kedua = Integer.parseInt(b);
        ketiga = Integer.parseInt(c);

        int rata_rata = (pertama + kedua + ketiga) / 3;

        System.out.println("Rata-rata nilai Anda: " + rata_rata);

        if (rata_rata<=60){
            System.out.println(":-(");
        }
        else {
            System.out.println(":-)");
        }
   }
}