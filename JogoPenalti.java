import java.util.Scanner;

public class JogoPenalti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" JOGO DE PÊNALTI  2 JOGADORES \n");

        System.out.print("Nome do Atacante : ");
        String atacante = scanner.nextLine().trim();

        System.out.print("Nome do Goleiro: ");
        String goleiro = scanner.nextLine().trim();

        int gols = 0;
        int defesas = 0;
        int totalPenaltis = 3; 

        System.out.println("\nMelhor de 3 pênaltis! O " + atacante + " vai chutar " + totalPenaltis + " vezes.\n");

        for (int i = 1; i <= totalPenaltis; i++) {
            System.out.println("--- PÊNALTI " + i + " ---");

            
            System.out.print(atacante + ", escolha o lado para chutar (E = Esquerda, C = Centro, D = Direita): ");
            String chute = lerLado(scanner);

            
            System.out.println("\n".repeat(20));
            System.out.println(">>> VEZ DO GOLEIRO <<<");

            
            System.out.print(goleiro + ", escolha o lado para defender (E/C/D): ");
            String defesa = lerLado(scanner);

            
            System.out.println("\nO chute foi para: " + chute);

            if (chute.equals(defesa)) {
                System.out.println("→ DEFESA! " + goleiro + " pegou o pênalti!\n");
                defesas++;
            } else {
                System.out.println("→ GOOOOL!!! " + atacante + " marcou!\n");
                gols++;
            }
        }

        
        System.out.println("\n=== FIM DE JOGO ===");
        System.out.println(atacante + " fez " + gols + " gol(s)");
        System.out.println(goleiro + " fez " + defesas + " defesa(s)");

        if (gols > defesas) {
            System.out.println("🏆 " + atacante + " VENCEU!");
        } else if (defesas > gols) {
            System.out.println("🏆 " + goleiro + " VENCEU!");
        } else {
            System.out.println("🤝 Empate!");
        }

        scanner.close();
    }

    
    private static String lerLado(Scanner scanner) {
        String lado;
        do {
            lado = scanner.nextLine().toUpperCase().trim();
        } while (!lado.equals("E") && !lado.equals("C") && !lado.equals("D"));
        return lado;
    }
}