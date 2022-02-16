/**
 * AscendingOrder
 */
public class AscendingDescendingOrder {
     public static void main(String[] args) {
         int[] b=new int[]{9,8,7,3,5,6};
         int temp=0;

        //descending order
         for (int i = 0; i < b.length; i++) {
            for(int j=i+1;j<b.length;j++){
                if(b[i]>b[j]){
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
         }

         System.out.print("descending order :-");
         for (int i = 0; i < b.length; i++) {
             System.out.print(" "+b[i]);
         }


        //ascending order 
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                temp=b[i];
                b[i]=b[j];
                b[j]=temp;
            }
        }

        System.out.print("descending order :-");
        for (int i = 0; i < b.length; i++) {
            
            System.out.print(" "+b[i]);
        }
     }
}