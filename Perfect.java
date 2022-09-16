import java.util.Scanner;

public class Perfect
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int temp = 0;
        for (int i = 1 ; i < x ; i++)
        {
            if (x % i == 0)
            {
                temp += i;
            }
        }

        if(temp == x)
        {
            System.out.println(x + " is a perfect number");
        }

        else
        {
            System.out.println(x + " is not a perfect numeber");
        }
    }
}
