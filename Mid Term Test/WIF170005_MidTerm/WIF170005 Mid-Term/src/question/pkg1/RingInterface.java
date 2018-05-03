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
public interface RingInterface<T> {
    
    public void add(T t);
    
    public T remove();
    
    public T getCurrentEntry();
    
    public void advance();
    
    public int getLength();
    
    public boolean isEmpty();
    
    
    
}
