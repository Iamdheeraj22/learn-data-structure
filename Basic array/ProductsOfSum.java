import java.util.Scanner;
/****
 * Products of sum teo matrices
 */
public class ProductsOfSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};

        int row1,row2,col1,col2;

        //Size of the row of a and b matrix
        row1=a.length;
        row2=b.length;

        //SIze of the col of a and b matrix
        col1=a[0].length;
        col2=b[0].length;

        int result[][]=new int[row1][col2];

        if(col1!=row2){
            System.out.println("Matrices cannot be multiplied...");
        }else{
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < row2; k++) {
                        result[i][j]=result[i][j]+a[i][k]*b[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
