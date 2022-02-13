import java.util.*;

/**
 * left rotate the elements of an array
 */

public class LeftRotation {
    public static void main(String[] args) {
        int[] b=new int[]{1,2,3,4,5};
        int n=2;

        System.out.println("Before operation...\n");

        for(int i=0;i<b.length;i++){
            System.out.print(" "+b[i]);
        }

        for(int i=0;i<n;i++){
            int j,first;
            first=b[0];

            for(j=0;j<b.length-1;j++){
                b[j]=b[j+1];
            }
            b[j]=first;
        }

        System.out.println("\nafter operation....\n");
        for(int i=0;i<b.length;i++){
            System.out.print(" "+b[i]);
        }
    }
}
