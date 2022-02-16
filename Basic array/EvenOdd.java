/**
 * print even odd number
 */

public class EvenOdd {
    public static void main(String[] args) {
        int[] b=new int[]{1,2,3,4,5,6};
        for (int i = 0; i < b.length; i++) {
            if(b[i]%2==0){
                System.out.println("Even number :-"+b[i]);
            }else{
                System.out.println("Odd Number :- "+b[i]);
            }
        }
    }
}
