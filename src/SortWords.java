import java.util.Arrays;
import java.util.Scanner;
public class SortWords {


	public static void main(String args[]) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: \n");
        String input = scanner.nextLine();
       
        input = input + " ";
       
        int numberOfWords = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                numberOfWords++;
            }
        }
       
        String[] words = new String[numberOfWords];
        int startIndex = 0;
        int currentWord = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                String word = input.substring(startIndex, i);
                words[currentWord] = word;
                currentWord++;
                startIndex = i + 1;
            }
        }
       
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("After Sorting words in a String");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        

        System.out.println();
        System.out.println();
        System.out.println("After Sorting each char in a words of string");
        String Chars = new String();
        for (int i = 0; i < words.length; i++) {
        	Chars= words[i];
        	char[] wordChar = Chars.toCharArray();
        	Arrays.sort(wordChar);
        	Chars= new String(wordChar);
        	System.out.println(Chars);
        }
        
        scanner.close();
    }

}
