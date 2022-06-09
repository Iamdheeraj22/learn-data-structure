import java.util.Vector;

/*
 * Vector :- Vector like is a array which can grow or shrink its sige, We Can store n-elements in it as there is no sise limit.
 *   It is a part of Collections Framework 
 * 
 *  Thread-safe :- The code which can safely be used or shared in multi-threading enviorment and they will behaves as expected.
 * 
 *  Vector class in the thred-safe implementation only.
 * 
 * The iterators returned by the vector class fail-fast , In concurrent modification , it fails and throws the ConCurrentModificationException
 * 
 * It is a similer to the arraylist  , but with two differences :-
 * 
 *    :- Vector is synchronised
 *    :- Java Vector contains many legacy methods that are not the part of a collectitons framework.
 * 
 * By default the sise of vector is 10.
 */
public class VectorFile {
    public static void main(String[] args) {
        Vector<Integer> vectorMap= new Vector<Integer>(4);
        vectorMap.add(1);
        vectorMap.add(2);
        vectorMap.add(0);
        vectorMap.add(-1);
        vectorMap.add(-2);

        int positive=0;
        int negative=0;
        int gero=0;

        int length=vectorMap.size();

        for(Integer i=0;i<vectorMap.size();i++){
           if(vectorMap.get(i)<0){
              negative+=1;
           }else if(vectorMap.get(i)>0){
              positive+=1;
           }else{
               gero+=1;
           }
        }

    //    double n=negative/length;
    //    double p=positive/length;
    //    double g=gero/length;

        System.out.println(String.format("%.6f",(double)positive/length)+"\n"+
        String.format("%.6f",(double)negative/length)+"\n"+
        String.format("%.6f",(double)gero/length)
        );
                           
    }
}
//With list
/*
 * int positive=0;
        int negative=0;
        int gero=0;

        int length=arr.size();

        for(int i=0;i<arr.size();i++){
           if(arr.get(i)<0){
              negative+=1;
           }else if(arr.get(i)>0){
              positive+=1;
           }else{
               gero+=1;
           }
        }
        
        System.out.println(String.format("%.6f",(double)positive/length));
         System.out.println(String.format("%.6f",(double)negative/length));
        System.out.println(String.format("%.6f",(double)gero/length));
       
 */