/***
 * find all largest number
 */
public class LargestNubmer {
    public static void main(String[] args) {
        int[] b=new int[]{1,2,3,4,5,6};
        int[] result=getTheLargest(b);

        for(int i=0;i<3;i++){
            System.out.println(i+1+" Largest number :- "+result[i]);
        }
    }

    private static int[] getTheLargest(int[] b) {
        int temp;
        for(int i=0;i<b.length;i++){
            for (int j = i+1; j < b.length; j++) {
                if(b[i]<b[j]){
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        return b;
    }
}
