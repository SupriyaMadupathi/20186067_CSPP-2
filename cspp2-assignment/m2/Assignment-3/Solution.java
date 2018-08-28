import java.util.Scanner;
/**
 *do not modify this main function.
 * @author Supriya
 */
public class Solution {
    /**
    *Private constructor.
    */
    private Solution() {//We are not using this constructor.
    }
    /*
    Do not modify this main function.
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);   
        int base = s.nextInt();
        int exponent = s.nextInt();
        System.out.println((long) power(base, exponent));
    }
    /*
    Need to write the power function and print the output.
    */
    public static double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}
