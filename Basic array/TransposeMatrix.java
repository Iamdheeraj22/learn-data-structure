import java.util.Scanner;
/***
 * transpose the matrix
 */
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] a=new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j]=scanner.nextInt();
            }
        }

        System.out.println("Before Transpose");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("After transpose :-");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
