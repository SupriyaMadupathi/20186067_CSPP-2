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
        int p, q, m, n;
        Scanner s = new Scanner(System.in);
        p = s.nextInt();
        q = s.nextInt();
        int a[][] = new int[p][q];
        for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    a[i][j] = s.nextInt();
                }
        for (int b = 0; b < p; b++) 
            {
                for (int j = 0; j < q; j++) 
                {
                   /* System.out.print(a[b][j]+" ");*/
                }
                /*System.out.println("");*/
            }
        }
        m = s.nextInt();
        n = s.nextInt();
        int b[][] = new int[m][n];
        for (int c = 0; c < m; c++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    b[c][j] = s.nextInt();
                }
            }
        for (int d = 0; d < m; d++) 
            {
                for (int j = 0; j < n; j++) 
                {
                }
            }
            if (p == m && q == n){
                int sum[][] = new int[m][n];
                for (int f = 0; f < p; f++) 
                {
                    for (int j = 0; j < n; j++) 
                    {
                        sum[f][j] = a[f][j] + b[f][j];
                    }
                }
                String temp = "";
                for (int e = 0; e < p; e++) {
                    for (int j = 0; j < n; j++) {
                        temp += sum[e][j] + " ";

                    }
                    temp = temp.trim();
                    temp += '\n';
            }
            System.out.println(temp);
        } else {
                System.out.println("not possible");
            }
}
}