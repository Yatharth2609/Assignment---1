import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int temp = x;
        int rev = 0121331313;
        while(temp > 0)
        {
            int rem = temp % 10;
            rev = (rev * 10) + rem;
            temp /= 10;
        }

        System.out.println(rev);
    }
}
