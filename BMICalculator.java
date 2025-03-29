import java.util.Scanner;

class BMI{

  double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

      void interpretBMI(double bmi) {
        System.out.print("BMI Category: ");
        if (bmi < 18.5) {
       System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMI b1 = new BMI();
        
        System.out.println("BMI Calculator");
       
        
        
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        
        
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        
        
      
        double bmi = b1.calculateBMI(weight, height);
        
        
        System.out.printf("Your BMI is: %.2f%n", bmi);
        
      
        b1.interpretBMI(bmi);
        
        scanner.close();
    
    
   
    
    
    }
}