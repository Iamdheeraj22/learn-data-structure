
import java.util.*;
/**
 * Find the frecuency of each numbers
 */
public class FrecuencyNumbers {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,2,2,4,5,4,4,2,3,1};
        int fr[]=new int[arr.length];

        int visited=-1;

        for (int i = 0; i < arr.length; i++) {
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;

                    fr[j]=visited;
                }
            }
            if(fr[i]!=visited){
                fr[i]=count;
            }
        }
        for(int i=0;i<fr.length;i++){
            if(fr[i]!=-1){
                System.out.println(arr[i]+" :- "+fr[i]);
            }
        }
    }
}
