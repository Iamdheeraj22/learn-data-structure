/**
 * Java Program to print the duplicate elements of an array
 * Java Program to print the elements of an array
 */
public class DuplicteElements {
    public static void main(String[] args) {
        int b[]=new int[]{1,1,3,4,3,6};
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
               if(b[i]==b[j]){
                  System.out.print(" "+b[i]);
                }
            }
        }
        System.out.println("\n");
        //print all elements
        for(int i=0;i<b.length;i++){
            System.out.print(" "+b[i]);
        }
    }
}