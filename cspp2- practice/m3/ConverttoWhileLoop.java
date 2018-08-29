import java.util.Scanner;
/**
 *@author SupriyaMadupathi
 */
public final class ConverttoWhileLoop {
    /*
    Do not modify this main function.
    */
    /**
     * Empty Constructor.
     */
    private ConverttoWhileLoop() {

    }
    /**
    *@variable FOUR variable.
    */
    private static final int TEN = 10;
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int i = 0;
        while (i <= TEN) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("GoodBye!");
    }
}
