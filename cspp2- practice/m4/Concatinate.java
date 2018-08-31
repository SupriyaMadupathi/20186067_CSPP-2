import java.util.Scanner;
/**
 * @author     SupriyaMadupathi
 */
public final class Concatinate {
    /**.
     * Constructs the object.
     */
    private Concatinate() {
    }
    /**
    * Main function to print.
    * @param args is the parameter for this function
    */
     public static void main(final String[] args) {
        String s1 = "Hello ";
        Scanner s = new Scanner(System.in);
        String s2 = s.nextLine();
        String s3 = "!";
        String s4 = s1.concat(s2);
        String s5 = s4.concat(s3);
        System.out.println(s5);
}
}
