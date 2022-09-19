/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nisa.latihan1;
import java.util.*;

/**
 *
 * @author USER
 */
public class LatihanSet {
    public static void main (String[] args){
       
        Set set = new HashSet();
        
        set.add("Surakarta");
        set.add("Sukoharjo");
        set.add("Karanganyar");
        set.add("Sragen");
        set.add("Wonogiri");
        set.add("Sragen");
        
        System.out.println(set);
        
        Iterator<String> iterator = set.iterator();
        
           while (iterator.hasNext()){
               System.out.println(iterator.next().toUpperCase() + "");
           }
    }
    
}
