import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {
        double a, b, c;

        Scanner scn = new Scanner(System.in);

        a = scn.nextDouble();
        b = scn.nextDouble();
        c = scn.nextDouble();

        System.out.printf("TRIANGULO: %.3f\n", (a * c) / 2);
        System.out.printf("CIRCULO: %.3f\n", 3.14159 * Math.pow(c, 2));
        System.out.printf("TRAPEZIO: %.3f\n", ((a + b) * c) / 2);
        System.out.printf("QUADRADO: %.3f\n", b * b);
        System.out.printf("RETANGULO: %.3f\n", a * b);

        scn.close();
    }
}
