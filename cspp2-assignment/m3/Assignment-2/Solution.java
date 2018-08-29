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
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);      
        int n = s.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
        	int a = i;
        	
        	while(a != 0) {
        		int k = a % 10;
        		a = a / 10;
        		if (k == 7) {
        			count += 1;
        			
        			
        		}
        	}	
        }
        System.out.println(count);
    }
}
            
