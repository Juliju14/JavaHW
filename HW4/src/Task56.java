import java.util.Scanner;

public class Task56 {
    int i = 1;
    int h = 1;
    int w = 1;

    public int inpRec(int num) {
        System.out.print("Input number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        return num;
    }

    public void task1Rec(int num) {
        System.out.println(i);
        i++;
        if (i <= num) {
            task1Rec(num);
        }
    }

    public void task2Rec(int height, int width) {
        System.out.print('+' + " ");
        System.out.println('\n');
        height--;
        width--;
        if (height > 0) {
            if (width > 0) {
                task2Rec(height, width--);

            }
        }
    }


}


