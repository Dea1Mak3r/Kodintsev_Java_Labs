package Lab_1;
import java.util.Scanner;
import static java.lang.Math.*;

public class Task_3
{
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Задание 3.\n\n");
        System.out.println("Введите x: ");
        int digit = sc.nextInt();
        if (digit <= 0)
        {
            System.out.println("Y = " + (1 - pow(digit, 5) + tan(8*digit)));
			System.out.println("F = " + pow(E, (2*digit + 1)));
        } else if (digit > 0 && digit < 3) {
            System.out.println("Y = " + (1 + pow(3, digit)));
			System.out.println("F = " + (pow(digit, 2) - sin(4*digit)));
        } else {
			System.out.println("Y = " + atan(2*digit+1));
			System.out.println(pow(pow(digit, 2), 1/5));
		}
    }
}