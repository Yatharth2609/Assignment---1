import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int sum = 1;

        for (int i = x ; i >= 1 ; i--)
        {
            sum *= i;
        }

        System.out.println("Factorial of " + x + " is "+ sum);
    }
}
