interface Bank{
     float rateOfInterest();
}

class SBI implements Bank{
    public float rateOfInterest(){
        return 4.13f;
    }
}

class PNB implements Bank{
    public float rateOfInterest(){
        return 4.32f;
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Bank b=new PNB();
        Bank b2=new SBI();
        System.out.println("SBI bank interest rate :- "+b2.rateOfInterest());
        System.out.println("PNB bank interest rate :- "+b.rateOfInterest());   
    }
}
