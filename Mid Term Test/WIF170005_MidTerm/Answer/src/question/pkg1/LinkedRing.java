/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Q30186
 */
public class LinkedRing<T> implements RingInterface {
    
    private T head = null;
    private T tail = null;
    private T current = null;
    
    LinkedList theList = new LinkedList();

    @Override
    public void add(Object t) {
        if(theList.size() == 5){
            System.out.println("Cannot add. No more empty slot in the ring");
        }
        else{
            theList.add(t);
            System.out.println(t + " added.");
        }
        
    }

    @Override
    public Object remove() {
        theList.remove();
        
        return theList;
    }

    @Override
    public Object getCurrentEntry() {
        return current;
    }

    @Override
    public void advance() {
          
    }

    @Override
    public int getLength() {
        return theList.size();
    }

    @Override
    public boolean isEmpty() {
        if(theList.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void displayAll(){
        System.out.println(current + " is the current entry.");
    }
    
}
