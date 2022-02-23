/**
 * IdentityMatrix
 * Check the matrix is identity matrix or not 
 */
public class IdentityMatrix {
    public static void main(String[] args) {
        int array[][]={{1,0,0},{0,1,0},{0,0,1}};

        //First we take the length of (row and column)the array
        int rowLength=array.length;
        boolean flag=false;
        int columnLength=array[0].length;
        int count=0;

        if(rowLength==columnLength){
            flag=true;
            for (int i = 0; i < rowLength; i++) {
                for(int j=0;j<columnLength;j++){
                    //Now check
                    if(i==j){
                        if(array[i][j]==1){
                            count++;
                        }
                    }
                }
            }
        }else{
            System.out.println("This matrix is square matrix");
        }

        if(flag){
            if(count==rowLength){
                System.out.println("This matrix is identity matrix.");
            }else{
                System.out.println("This matrix is square matrix");
            }
        }
    }
}