import java.util.Scanner;
import static java.lang.Integer.parseInt;


public class Ex1018 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int notasDezena;
        String notasCem = "0";

        String valor = String.valueOf(scn.nextInt());

        if (valor.length() > 2) {
            notasCem = valor.substring(0, valor.length() - 2);
            notasDezena = parseInt(valor.substring(valor.length() - 2));
        } else {
            notasDezena = parseInt(valor);
        }

        System.out.println(valor);

        for (int i = 0; i < 10; i++) {
            if (valor.length() > 2) {
                System.out.printf("%s nota(s) de R$ 100,00\n", notasCem);
            } else {
                System.out.println("0 nota(s) de R$ 100,00");
            }

            if (notasDezena >= 50) {
                System.out.println("1 nota(s) de R$ 50,00");
                notasDezena -= 50;
            } else {
                System.out.println("0 nota(s) de R$ 50,00");
            }

            if (notasDezena == 40) {
                System.out.println("2 nota(s) de R$ 20,00");
                notasDezena -= 40;
            } else if (notasDezena >= 20){
                System.out.println("1 nota(s) de R$ 20,00");
                notasDezena -= 20;
            } else  {
                System.out.println("0 nota(s) de R$ 20,00");
            }

            if (notasDezena >= 10) {
                System.out.println("1 nota(s) de R$ 10,00");
                notasDezena -= 10;
            } else {
                System.out.println("0 nota(s) de R$ 10,00");
            }

            if (notasDezena >= 5) {
                System.out.println("1 nota(s) de R$ 5,00");
                notasDezena -= 5;
            } else {
                System.out.println("0 nota(s) de R$ 5,00");
            }

            if (notasDezena >= 4) {
                System.out.println("2 nota(s) de R$ 2,00");
                notasDezena -= 4;
            } else if(notasDezena >= 2){
                System.out.println("1 nota(s) de R$ 2,00");
                notasDezena -= 2;
            } else {
                System.out.println("0 nota(s) de R$ 2,00");
            }

            if (notasDezena >= 1) {
                System.out.println("1 nota(s) de R$ 1,00");
                notasDezena -= 1;
            } else {
                System.out.println("0 nota(s) de R$ 1,00");
            }

            if (notasDezena == 0) {
                break;
            }
        }

        scn.close();
    }
}
