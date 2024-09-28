package Lab_1;
import java.util.Scanner;
import static java.lang.Math.*;

public class Task_1
{
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 1\n\n");
		System.out.println("Введите x: ");
        int x = sc.nextInt();
		System.out.println("Введите y: ");
        int y = sc.nextInt();
        if (x * y > 50) {
            System.out.println("Ответ: " + 2*sqrt(x));
        } else
        {
            System.out.println("Условие не выполняется!");
        }
    }
}