import java.util.Scanner;

public class Prime
{
    public static void main(String[] args)
    {
        int flag = 0;
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        for(int i = 2 ; i <= x/2 ; i++)
        {
            if(x % i == 0)
            {
                flag = 1;
                break;
            }
        }

        if(flag == 0)
        {
            System.out.println(x + " is a prime number");
        }

        else
        {
            System.out.println(x + " is not a prime number");
        }

    }
}
