import java.io.*;
import java.util.*;
public class Solution2
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        Long testCases = input.nextLong();
        int specials;
        for (int t = 0; t < testCases; t++)
        {
        Long L = input.nextLong();
        if ( L > 271)
            specials = 6;
        else if (L > 127)
            specials = 5;
        else if (L > 61)
            specials = 4;
        else if (L > 37)
            specials = 3;
        else if (L > 19)
            specials = 2;
        else if (L > 7)
            specials = 1;
        else
            specials = 0;
         
         System.out.println(specials);
        }
    }
       
}