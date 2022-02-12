import java.util.*;

/**
 * left rotate the elements of an array
 */

public class LeftRotation {
    public static void main(String[] args) {
        int[] b=new int[]{1,2,3,4,5};
        int[] c=new int[b.length];

        int clength=0;

        for(int i=b.length-1;i>=0;i--){
            c[clength]=b[i];
            clength++;
        }

        for(int i=0;i<b.length;i++){
            System.out.print(" "+b[i]);
        }
        System.out.println();
        for(int i=0;i<c.length;i++){
            System.out.print(" "+c[i]);
        }
    }
}
