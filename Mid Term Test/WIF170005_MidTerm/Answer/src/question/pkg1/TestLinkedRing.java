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
public class TestLinkedRing {
    
    public TestLinkedRing(){
        LinkedRing newList = new LinkedRing();
        
        System.out.println(newList.isEmpty());
        newList.add("Apple");
        newList.add("Banana");
        newList.add("Coconut");
        newList.add("Durian");
        System.out.println("");
        
        System.out.println(newList.getLength());
        System.out.println("");
        
        System.out.println(newList.getCurrentEntry());
        newList.advance();
        newList.advance();
        System.out.println(newList.getCurrentEntry());
        System.out.println("");
        
        newList.add("Egg");
        newList.add("Fig");
        System.out.println("");
        
        newList.displayAll();
        System.out.println("");
        
        newList.remove();
        System.out.println("");
        
        System.out.println(newList.isEmpty());
        System.out.println(newList.getCurrentEntry());
        newList.remove();
        System.out.println("");
        
        System.out.println("Testing done.");
    }
    
}
