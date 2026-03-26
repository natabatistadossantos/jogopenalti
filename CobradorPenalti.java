import java.util.Scanner;

public class CobradorPenalti {
    private String nome;

    public CobradorPenalti(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Método corrigido - NÃO mostra onde chutou
    public String chutar(Scanner scanner) {
        String lado;
        do {
            System.out.print(nome + ", escolha o lado para chutar (E = Esquerda, C = Centro, D = Direita): ");
            lado = scanner.nextLine().toUpperCase().trim();
        } while (!lado.equals("E") && !lado.equals("C") && !lado.equals("D"));

        // NÃO imprime o lado aqui! (essencial para o jogo não revelar)
        return lado;
    }
}