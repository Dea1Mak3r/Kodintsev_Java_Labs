// package Lab_2;
import java.util.Random;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Task1Lab2 {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 1.\n\n");
        
        Random r = new Random();

        int myArr[] = new int[10];

        for (int i = 0; i < 10; i++)
        {
            myArr[i] = r.nextInt(99+99)-99;
        }
        myArr[3] = 0;
        System.out.println("Начальный массив: \n");
        for (int i = 0; i < 10; i++)
        {
            System.out.println(myArr[i]);
        }

        
        float reverseArr[] = CreateReciprocalFraction(myArr);

        System.out.println("Массив обратных чисел: \n");
        for (int i = 0; i < 10; i++)
        {
            System.out.println(reverseArr[i]);
        }

        int allowedArr[] = new int[3];
        allowedArr[0] = myArr[8];
        allowedArr[1] = myArr[0];
        allowedArr[2] = myArr[3];

        System.out.println("\nМассив разрешённых значений:\n");
        for (int i = 0; i < 3; i++)
        {
            System.out.println(allowedArr[i]);
        }

        int allowedSize = allowedArr.length;
        
        HashSet<Integer> notAllowed = new HashSet<>();

        for (int i = 0; i < 10; i++)
        {
            boolean flag = true;
            for (int j = 0; j < allowedSize; j++)
            {
                if (myArr[i] == allowedArr[j])
                {
                    flag = false;
                }
            }
            if (flag == true)
            {
                notAllowed.add(myArr[i]);
            }
        }

        System.out.println("\nМассив неразрешённых значений: \n");
        Iterator<Integer> it = notAllowed.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }

    public static float[] CreateReciprocalFraction(int arr[])
    {
        float resArr[] = new float[10];

        for (int i = 0; i < 10; i++)
        {
            try
            {
                if (arr[i] == 0)
                {
                    throw new ArithmeticException("Деление на ноль!");
                }

                resArr[i] = 1.0f/arr[i];
                
            } catch (ArithmeticException e)
            {
                System.out.println("\n=============== " + e + " ===============\n");
                resArr[i] = 0;
            }
        }

        return resArr;
    }
}
