import java.util.Scanner;

public class Task001 {

    public static void getMax(int i, int j) {
        int num1 = i;
        int num2 = j;
        System.out.println("Max value is: " + (num1 > num2 ? num1 : num2));
    }

    public static void getMax(int i, float j) {
        int num1 = i;
        float num2 = j;
        System.out.println("Max value is: " + ((float) num1 > num2 ? num1 : num2));
    }

    public static void getMax(float i, int j) {
        float num1 = i;
        int num2 = j;
        System.out.println("Max value is: " + (num1 > (float) num2 ? num1 : num2));
    }

    public static void getMax(float i, float j) {
        float num1 = i;
        float num2 = j;
        System.out.println("Max value is: " + (num1 > num2 ? num1 : num2));
    }

}
