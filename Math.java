public class Math
{
    public static int Summation(int num)
    {
        if (num < 0)
        {
            num *= num;
        }

        else if (num * num < 20)
        {
            num /= 2;
        }

        else
        {
            num *= -1;
        }

        return num;
    }
}
