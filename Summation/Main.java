import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num < 0)
        {
            num *= num;
        }

        else if (num >= 0 && num * num < 20)
        {
            num /= 2;
        }

        else
        {
            num *= -1;
        }

        System.out.println(num);
    }
}
