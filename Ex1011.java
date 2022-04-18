import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {
        int R;
        double pi = 3.14159, raio;

        Scanner scn = new Scanner(System.in);

        R = scn.nextInt();

        raio = (4/ 3.0) * pi * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f\n", raio);

        scn.close();
    }
}
