/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wif170005_test2;

/**
 *
 * @author Q40531
 */
public class WIF170005_Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Question (a)
        System.out.println("______________________");
        System.out.println("Question (a)");       
        MyGenericArrayList myList = new MyGenericArrayList();
        myList.add(10);
        myList.add("Java");
        
        myList.printAll();
        


        //Question (b)
        System.out.println("______________________");
        System.out.println("Question (b)");     
        MyGenericArrayList<Integer> intList = new MyGenericArrayList<Integer>();
        intList.add(10);
        intList.add(5);
        intList.add(20);
        
        intList.printAll();
        
        MyGenericArrayList<String> strList = new MyGenericArrayList<String>();
        strList.add("I");
        strList.add("love");
        strList.add("data structure");
        
        strList.printAll();
        
    }
    
}
