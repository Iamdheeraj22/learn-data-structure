/**
 * Java Program to print the number of elements present in an array
 * Java Program to print the sum of all the items of the array
 */
public class BasicOperation {
    public static void main(String[] args) {
        int[] b=new int[]{1,2,3,4,5};
        int sum=0;
        //length of array
        System.out.println("Length of array :- "+b.length);

        //Sum of array
        for (int i = 0; i < b.length; i++) {
            sum+=b[i];
        }
        System.out.println("Sum of array :- "+sum);
    }
}
