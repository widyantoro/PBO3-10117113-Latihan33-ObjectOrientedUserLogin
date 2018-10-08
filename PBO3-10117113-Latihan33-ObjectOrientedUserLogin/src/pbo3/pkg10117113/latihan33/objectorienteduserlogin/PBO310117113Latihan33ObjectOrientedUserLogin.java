/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan33.objectorienteduserlogin;

import java.util.Scanner;

/**
 *
 * Nama     : Eka Widyantoro
 * Kelas    : IF-3
 * NIM      : 10117113
 * Deskripsi Program : program ini berisi program untuk user login
 * 
 */
public class PBO310117113Latihan33ObjectOrientedUserLogin {

        private static String userName;
        private static String pw;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        userName = scn.next();

        System.out.print("Masukkan Password = ");
        pw = scn.next();

        User cek = new User();
        cek.pengecekkanLogin(userName,pw);

    }
    
}
