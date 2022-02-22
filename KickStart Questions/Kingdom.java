
/***
 * The first line of the input gives the number of test cases, T. T lines follow, each one containing the name of one kingdom. Kingdom names will consist of only lower case English letters, starting with a capital letter. There will be no other characters on any line, and no empty lines.
List of vowels for this problem is ['A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u']
 */
import java.util.Scanner;

public class Kingdom {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int testCases=scanner.nextInt();

        for (int i = 1; i <=testCases;i++) {
            String character=scanner.next();
            System.out.println("Case "+"#"+i+": "+
                    character+" is ruled by "+getRuler(character));
        }
        scanner.close();
    }

    private static String getRuler(String character) {
        char[] letters=new char[]{'A','E','I','O','U','a','e','i','o','u'};

        char lastLetter=character.charAt(character.length()-1);
        
        //Apply  linear search in the operation
        for (int i = 0; i < letters.length; i++) {
            if(lastLetter==letters[i]){
                return "Alice.";
            }
        }
        if(lastLetter=='Y' || lastLetter=='y'){
            return "nobody.";
        }
        return "Bob.";
    }
}
