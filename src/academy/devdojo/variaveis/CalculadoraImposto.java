package academy.devdojo.variaveis;

public class CalculadoraImposto {
    public static void main(String[] args) {
        float valorSalario = 1412.00F;
        float valorPorcentagem = 30;
        float porcentagemDoSalario = valorSalario * (valorPorcentagem / 100) ;

        System.out.println(porcentagemDoSalario);
    }
}

