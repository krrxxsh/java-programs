import java.util.Scanner;

public class SimplePalindromeChecker {

    void checkPalindrome(String str) {
        str = str.toLowerCase(); // Make it case-insensitive
        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true; // Assume it's a palindrome initially
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false; // Not a palindrome
                break; 
            }
            left++;
            right--;
        }
      
        if (isPalindrome) {
            System.out.println("'" + str + "' is a palindrome!");
        } else {
            System.out.println("'" + str + "' is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimplePalindromeChecker s1 = new SimplePalindromeChecker();

        
        System.out.println("PALINDROME CHECKER");
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();
        
       
        s1.checkPalindrome(input);
        
        scanner.close();
    
    
    
     
        
    }
}