/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg1;

/**
 *
 * @author Q30186
 */
public class TestArrayRing {
        
    public TestArrayRing(){
        ArrayRing newArray = new ArrayRing();
        
        newArray.isEmpty();
        newArray.add("Apple");
        newArray.add("Banana");
        newArray.add("Coconut");
        newArray.add("Durian");
        System.out.println("");
        
        newArray.getLength();
        System.out.println(newArray.getLength());
        System.out.println("");
        
        System.out.println(newArray.getCurrentEntry());
        newArray.advance();
        newArray.advance();
        System.out.println(newArray.getCurrentEntry());
        System.out.println("");
        
        newArray.add("Egg");
        newArray.add("Fig");
        System.out.println("");
        
        newArray.displayAll();
        System.out.println("");
        
        newArray.remove();
        newArray.advance();
        newArray.remove();
        newArray.advance();
        newArray.remove();
        newArray.advance();
        newArray.remove();
        newArray.advance();
        newArray.remove();

        System.out.println("");
        
        System.out.println(newArray.isEmpty());
        System.out.println(newArray.getCurrentEntry());
        System.out.println(newArray.remove());
        System.out.println("");
        System.out.println("Testing done");
    }
    
    
    
}
