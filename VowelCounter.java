import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Vowel Counter Program");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int vowelCount = countVowels(input);
        
        System.out.println("Number of vowels in the string: " + vowelCount);
        
        scanner.close();
    }
    
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive check
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        
        return count;
    }}