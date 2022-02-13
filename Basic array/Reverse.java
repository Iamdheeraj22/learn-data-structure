/**
 * Java Program to print the elements of an array in reverse order
 */
public class Reverse {
    public static void main(String[] args) {
        int[] b=new int[]{1,2,3,4,5};
        for(int i=b.length-1;i>=0;i--){
            System.out.print(" "+b[i]);
        }
    }    
}