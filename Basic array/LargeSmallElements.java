import java.util.*;

/**
 * Java Program to print the largest element in an array
 * Java Program to print the smallest element in an array
 */

public class LargeSmallElements {
    public static void main(String[] args) {
        int max=0;
        int min=0;

        int[] b=new int[]{2,3,2,5,6,8,3,5,1};

        //Largest number 
        for(int i=0;i<b.length;i++){
            if(b[i]>max){
                max=b[i];
            }
        }

        //Small number
        for(int i=0;i<b.length;i++){
            if(b[i]<max){
               min=b[i];
            }
        }

        System.out.println("largest element :- "+max);
        System.out.println("small element :-"+min);
    }
}
