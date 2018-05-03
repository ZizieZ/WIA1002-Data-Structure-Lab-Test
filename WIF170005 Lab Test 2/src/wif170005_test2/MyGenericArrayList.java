/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wif170005_test2;

import java.util.ArrayList;

/**
 *
 * @author Q40531
 */
public class MyGenericArrayList<E extends Comparable> {
    
    private ArrayList<E> list = new ArrayList<>();
    
    public void  add(E obj) {
        list.add(obj);
        System.out.println(obj + " is added to the list.");
        list.get(0).compareTo(1);
        
//        for(int i=0; i<list.size(); i++){
//            if(list.compareTo(obj) > 0){
//                
//            }
//        }
        
        
                   
    }
    
//    public void printAll() {
//        System.out.println("\nPrint all elements in the list: ");
//        
//        for (Object obj: list) {
//            System.out.println(obj);
//        }
//
//        System.out.println();
//    }
    
    public void printAll() {
        System.out.println("Print the list: " + list.toString() );
        System.out.println();
    }
    
}
