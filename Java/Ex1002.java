import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {
        double A, n = 3.14159;
        Scanner scn = new Scanner(System.in);

        A = scn.nextDouble();

        System.out.printf("A=%.4f \n", (n * Math.pow(A, 2)));

        scn.close();
    }
}
