import java.util.Scanner;

public class Task4 {

    static private int i;
    static private float f;
  //  boolean ii, if, fi, ff;

    static void input() {
        System.out.print("Input first number: ");
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                break;
            } else if (sc.hasNextFloat()) {
                f = sc.nextFloat();
                break;
            } else {
                System.out.print("Re-enter: ");
            }
        }
        System.out.print("Input second number: ");
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                break;
            } else if (sc.hasNextFloat()) {
                f = sc.nextFloat();
                break;
            } else {
                System.out.print("Re-enter: ");
            }
        }
    }

 /*   public static void choice(){
if () {
}
}
    }
*/

    public static void getMax(int i, int j) {
        int num1 = i;
        int num2 = j;
        System.out.print("Max value is: " + (num1 > num2 ? num1 : num2));
    }

    public static void getMax(int i, float j) {
        int num1 = i;
        float num2 = j;
        System.out.print("Max value is: " + ((float) num1 > num2 ? num1 : num2));
    }

    public static void getMax(float i, int j) {
        float num1 = i;
        int num2 = j;
        System.out.print("Max value is: " + (num1 > (float) num2 ? num1 : num2));
    }

    public static void getMax(float i, float j) {
        float num1 = i;
        float num2 = j;
        System.out.print("Max value is: " + (num1 > num2 ? num1 : num2));
    }

}




    /*public static int getMax(int num1, int num2){
              while (true) {
            System.out.println("Input first number: ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
               num1 = sc.nextInt();
                break;
            } else {
                System.out.print("Re-enter: ");
            }
        }
        while (true) {
            System.out.println("Input second number: ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                num2 = sc.nextInt();
                break;
            } else {
                System.out.print("Re-enter: ");
            }
        }
        System.out.print("Max value is: ");
        return num1>num2?num1:num2;

    }*/




