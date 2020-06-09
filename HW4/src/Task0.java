import java.util.List;
import java.util.Scanner;

//Задание 1.Написать функцию которая выводит в консоли от 1 до числа Х.
public class Task0 {

    public static void firstTask() {
        System.out.print("Input X: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }
}
