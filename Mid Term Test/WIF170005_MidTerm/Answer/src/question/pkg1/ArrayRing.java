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
public class ArrayRing implements RingInterface {
    
    private final int firstIndex = 0;
    private static int lastIndex = 0;
    private static int currentIndex = 0;
    
    public String[] theArray = new String[5];
    
    @Override
    public void add(Object t) {
        if(lastIndex == 5){
            System.out.println("Cannot add. No more empty slot in the ring");
        }
        else{
            theArray[lastIndex] = (String) t;
            lastIndex++;
            System.out.println(t + " added.");
        }  
    }

    @Override
    public Object remove() {
//        for(int i=0; i<lastIndex; i++){
//            if(theArray[i] == t){
//                theArray[i] = null;
//                System.out.println(t + " is removed from the ring.");
//                break;
//            }
//        }
           if(theArray[currentIndex] == null){
               return null;
           }
           System.out.println(theArray[currentIndex] + " is removed from the ring.");
           theArray[currentIndex] = null;

        return theArray[firstIndex];
    }

    @Override
    public Object getCurrentEntry() {
        return theArray[currentIndex];
    }

    @Override
    public void advance() {
        currentIndexCheck();
        currentIndex++;
    }

    @Override
    public int getLength() {
        return lastIndex;
    }

    @Override
    public boolean isEmpty() {
        boolean condition = false;
        for(int i=0; i<lastIndex; i++){
            if(theArray[i] != null){
                condition = false;
            }
            else{
                condition = true;
            }
        }
        return condition;
    }
    
    public void displayAll(){
        for(int i=0; i<lastIndex; i++){
            System.out.println(theArray[currentIndex] + " is current entry");
            currentIndexCheck();
            currentIndex++;
        }
    }
    
    private void currentIndexCheck(){
        if(currentIndex == 4){
            currentIndex = -1;
        }
    }
}
