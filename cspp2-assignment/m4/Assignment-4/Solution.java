
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution
{/*
    Do not modify the main function 
    */
    private Solution() {
    //We are not using this constructor.
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);    
        System.out.println(reverse);
        
    }
    //
    // Write reverseString function
    //
    // @param      s     { parameter_description }
    //
    // @return     { description_of_the_return_value }
    //
    static String reverseString(final String s) {

        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }  
        return s1;
        }
    }


