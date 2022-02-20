/***
 * With interface we can perform the multiple inheritance functionality
 */


public class InterfaceExample1 implements InnerIerfaceExample1 {
   public static void printMessage(String msg) {
       System.out.println(msg);
   }
    public static void main(String[] args) {
        printMessage("Hello World");
    }
}

/**
 * InnerInterfaceExample1
 */
 interface InnerIerfaceExample1 {
   static void printMessage(){
    } 
}
