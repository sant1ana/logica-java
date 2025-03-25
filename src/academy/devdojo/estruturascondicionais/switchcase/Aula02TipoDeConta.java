package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class Aula02TipoDeConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tipo de conta para saber a porcentagem de juros:");
        System.out.println("1 - Conta Poupança");
        System.out.println("2 - Conta Corrente");
        System.out.println("3 - Conta Investimento");
        System.out.print("escolha? ");

        int conta = input.nextInt();

        switch (conta) {
            case 1:
                System.out.println("CONTA_POUPANÇA 0.05%");
                break;
            case 2:
                System.out.println("CONTA_CORRENTE 0.02%");
                break;
            case 3:
                System.out.println("CONTA_INVESTIMENTO 0.1%");
                break;
            default:System.out.println("Número inválido");
        }
        System.out.println("Fim do programa");
    }
}