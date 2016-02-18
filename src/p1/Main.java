package p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String sentence;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a sentence: ");
            sentence = input.nextLine();

            //split sentence into tokens
            String[] tokens = sentence.split(" +");

            //print each word
            for (String each : tokens) System.out.println(each); {

            }

            //print the number of words in the sentence
            System.out.println("Number of words = " + tokens.length);

            System.out.println("You entered " + sentence);

            System.out.println(isFirstCharCap(sentence) ? "First letter is a cap" :
            "First letter is not a cap");

            System.out.println(isLastCharPunctuation(sentence) ? "Sentence ends properly" :
            "Sentence does not end properly");
        } while (!sentence.equals(""));

    }

    static boolean isFirstCharCap (String arg) {
        //is the first character capital?
        return Character.isUpperCase(arg.charAt(0));
    }

    static boolean isLastCharPunctuation(String arg) {
        //try to match punctuations at the end of the sentence
        return arg.matches(".*[.!?]$");
    }
}
