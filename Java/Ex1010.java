import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        int A, B;
        double C, TOTAL;
        Scanner scn = new Scanner(System.in);

        A = scn.nextInt();
        B = scn.nextInt();
        C = scn.nextDouble();

        TOTAL = B * C;

        A = scn.nextInt();
        B = scn.nextInt();
        C = scn.nextDouble();

        TOTAL += B * C;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", TOTAL);

        scn.close();
    }
}
