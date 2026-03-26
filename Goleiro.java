import java.util.Scanner;

public class Goleiro {
    private String nome;

    public Goleiro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String defender(Scanner scanner) {
        String lado;
        do {
            System.out.print(nome + ", escolha o lado para defender (E = Esquerda, C = Centro, D = Direita): ");
            lado = scanner.nextLine().toUpperCase().trim();
        } while (!lado.equals("E") && !lado.equals("C") && !lado.equals("D"));

        System.out.println(nome + " pulou para o lado " + lado);
        return lado;
    }
}
