import java.util.Scanner;
public class Task1 {// Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов

    static int[] wh = new int[2];

    static public int[] input() {
        System.out.print("Input width: "); //ширина прямоугольника в символах
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                wh[0] = sc.nextInt();
                break;
            } else {
                System.out.print("Re-enter: ");
            }
        }
        System.out.print("Input height: "); //высота прямоугольника в символах
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                wh[1] = sc.nextInt();
                break;
            } else {
                System.out.print("Re-enter: ");
            }
        }
        return wh;
    }

    static public void drawRectangle(int [] input) {
       System.out.print("Input width: ");// ширина прямоугольника в символах
        Scanner in = new Scanner(System.in);
        int width = input[0];
        System.out.print("Input height: ");
      int height = input[1];// высота прямоугольника в символах
        System.out.println("Your rectangle is: ");
        for (int i = 0; i < height; i++){
            for (int a = 0; a < width; a++)
            {
                System.out.print('+'+ " ");
            }
            System.out.println("\n");
        }

    }

    static public void drawRectangle(int side) {//перезаписываем функцию
        System.out.print("Input width: ");// сторона квадрата в символах
        Scanner in = new Scanner(System.in);
        int width = side;
        System.out.println("Your rectangle is: ");
        for (int i = 0; i < side; i++) {
            for (int a = 0; a < width; a++) {
                System.out.print('+' + " ");
            }
            System.out.println("\n");
        }
    }
}
