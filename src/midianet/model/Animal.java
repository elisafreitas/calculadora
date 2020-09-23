package midianet.model;

public abstract class Animal {

    public String nome;

    public void apresentar(){
        System.out.println("Ola, eu sou o " + nome);
    }

    public void dormir(){
        System.out.println("Estou dormindo");
    }

    public void acordar(){
        System.out.println("Estou acordado");
    }

    public void comer(){
        System.out.println("Estou comendo");
    }

    public void cagar(){
        System.out.println("Estou cagando");
    }

}
