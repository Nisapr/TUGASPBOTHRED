/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nisa.latihan2;
import java.util.*;

/**
 *
 * @author USER
 */
public class LatihanList {
    public static void main (String[] args){
        List list = new ArrayList ();
        list.add("Nangka");
        list.add("Strawberry");
        list.add("Salak");
        list.add("Jeru");
        list.add("Anggur");
        System.out.println("Daftar Buah-Buahan: ");
        Iterator itr = list.iterator();
       while (itr.hasNext()) {
           Object element = itr.next();
           System.out.print(element + " ");
       }
    } 
    
}
