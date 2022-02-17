public class RemoveDuplicateNo {
    public static void main(String[] args) {
        int[] b=new int[]{1,2,3,3,4,4,5};
        int[] c=new int[b.length];
        int j=1;

        for(int i=0;i<b.length-1;i++){
            if(b[i]!=b[i+1]){
                c[i]=b[i];
                b[j]=b[i+1];
                j++;
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(" "+c[i]);
        }
    }
}
