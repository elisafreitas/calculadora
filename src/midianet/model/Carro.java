package midianet.model;

public class Carro {
    public String cor;
    public String modelo;
    private int velocidade;
    private boolean farol;
    public int maxima;

    public void acelerar(int valor){
        if(velocidade + valor > maxima) throw new RuntimeException("Velocidade máxima e de :" + maxima );
        velocidade = velocidade + valor;
    }

    public void diminuir(int valor){
        if(velocidade - valor < 0){
            velocidade = 0;
        }else{
            velocidade = velocidade - valor;
        }
    }

    public void frear(){
        velocidade = 0;
    }

    public void getVelocidade(){
        System.out.println("A velocidade atual e de " + velocidade);
    }

    public void statusFarol(){
        String status =  farol ? "aceso" : "apagado";
        System.out.println("O farol esta " +  status );
    }

    public void acenderFarol(){
        farol = true;
    }

    public void apagarFarol(){
        farol = false;
    }

    public void descricao() {
        System.out.println(modelo + " " + cor);
    }

}