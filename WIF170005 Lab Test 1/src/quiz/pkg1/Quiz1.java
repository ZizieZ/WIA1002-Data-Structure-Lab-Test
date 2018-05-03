/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg1;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 *
 * @author Q40163
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            
            FileInputStream finput = new FileInputStream("input.txt");
            Scanner input = new Scanner(finput);
            String a = "";
            int word = 0;
            int line = 0;
            
            while(input.hasNext()){
                
                String b = input.nextLine();
                if("".equals(b)){
                    //Do Nothing
                }
                else{
                    line++;
                }
                
                
                a = a + "\n" + b;
            }
            
            System.out.println("Words = " + word);
            System.out.println("Lines = " + line);
            System.out.println(a);
            
            finput.close();
        }catch(Exception e){
            
        }
    }
    
}
