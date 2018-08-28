import java.util.Scanner;
/**
 *do not modify this main function.
 * @author Supriya
 */
public class Solution {

    private static final int FOUR = 4;
    /**
     *do not modify this main function.
     *@param args
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }


    /**
     *Need to write the rootsOfQuadraticEquation function and print  output.
     *@param a variable a
     *@param b variable b
     *@param c variable c
     */
    public static void rootsOfQuadraticEquation(int a, int b, int c) {
        long det = (b * b) - (FOUR * a * c);
        double root1 = (-b + Math.sqrt(det)) / (2 * a);
        double  root2 = (-b - Math.sqrt(det)) / (2 * a);
        System.out.println(root1 + " " + root2);
        }
    }

