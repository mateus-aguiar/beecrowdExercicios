import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int diasTotais = scn.nextInt();
        int[] mesesAnos = {365, 30, 1};
        String[] nome = {"ano(s)", "mes(es)", "dia(s)"};


        for (int i = 0; i < nome.length; i++) {

            System.out.printf("%d %s\n", diasTotais / mesesAnos[i], nome[i]);

            diasTotais -= mesesAnos[i] * (diasTotais / mesesAnos[i]);
        }
    }
}
