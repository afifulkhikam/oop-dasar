/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eksepsi;

/**
 *
 * @author Putri
 */
public class Exception {
public static void main(String[]args){
    int pembilang = 2;
    int penyebut = 0;
try {
    int hasil = pembilang / penyebut;
    System.out.println("Hasil  = " + hasil);    
} catch (Exception e) {   
}
System.out.println("Statement Setelah blok try-catch");
    }
}     
