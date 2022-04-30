import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {
        int A, B, PROD;
        Scanner scn = new Scanner(System.in);

        A = scn.nextInt();
        B = scn.nextInt();

        PROD = A * B;
        System.out.println("PROD = " + PROD);

        scn.close();
    }
}
