import java.util.Scanner;

public class GCD
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int gcd = 0;

        int z = Math.min(x,y);
        for (int  i = 1 ; i <= z ; i++ )
        {
            if (x % i == 0 && y % i == 0)
            {
                gcd = i;
            }
        }

        System.out.println("GCD of " + x + " and " + y + " is " + gcd);
    }
}
