public class RightRotation {
    public static void main(String[] args) {
        int[] b=new int[]{2,3,4,5,6};
        int n=1;

        System.out.println("before rotation\n");
        for(int i=0;i<b.length;i++){
            System.out.print(" "+b[i]);
        }

        //right operation 
        for(int i=0;i<n;i++){
            int last;
            last=b[b.length-1];
            for(int j=b.length-1;j>0;j--){
                b[j]=b[j-1];
            }
            b[0]=last;
        }

        System.out.println("\n\nafter rotation\n");
        for(int i=0;i<b.length;i++){
            System.out.print(" "+b[i]);
        }
    }
}
