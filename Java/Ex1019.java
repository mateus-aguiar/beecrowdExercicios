import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int totalSegundos = scn.nextInt();

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = (totalSegundos %3600) % 60;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}
