package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu sexo M ou F: ");
        String sexo = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        if((sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) && idade < 18) {
            System.out.print("Alistamento não permitido");
        } else if (sexo.equalsIgnoreCase("M") && idade >= 18) {
            System.out.print("Alistamento obrigatório");
        } else if (sexo.equalsIgnoreCase("F") && idade >= 18) {
            System.out.print("Deseja se alistar?");
        } else {
            System.out.print("Sexo inválido");
        }
    }
}
