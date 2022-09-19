/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenugasanPerbandinganString;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class login {
    
    public static void main(String[] args) {
        String Nama;
        String Username;
        String Password;
        String Userlog;
        String Passlog;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("====================Masukkan=====================");
        System.out.print("Nama Lengkap :");
        Nama = in.nextLine();
        System.out.print("Username :");
        Username = in.nextLine();
        System.out.print("Password :");
        Password = in.nextLine();
        System.out.print("==========");
        
        if (Password.equals(Password)){
          System.out.println("===========Regesrasi Berhasil====================");
        } else { 
            System.out.println("====================Regesrasi Gagal====================");
    }
        System.out.println("====================Log in====================");
        System.out.print("Nama Lengkap :");
        Userlog = in.nextLine();
        System.out.print("Password :");
        Passlog = in.nextLine();
        
        if (Userlog.equals(Username)) {
            if (Passlog.equals(Username)) {
                System.out.println("====================Welcome Admin====================");
            } else {
                System.out.println("The Password True !");
            } 
            
        } else {
            System.out.println("The Password Wrong, Can You Reserve Again");
        
        }
        
}
    
}
