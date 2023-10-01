import java.util.Scanner;

public class AlphabetVowels {
    public static void main(String[] args){
        try (Scanner input = new Scanner (System.in)) {
            System.out.print("Enter a letter: ");

            char ch = input.next().charAt(0);

        if(!(ch >= 'A' && ch <= 'Z') && !(ch >='a'&& ch<='z')){
            System.out.println(ch + " is not a valid input");
        }

        else if ( ch == 'a'|| ch == 'e' || ch == 'i' || ch =='o' || ch == 'u' || ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U'){
            System.out.println(ch + " is a vowel");

        } else {
            System.out.println(ch + " is a consonant");
        }

             }
        }
    }

