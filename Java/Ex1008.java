import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        int A, B;
        double C, SALARY;
        Scanner scn = new Scanner(System.in);

        A = scn.nextInt();
        B = scn.nextInt();
        C = scn.nextDouble();

        SALARY = B * C;

        System.out.println("NUMBER = " + A);
        System.out.printf("SALARY = U$ %.2f\n", SALARY);

        scn.close();
    }
}
