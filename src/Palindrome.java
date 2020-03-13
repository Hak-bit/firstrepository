import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println(" enter the string to check the palindrome:");
        String str= scan.next();
        String reverse="";
        for (int i=str.length()-1; i>=0; i--)
        {
            reverse=reverse+str.charAt(i);
        }
        /*StringBuffer sb= new StringBuffer(str);
        String s=sb.reverse().toString();*/
        if (reverse.equals(str))
        {
            System.out.println("is palindrome");
        }

        else
        {
            System.out.println("is not palindrome");
        }
    }
}
