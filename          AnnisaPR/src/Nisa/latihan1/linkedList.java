/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nisa.latihan1;
import java.util.LinkedList;


/**
 *
 * @author USER
 */
public class linkedList {
    public static void main(String[] args){
        //membuat instance/objek dari LinkedList
        LinkedList<String> barang = new LinkedList<>();
        
        //menambahkan data pada objek buah
        barang.add("mouse");
        barang.add("keyboard");
        barang.add("monitor");
        barang.add("LCD");
        barang.add("printer");
        barang.add("scanner");
        barang.add("laptop");
        
        //Mencetak/menampilkan data
        System.out.println("Nama Barang: "+barang);
        //menghitung jumlah/ukuran pada objek LinkedList
        System.out.println("Jumlah Brang:"+barang.size());
        //menambahkan elemen didepan dan diakhir
        barang.addFirst("Atas");
        barang.addLast("Bawah");
        //jalankan program terbaru
        System.out.println("==========MODIFIKASI PROGRAM==========");
        System.out.println("Nama barang setelah saya modifikasi :"+barang);
        //mengubah data index
        barang.set(2, "Data di Ubah");
        barang.set(4, "Data di Ubah");
        //jalankan program terbaru
        System.out.println("Nama barang setelah saya ubah :"+barang);
        barang.removeFirst();
        barang.removeLast();
        //jalankan pemograman terbaru
        System.out.println("Nama barang setelah saya hapus :"+barang);
        //jslsnkan program terbaru
         System.out.println("==========AMBIL DATA SESUKA SAYA==========");
         //MENGAMBIL DATA URUTAN PERTAMA, TERAKHIR, DAN INDEX TERTENTU
         System.out.println("Data Teratasi :"+barang.get(0));
         System.out.println("Data Terbawah :"+barang.get(6));
         System.out.println("Data noIndex :"+barang.get(1));
         System.out.println("Data noIndex:"+barang.get(4));
    }
    
}
