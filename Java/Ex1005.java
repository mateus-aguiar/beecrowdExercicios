import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
        double A, B, MEDIA;
        Scanner scn = new Scanner(System.in);

        A = scn.nextDouble();
        B = scn.nextDouble();

        MEDIA = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f\n", MEDIA);

        scn.close();
    }
}
