/**
 * @author SupriyaMadupathi.
 */
public final class swap {
   /**
    * empty constructor.
    */
    private swap() {

    }
   /**
    * main function to print hello.
    * @param args is parameter for this function
    */
    public static void main(final String[] args) {
        int a = 8;
        int b = 6;
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        System.out.println(a + " " + b);
    }
}
