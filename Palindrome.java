import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int temp = x;
        int rev = 0;
        while(temp > 0)
        {
            int rem = temp % 10;
            rev = (rev * 10) + rem;
            temp /= 10;
        }

        if(rev == x)
        {
            System.out.println(x + " is a palindrome");
        }
        else
        {
            System.out.println(x + " is not a palindrome");
        }
    }
}
