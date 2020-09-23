package midianet.calculadora;

public class Calculadora {

    public double somar(double valor1, double valor2){
        return valor1 + valor2;
    }

    public double subtrair(double valor1, double valor2){
        return valor1 - valor2;
    }

    public double multiplicar(double valor1, double valor2){
        return valor1 * valor2;
    }

    public double dividir(double valor1, double valor2){
        if(valor2 == 0) throw new RuntimeException("Não pode dividir por zero");
        return valor1 / valor2;
    }

}
