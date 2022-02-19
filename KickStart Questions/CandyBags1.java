/***
 * You have gathered N Bags of the candy and you want to distribute the candy amongst M kids. The i-th bag contains Ci pieces of candy. You want to make sure that every kids get the same amount of candy and that the number of pieces of candy they receive is the greteset possible .
 * 
 * You can open each bag and mix all pieces of candy before distributting them to the kids

 * 
 * How many pieces of candy will remain after you share the candy amongst kids , based on the rules described above.
 */



import java.util.Scanner;

public class CandyBags1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();

        for(int i=1;i<=testCases;i++){
            int N=scanner.nextInt();
            int M=scanner.nextInt();

            int[] C=new int[N];
            for (int j = 0; j < C.length; j++) {
                C[j]=scanner.nextInt();
            }
            System.out.println("Case #"+i+": "+solve(N,M,C));
        }
        scanner.close();
    }

     private static int solve(int N,int M, int[] C) {
        int reminder=0;
        for (int i = 0; i < N; i++) {
            reminder=reminder+modulo(C[i],M);
            reminder=modulo(reminder, M);
        }
        return reminder;
    }

    private static int modulo(int i, int m) {
        return i%m;
    }
}




//Solution 2-


// import java.util.Scanner;

// public class CandyBags1 {
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         int testCases=scanner.nextInt();

//         for(int i=1;i<=testCases;i++){
//             int n=scanner.nextInt();
//             int m=scanner.nextInt();

//             int[] c=new int[n];
//             for (int j = 0; j < c.length; j++) {
//                 c[j]=scanner.nextInt();
//             }
//             System.out.println(solve(n,m,c));
//         }
//         scanner.close();
//     }

//     public static int solve(int n, int m, int[] c) {
//         // int total=0;
//         // int reminder=0;
//         // for (int i = 0; i < c.length; i++) {
//         //     total = total + c[i];
//         // }
//         // reminder=total%m;
//         int reminder=0;
//         for (int i = 0; i < n; i++) {
//             reminder=reminder+modulo(c[i],m);
//             reminder=modulo(reminder, m);
//         }
//         return reminder;
//     }

//     private static int modulo(int i, int m) {
//         return i%m;
//     }
// }
