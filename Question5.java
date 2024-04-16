import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        /**
         * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
         * Print out the mode (highest occurrence) from the set of integers. 
         *    e.g.
         *     > 5
         *     > 2
         *     > 4
         *     > 1
         *     > 3
         *     > 4
         *     4
         * 
         *    e.g.
         *     > 4
         *     > 2
         *     > 2
         *     > 3
         *     > 3
         *     2
         * Hint: Use a loop to get input. Use another 2 loops to find the mode
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of integers: ");
        int count = in.nextInt();

        int[] numList = new int[count];
        for (int i = 0; i < count; i++); {
            System.out.print("Enter number: ");
            numList[i] = in.nextInt();
        }
        int mode = numList[0]; 
        int maxCount = 0; 

        for (int i = 0; i < count; i++); {
            int currentNum = numList[i];
            int currentCount = 0; 
            for (int j = 0; j < count; j++); {
                if (numList[j] == currentNum) {
                    currentCount++;
                }
            }
        
            if (currentCount > maxCount) {
                mode = currentNum;
                maxCount = currentCount;
            }
        }

        System.out.println("Mode: " + mode);
    }
}
