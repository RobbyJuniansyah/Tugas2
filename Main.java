/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //      int Nilai = 52;
        //      char Grade;
        //      if (Nilai > 85) {
        //           Grade = 'A';
        //      } else if (Nilai > 70) {
        //          Grade = 'B';
        //       } else if (Nilai > 50) {
        //           Grade = 'C';
        //       } else if (Nilai > 40) {
        //           Grade = 'D';
        //       } else {
        //           Grade = 'E';
        //       }
        //       if (Grade == 'A') {
        //           System.out.println("NILAI ANDA A");
        //       } else if (Grade == 'B') {
        //           System.out.println("NILAI ANDA B");
        //      } else if (Grade == 'C') {
        //           System.out.println("NILAI ANDA C");
        //       } else if (Grade == 'D') {
        //           System.out.println("NILAI ANDA D");
        //       } else {
        //           System.out.println("TIDAK LULUS");
        //       }
        int Umur = 19;
        boolean Pintar = false;
        String Paras = "Jelek";
        char Grade;

        if (Umur <= 23) {
            Grade = 'A';
        } else if (Umur > 23) {
            Grade = 'B';
        } else {
            Grade = 'C';
        }

        if (Grade == 'A' && Pintar == true && Paras == "Cantik") {
            System.out.println("Pasti Menikah");
        } else if (Grade == 'A' && Paras == "Cantik") {
            System.out.println("Okee Lahh");
        } else if (Grade == 'B' && Paras == "Cantik") {
            System.out.println("Saya Pikir Dulu");
        } else {
            System.out.println("Nooo Waay");
        }
    }
}
