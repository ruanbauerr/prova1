import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas irao votar? ");
        int q = scanner.nextInt();

        System.out.println(
                "1-Taffismo Club" +
                        "2-Patinho Branquinho" +
                        "3-Lucas FC" +
                        "4-Sports redes FC");

        double voto = 0;
        for (int i = 0; i < q; i++) {
            System.out.print("Digite o voto da pessoa " + (i + 1) + ": ");
            voto += scanner.nextDouble();
        }

    }
}
