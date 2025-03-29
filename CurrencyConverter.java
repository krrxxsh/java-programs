import java.util.Scanner;

public class CurrencyConverter {
   
    static final double USD_TO_INR = 83.50;
    static final double EUR_TO_INR = 89.25;
    static final double GBP_TO_INR = 104.30;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Currency Converter");
        System.out.println("Supported currencies: INR, USD, EUR, GBP");
        
        while (true) {
            System.out.println("\n1. Convert from INR to other currencies");
            System.out.println("2. Convert from USD to other currencies");
            System.out.println("3. Convert from EUR to other currencies");
            System.out.println("4. Convert from GBP to other currencies");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Thank you for using the Currency Converter. Goodbye!");
                break;
            }
            
            System.out.print("Enter amount to convert: ");
            double amount = scanner.nextDouble();
            
            switch (choice) {
                case 1:
                    convertFromINR(amount);
                    break;
                case 2:
                    convertFromUSD(amount);
                    break;
                case 3:
                    convertFromEUR(amount);
                    break;
                case 4:
                    convertFromGBP(amount);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }
    
    private static void convertFromINR(double inr) {
        System.out.println("\n" + inr + " INR = " + (inr / USD_TO_INR) + " USD");
        System.out.println(inr + " INR = " + (inr / EUR_TO_INR) + " EUR");
        System.out.println(inr + " INR = " + (inr / GBP_TO_INR) + " GBP");
    }
    
    private static void convertFromUSD(double usd) {
        System.out.println("\n" + usd + " USD = " + (usd * USD_TO_INR) + " INR");
        System.out.println(usd + " USD = " + ((usd * USD_TO_INR) / EUR_TO_INR) + " EUR");
        System.out.println(usd + " USD = " + ((usd * USD_TO_INR) / GBP_TO_INR) + " GBP");
    }
    
    private static void convertFromEUR(double eur) {
        System.out.println("\n" + eur + " EUR = " + (eur * EUR_TO_INR) + " INR");
        System.out.println(eur + " EUR = " + ((eur * EUR_TO_INR) / USD_TO_INR) + " USD");
        System.out.println(eur + " EUR = " + ((eur * EUR_TO_INR) / GBP_TO_INR) + " GBP");
    }
    
    private static void convertFromGBP(double gbp) {
        System.out.println("\n" + gbp + " GBP = " + (gbp * GBP_TO_INR) + " INR");
        System.out.println(gbp + " GBP = " + ((gbp * GBP_TO_INR) / USD_TO_INR) + " USD");
        System.out.println(gbp + " GBP = " + ((gbp * GBP_TO_INR) / EUR_TO_INR) + " EUR");
    }
}