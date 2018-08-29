import java.util.Scanner;
/**
 * @author     SupriyaMadupathi
 */
public final class Sum_Of_N_Numbers {
  
    private Sum_Of_N_Numbers() {
        //Iam not using this constructor
    }
    /**
    * Main function to print.
    * @param args is the parameter for this function
    */
    private static final int FOUR = 4;

    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        int n, i = 1;
        int sum = 0;
        System.out.println("Enter the Number :");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of " + n + " numbers is :" + sum);
}
}
