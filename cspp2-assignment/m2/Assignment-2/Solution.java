import java.util.Scanner;

public class Solution {

	private static final int FOUR = 4;
	/**
	 *do not modify this main function.
	 */
	public static void main(final String[] args) {
		/**
		 * function to read input from user
		 */
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}


    public static void rootsOfQuadraticEquation(int a, int b, int c) {
    	/**
    	 *main function to calculate roots
    	 */
		long det = (b * b) - (FOUR * a * c);
		double root1 = (-b + Math.sqrt(det)) / (2 * a);
		double	root2 = (-b - Math.sqrt(det)) / (2 * a);
		System.out.println(root1 + " " + root2);
		}
	}
	/**
	 *Need to write the rootsOfQuadraticEquation function and print  output.
	 */

