import java.util.*;
public class OddEvenElements {
    public static void main(String[] args) {
        int[] b=new int[]{1,2,3,4,5};

        //Odd position elements
        System.out.println("Odd Position elements\n");
        for(int i=0;i<b.length;i++){
            if(i%2==1){
                System.out.print(" "+b[i]);
            }
        }

        //Even position Elements
        System.out.println("\n\nEven Position elements\n");
        for (int i=0;i<b.length;i++){
            if(i%2==0){
              System.out.print(" "+b[i]);
            }
        }
    }
}
