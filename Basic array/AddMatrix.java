import java.util.Scanner;
/***
 * Addition
 * substraction
 * Multiplication
 * 
 */
public class AddMatrix {
    public static void main(String[] args) {
        int[][] a=new int[3][3];
        int[][] b=new int[3][3];

        int[][] resultMatrix=new int[3][3];

        Scanner scanner=new Scanner(System.in);
        
        // enter the elements in array a
        for (int i = 0; i < a.length; i++) {
            for(int j=0;j<a.length;j++){
                a[i][j]=scanner.nextInt();
            }
        }

        // enter the elements in array b
        for (int i = 0; i < b.length; i++) {
            for(int j=0;j< b.length;j++){
                b[i][j]=scanner.nextInt();
            }
        }

        //Addition of the matrix

        for(int i=0;i<resultMatrix.length;i++){
            for(int j=0;j<resultMatrix.length;j++){
                resultMatrix[i][j]=a[i][j]*b[i][j];
            }
        }

        for(int i=0;i<resultMatrix.length;i++){
            for(int j=0;j<resultMatrix.length;j++){
                System.out.print(" "+resultMatrix[i][j]);
            }
            System.out.println();;
        }


        //Print even elements into the array

        for(int i=0;i<resultMatrix.length;i++){
            for(int j=0;j<resultMatrix.length;j++){
                if(resultMatrix[i][j]%2==0){
                    System.out.println("Evene Element :- "+resultMatrix[i][j]);
                }else{
                    System.out.println("Odd Element :- "+resultMatrix[i][j]);
                }
            }
        }
        scanner.close();
    }
}
