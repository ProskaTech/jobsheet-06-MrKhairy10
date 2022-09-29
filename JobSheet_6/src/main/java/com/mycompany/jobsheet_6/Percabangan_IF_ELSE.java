/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

    * created by 21343083_Mubarakh Hayatna Khairy
*/

package com.mycompany.jobsheet_6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */

public class Percabangan_IF_ELSE {
    
    public static void main(String[] args) {
       double total_pembelian, diskon = 0;
       
       Scanner dataMasuk = new Scanner(System.in);
       System.out.print("Masukkan Total Pembelian: Rp ");
       total_pembelian = dataMasuk.nextDouble();
       
       if (total_pembelian >= 50000)
           diskon = 0.1 * total_pembelian;
       else
            diskon = 0.02 * total_pembelian;
       
       System.out.println("Besarnya diskon: Rp " + diskon);
    }
}