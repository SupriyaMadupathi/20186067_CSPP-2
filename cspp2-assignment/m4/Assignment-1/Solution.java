import java.util.Scanner;
/**
 *do not modify this main function.
 * @author Supriya
 */
public final class Solution {
/**
    *Private constructor.
    */
    private Solution() {
    //We are not using this constructor.
    }
     /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println(max);
    }
}

