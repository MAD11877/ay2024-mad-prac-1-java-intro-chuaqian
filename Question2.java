import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
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
    double bmi = weight / (height*height);
    String twodpbmi = String.format("%.2f", bmi);
    System.out.println("Your bmi is: "+ twodpbmi);


  }
}
