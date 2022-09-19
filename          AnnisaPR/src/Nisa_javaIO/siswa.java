/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nisa_javaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class siswa {
    static ArrayList listsiswa = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    private static Object listSiswa;
    
    static void showMenu() throws IOException{
        
        System.out.println("========== PILIH MENU ==========");
        System.out.println("[1] Tampilkan Semua Siswa");
        System.out.println("[2] Tambahkan Siswa");
        System.out.println("[3] Edit Siswa");
        System.out.println("[4] Hapus Siswa");
        System.out.println("[5] Keluar");
        System.out.println("PILIH MENU : ");
        
        int selectedMenu = Integer.valueOf(input.readLine());
        
        switch(selectedMenu){
            case 1:
                tampilSiswa();
                System.out.println("\n");
                break;
            case 2:    
                tambahSiswa();
                System.out.println("\n");
                break;
            case 3:
                editSiswa();
                System.out.println("\n");
                break;
            case 4:
                hapusSiswa();
                System.out.println("\n");
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan Menu Tidak Ada!");
                System.out.println("\n");
               
        }
    }
    
    public static void main(String[] args) throws IOException {
        
        do {
            showMenu();
        } while (isRunning);
    }
        
    static void tampilSiswa(){
        if(listsiswa.isEmpty()){
           System.out.println("Belum ada data siswa");
        } else {
            
            for(int i = 0; i <listsiswa.size(); i++){
                System.out.println(String.format("[%d] %s",i, listsiswa.get(i)));
            }
            
        }
    }
    
    static void tambahSiswa() throws IOException{
        System.out.println("Nama Siswa : ");
        String namaSiswa = input.readLine();
        listsiswa.add(namaSiswa);
    }
    
     static void editSiswa() throws IOException{
        tampilSiswa();
        System.out.println("Pilih nomor siswa yang akan diedit : ");
        int indexSiswa = Integer.valueOf(input.readLine());
        
        System.out.println("Nama Baru : ");
        String namaBaru = input.readLine();
        
        listsiswa.set(indexSiswa,namaBaru);
    }
    
    static void hapusSiswa() throws IOException{
        System.out.println("Pilih Nomor Siswa Yang Ingin Dihapus");
        int pilihan = Integer.valueOf(input.readLine());
        listsiswa.remove(pilihan);
    }
    }

