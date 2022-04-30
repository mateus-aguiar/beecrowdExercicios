import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        double A, B, C, MEDIA;
        Scanner scn = new Scanner(System.in);

        A = scn.nextDouble();
        B = scn.nextDouble();
        C = scn.nextDouble();

        MEDIA = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);

        System.out.printf("MEDIA = %.1f\n", MEDIA);

        scn.close();
    }
}
