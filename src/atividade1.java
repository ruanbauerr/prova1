import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a quantidade de alimentos? ");
        int n = scanner.nextInt();

        double nota = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota" + (i + 1) + "(de 0 a 10): ");
            nota += scanner.nextDouble();
        }
        double media = nota / n;
        System.out.println("A média das notas dos alimentos é: " + media);
    }
    }
