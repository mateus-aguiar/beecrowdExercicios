import java.util.Scanner;

public class Ex1001 {
    public static void main(String[] args) {
        int A, B;
        Scanner scn = new Scanner(System.in);

        A = scn.nextInt();
        B = scn.nextInt();

        System.out.println("X = " + (A + B));
        scn.close();
    }
}
