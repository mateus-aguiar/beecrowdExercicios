import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        String A;
        double C, B, TOTAL;
        Scanner scn = new Scanner(System.in);

        A = scn.nextLine();
        B = scn.nextDouble();
        C = scn.nextDouble();

        TOTAL = B + (C * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", TOTAL);

        scn.close();
    }
}
