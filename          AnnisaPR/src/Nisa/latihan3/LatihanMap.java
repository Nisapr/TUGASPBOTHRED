/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nisa.latihan3;
import java.util.*;
/**
 *
 * @author USER
 */
public class LatihanMap {
  public static void main(String[] args) {
      
      HashMap hMap = new HashMap();
      
      hMap.put("1","Annisa");
      hMap.put("2","Ulin");
      hMap.put("3","Fatika");
      System.out.println(hMap);
      
      Collection c = hMap.values();
      Iterator itr = c.iterator ();
      while (itr.hasNext())
          System.out.println(itr.next());
      
      System.out.println("Total HashMap adalah: " +hMap.size());
      
      System.out.println("===============");
      
      Object obj = hMap.remove("2");
      System.out.println(obj + "Dihapus dari HashMap");
      System.out.println("Total HashMap adalah: " +hMap.size());
      System.out.println(hMap);
      
      System.out.println("===============");
      
      hMap.clear();
      System.out.println("Total HashMap adalah: " +hMap.size());
  }  
}
