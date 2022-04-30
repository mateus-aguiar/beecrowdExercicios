import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args) {
        double x1, y1, x2, y2;

        Scanner scn = new Scanner(System.in);

        x1 = scn.nextDouble();
        y1 = scn.nextDouble();
        x2 = scn.nextDouble();
        y2 = scn.nextDouble();

        System.out.printf("%.4f\n", Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));

        scn.close();
    }
}
