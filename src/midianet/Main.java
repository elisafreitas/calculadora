package midianet;

import midianet.calculadora.Display;
import midianet.model.Cachorro;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (Exception e) {
            e.printStackTrace();
        }
//        Cachorro cachorro = new Cachorro();
//        cachorro.apresentar();
        Display display = new Display();
    }
}


//        System.out.println("Hello World Elisa");
//        Calculadora calculadora = new Calculadora();
//        System.out.println(calculadora.somar(20,30));
//        System.out.println(calculadora.subtrair(80,30));
//        System.out.println(calculadora.multiplicar(100,3));
//        System.out.println(calculadora.dividir(29,5));
//        Carro carroA = new Carro();
//        carroA.cor = "Vermelho";
//        carroA.maxima = 300;
//        carroA.modelo = "Ferrari";
//
//        Carro carroB = new Carro();
//        carroB.cor = "Branco";
//        carroB.maxima = 80;
//        carroB.modelo = "Fusca";
//
//        carroA.descricao();
//        carroA.getVelocidade();
//        carroA.acelerar(120);
//        carroA.diminuir(20);
//        carroA.statusFarol();
//        carroA.acenderFarol();
//        carroA.statusFarol();
//        carroA.apagarFarol();
//        carroA.statusFarol();
//        carroA.getVelocidade();
//        carroA.statusFarol();
//
//        carroB.descricao();
//        carroB.getVelocidade();
//        carroB.acenderFarol();
//        carroB.acelerar(30);
//        carroB.acelerar(30);
//        carroB.diminuir(10);
//        carroB.frear();
//        carroB.getVelocidade();

//        Gato gato = new Gato();
//        Passaro passaro = new Passaro();
//
//        cachorro.nome = "totó";
//        cachorro.apresentar();
//        cachorro.Latir();
//        cachorro.acordar();
//        cachorro.comer();
//        cachorro.cagar();
//        cachorro.dormir();
//
//        gato.nome = "frida";
//        gato.apresentar();
//        gato.miar();
//        gato.acordar();
//        gato.comer();
//        gato.cagar();
//        gato.dormir();
//
//        gato.nome = "piu piu";
//        gato.apresentar();
//        passaro.voar();
//        passaro.acordar();
//        passaro.comer();
//        passaro.cagar();
//        passaro.dormir();