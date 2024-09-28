package Lab_1;
import java.util.Scanner;
import static java.lang.Math.*;

public class Task_2
{
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 2.\n\n");
        System.out.println("Введите a: ");
        int a = sc.nextInt();
		System.out.println("Введите b: ");
		int b = sc.nextInt();
        System.out.println("Наибольшее из чисел: " + max(a, b));
        System.out.println("Тангенс наибольшего числа: " + tan(max(a, b)));
    }
}