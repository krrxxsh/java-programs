import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // All possible password characters
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String bigLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "!@#$";
        
        System.out.println("WELCOME TO PASSWORD GENERATOR:");
        
        while(true) {
            System.out.println("\n1. Make password");
            System.out.println("2. Exit");
            System.out.print("Choose: ");
            
            String choice = scanner.nextLine();
            
            if(choice.equals("1")) {
                // Get password length
                int length = 0;
                while(true) {
                    System.out.print("Password length (8-16): ");
                    String input = scanner.nextLine();
                    
                    // Simple number check
                    boolean isNumber = true;
                    for(int i=0; i<input.length(); i++) {
                        char c = input.charAt(i);
                        if(c < '0' || c > '9') {
                            isNumber = false;
                            break;
                        }
                    }
                    
                    if(isNumber && input.length() > 0) {
                        length = 0;
                        for(int i=0; i<input.length(); i++) {
                            length = length * 10 + (input.charAt(i) - '0');  // Fixed this line
                        }
                        
                        if(length >= 8 && length <= 16) {
                            break;
                        }
                    }
                    System.out.println("Please enter number 8-16");
                }
                
                // Build password
                String allChars = letters + bigLetters + numbers + symbols;
                String password = "";
                
                for(int i=0; i<length; i++) {
                    int randomIndex = random.nextInt(allChars.length());
                    password += allChars.charAt(randomIndex);
                }
                
                System.out.println("\nYour new password: " + password);
                System.out.println("Copy it somewhere safe!\n");
            }
            else if(choice.equals("2")) {
                System.out.println("Bye!");
                break;
            }
            else {
                System.out.println("Just type 1 or 2");
            }
        }
        scanner.close();
    }
}