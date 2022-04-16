import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {
        int A, B, SOMA = 0;
        Scanner scn = new Scanner(System.in);

        A = scn.nextInt();
        B = scn.nextInt();

        SOMA = A + B;
        System.out.println("SOMA = " + SOMA);

        scn.close();
    }
}
