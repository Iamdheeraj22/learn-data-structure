/***
 * A matrix is said to be sparse matrix if most of the elements of that matrix are 0. It implies that it contains very less non-zero elements
 * 
 * To check whether the given matrix is the sparse matrix or not, we first count the number of zero elements present in the matrix. Then calculate the size of the matrix. For the matrix to be sparse, count of zero elements present in an array must be greater than size/2.
 */

public class SparseMatrix {
    public static void main(String[] args) {
        int a[][]={{4,0,0},{0,5,0},{0,0,6}};

        int row,column,size;
        int count=0;

        row=a.length;
        column=a[0].length;

        size=row*column;

        for (int i = 0; i <row; i++) {
            for (int j = 0; j <column; j++) {
                if(a[i][j]==0){
                    count++;
                }
            }
        }

        if(count>(size/2)){
            System.out.println("Sparse Matrix");
        }else{
            System.out.println("Not Sparse Matrix");
        }
    }
}
