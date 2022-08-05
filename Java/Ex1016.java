import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int km = scn.nextInt();

        System.out.printf("%d minutos\n", km * 2);

        scn.close();
    }
}