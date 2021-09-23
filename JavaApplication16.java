
package javaapplication16;
import java.util.Scanner;

public class JavaApplication16 {

   
    public static void main(String[] args) {
       int array[];
       
       array= new int[10];
       System.out.println("value");
       for (int i=0;i<=array.length;i++)
       if (i%2!=0){
           array[i]+=i;
          System.out.println(array[i]); 
       }
    }
    
}

