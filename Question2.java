import java.util.Scanner;

public class Question2 {
    
    // Method to calculate BMI
    public double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        /**
         * Prompts user for height and weight, calculate and print out the BMI of the user
         * 
         * Hint: in.nextDouble() to read double
         */
        System.out.println("What is your height?");
        Scanner in = new Scanner(System.in);
        double height = in.nextDouble();
        System.out.println("What is your weight?(kg)");
        double weight = in.nextDouble();
        
        // Create an instance of Question2
        Question2 question2 = new Question2();
        
        // Calculate BMI
        double bmi = question2.calculateBMI(height, weight);
        
        // Format BMI to two decimal places
        String twodpbmi = String.format("%.2f", bmi);
        System.out.println("Your bmi is: " + twodpbmi);
    }
}
