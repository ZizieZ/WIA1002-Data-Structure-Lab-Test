/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wif170005_labtest3;

import java.util.Arrays;

/**
 *
 * @author Q40208
 */
public class WIF170005_LabTest3 {

    
    public static void main(String[] args) {
        int[] array = {8, 7, 5, 1, 10, 3};
        System.out.println("Unsorted Array: " + Arrays.toString(array));
        
        MergeSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
        Integer[] array1 = {8, 7, 5, 1, 10, 3};
        GenericMergeSort(array1);
        System.out.println("Generic Sorted Array: " + Arrays.toString(array1));
    }
    
    public static void MergeSort(int[] array){
        if(array.length>1){
            
            int[] firstHalf = new int[array.length/2];
            System.arraycopy(array, 0, firstHalf, 0, array.length/2);
            MergeSort(firstHalf);
            
            int secondHalfIndex = array.length - array.length/2;
            int[] secondHalf = new int[secondHalfIndex];
            System.arraycopy(array, array.length/2, secondHalf, 0, secondHalfIndex);
            MergeSort(secondHalf);
            
            Merge(firstHalf, secondHalf, array);
        }
    }
    
    public static void Merge(int[] a, int[] b, int[] temp){
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;
        
        while(current1<a.length && current2<b.length){
            if(a[current1] < b[current2]){
                temp[current3++] = a[current1++];
            }
            else{
                temp[current3++] = b[current2++];
            }
        }
        
        while(current1<a.length){
            temp[current3++] = a[current1++];
        }
        
        while(current2<b.length){
            temp[current3++] = b[current2++];
        }
        
    }
    
    public static <E extends Comparable<E>> void GenericMergeSort(E[] e){
        if(e.length>1){
            
            E[] firstHalf = (E[]) new Integer [e.length/2];
            System.arraycopy(e, 0, firstHalf, 0, e.length/2);
            GenericMergeSort(firstHalf);
            
            int secondHalfIndex = e.length - e.length/2;
            E[] secondHalf = (E[]) new Integer[secondHalfIndex];
            System.arraycopy(e, e.length/2, secondHalf, 0, secondHalfIndex);
            GenericMergeSort(secondHalf);
            
            GenericMerge(firstHalf, secondHalf, e);
        }
    }
    
    public static <E extends Comparable<E>> void GenericMerge(E[] a, E[] b, E[] temp){
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;
        
        while(current1<a.length && current2<b.length){
            if(a[current1].compareTo(b[current2]) < 0){
                temp[current3++] = a[current1++];
            }
            else{
                temp[current3++] = b[current2++];
            }
        }
        
        while(current1<a.length){
            temp[current3++] = a[current1++];
        }
        
        while(current2<b.length){
            temp[current3++] = b[current2++];
        }
        
    }
    
    
}
