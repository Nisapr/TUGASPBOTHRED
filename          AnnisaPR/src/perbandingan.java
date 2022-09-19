/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnnisaPR
 */
public class perbandingan {
    public static void main(String[] args) {
        String kalimat1 = "Kamis";
        String kalimat2 = "Rabu";
        String kalimat3 = "Sabtu";
        String kalimat4 = "KAMIS";
        String kalimat5 = "rabu";
        
        //contoh perbandingan dua buah dengan compareTO()
        int banding1 = kalimat1.compareTo(kalimat2 );
        System.out.println("perbandingan kalimat 1 & kalimat 2 :"+banding1);
        
        int banding2 = kalimat1.compareTo(kalimat3 );
        System.out.println("perbandingan kalimat 1 & kalimat 3 :"+banding2);
        
        int banding3 = kalimat1.compareTo("KAMIS");
        System.out.println("perbandingan kalimat 1 & perbandingan kata argument:"+banding3);
        
        //contoh perbandingan dua buah string dengan equals()
        if (kalimat1.equals(kalimat4)) {
            System.out.println("Equals = Benar");
        }
        if (kalimat2.equals(kalimat3)) {
            System.out.println("Equals = Benar");
        }
        
        //contoh perbandingan dua buah string dengan equalsignorecase()
        if (kalimat2.equalsIgnoreCase(kalimat5)) {
            System.out.println("Equals Ignore Case = Benar");
        }
    }
}
    