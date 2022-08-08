import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int tempoPercorrido = scn.nextInt();
        int velMedia = scn.nextInt();

        System.out.printf("%.3f\n", ((tempoPercorrido * velMedia) / 12.0));

        scn.close();
    }
}