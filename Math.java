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
    
    public static boolean isInCircle(int radius, int[] xy)
    {
        if (xy.length != 2)
        {
            return false;
        }

        float circumference = 2*(3.14f * radius);

        return circumference > xy[0] && circumference > xy[1];
    }
}
