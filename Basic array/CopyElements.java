import java.io.*;

/**
 * Copy the all the elements into one array to another array. 
 */
public class CopyElements {
   public static void main(String[] args) {
       int original[]={10,12,12,44};
       int original_length=original.length;

       int[] copy=new int[original_length];

       for (int i=0;i<original_length;i++) {
           for(int j=0;j<original_length;j++){
               copy[j]=original[i];
           }
       }
       System.out.println("Original :-"+original);
       System.out.println("Copy :-"+copy);
   }
}