import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {
        int a, b, c, maior;

        Scanner scn = new Scanner(System.in);

        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();

        maior = (a + b + Math.abs(a - b)) / 2;

        if (maior < c) {
            maior = c;
        }

        System.out.println(maior + " eh o maior");

        scn.close();
    }
}
