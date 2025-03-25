package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04Login {
    public static void main(String[] args){
        final String login ="vanessa";
        final String senha = "viradonojiraya";
        boolean exibirTelaDeLogin = true;
        Scanner Scanner = new Scanner(System.in);
        while(exibirTelaDeLogin) {
            System.out.println("Digite seu login");
            String loginDigitado = Scanner.nextLine();
            System.out.println("Digite sua senha");
            String senhaDigitado = Scanner.nextLine();
            if (login.equals(loginDigitado) && senha.equals(senhaDigitado)) {
                System.out.println("Acesso Concedido");
                exibirTelaDeLogin = false;
                break;
            }
            System.out.println("Acesso Negado");

        }

    }

}


