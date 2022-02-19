import java.io.*;
import java.util.*;

public class CandyBags
{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        
        int testCases=scanner.nextInt();
        for(int i=1;i<=testCases;i++){
            System.out.println(SolutionsOfQuestion(scanner));
        }
    }

    private static int SolutionsOfQuestion(Scanner scanner) {
        int result=0;
        int sumOfCandies=0;
        int[] bagsKids=new int[2];
        //first element is number of bags 
        //second element is number of kids

        for (int i = 0; i < bagsKids.length; i++) {
            bagsKids[i]=scanner.nextInt();
        }

        //enter the numbers of candies per bag
        int[] numberOfCandies=new int[bagsKids[0]];
        for (int i = 0; i < numberOfCandies.length; i++) {
            numberOfCandies[i]=scanner.nextInt();
            sumOfCandies+=numberOfCandies[i];
        }

        if(sumOfCandies%bagsKids[1]!=bagsKids[1]){
            result=sumOfCandies%bagsKids[1];
        }
        return result;
    }
}