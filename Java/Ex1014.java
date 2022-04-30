import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        int x;
        double y;

        Scanner scn = new Scanner(System.in);

        x = scn.nextInt();
        y = scn.nextDouble();

        System.out.printf("%.3f km/l\n", x / y);

        scn.close();
    }
}
