import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // System.out.println(Arrays.toString(Task1.input()));
       /* Task1.input();
        Task1.drawRectangle(Task1.wh);
        Task1.drawRectangle(Task1.wh[0]);*/
//       int[] shch = {5, 4};
//        Task1.drawRectangle(shch);
//        Task1.drawRectangle(7);
/*Task001.getMax(15,10f);
Task001.getMax(3,4);
Task001.getMax(10.7f,12);
        Task001.getMax(13.7f,13.8f);*/
        Task56 k = new Task56();
//int num = k.inpRec(0);
//k.task1Rec(num);
        k.task2Rec(3, 6);
        Font font = new Font(Font.MONOSPACED, Font.PLAIN, 10);
        int[][] array = getArray("Andryla gamnyla lybymaya", font);
        draw(array);
    }

    private static void draw(int[][] array) {
        for (int[] a : array) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] == 0 ? " " : "*");
            }
            System.out.println();
        }
    }

    private static int[][] getArray(String s, Font font) {
        FontMetrics metrics = new JLabel().getFontMetrics(font);
        int width = metrics.stringWidth(s);
        int height = metrics.getMaxAscent();
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bi.createGraphics();
        g2d.setFont(font);
        g2d.setColor(Color.black);
        g2d.drawString(s, 0, height);
        g2d.dispose();
        int[][] array = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = (bi.getRGB(j, i) != 0 ? 1 : 0);
            }
        }
        return array;
    }}

