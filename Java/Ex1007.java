import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        int A, B, C, D, DIFERENCA;
        Scanner scn = new Scanner(System.in);

        A = scn.nextInt();
        B = scn.nextInt();
        C = scn.nextInt();
        D = scn.nextInt();

        DIFERENCA = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);

        scn.close();
    }
}
