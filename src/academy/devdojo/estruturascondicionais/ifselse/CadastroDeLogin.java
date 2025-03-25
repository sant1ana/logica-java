package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        if (nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")) {
            System.out.print("usuário inválido ");
        }else{
            System.out.print(nome + " cadastrado com sucesso ");
        }

    }
}
