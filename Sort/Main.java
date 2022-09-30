public class Main {
    public static void main(String[] args)
    {
        int[] array = {2, 3, 1, 0};
        int indx = 0;


        for (int i = 0; i < array.length * 2; i++)
        {
            if (indx > array.length-2)
            {
                indx = 0;
            }

            int num1 = array[indx];
            int num2 = array[indx+1];

            if (array[indx] > array[indx+1])
            {
                array[indx] = num2;
                array[indx+1] = num1;
            }

            indx++;
        }

        for (int i: array) {
            System.out.println(i);
        }
    }
}
