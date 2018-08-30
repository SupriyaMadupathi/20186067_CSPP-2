import java.util.Scanner;
/**
 * @author     SupriyaMadupathi
 */
public final class FirstLast6 {
    /**.
     * Constructs the object.
     */
    private FirstLast6() {
    }
    /**
    * Main function to print.
    * @param args is the parameter for this function
    */
     public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();