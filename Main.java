public class Main {
    public static void main(String[] args){
        Carro meuCarro = new Carro("Fusca", 2000);
        Carro meuCarro1 = new Carro("Sandero", 2015);
        Carro meuCarro2 = new Carro("BMW", 2016);

        meuCarro.acelerar();
        meuCarro1.acelerar();
        meuCarro2.acelerar();
    }
}

class Carro{

    // Atributos
    String modelo;
    int ano;

    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos (Implementações da classe -> lógica ou tarefa)
    // o void significa que a intenção é de não retornar nada
    public void acelerar(){
        System.out.println("Acelerando " + this.modelo + "... Ano: " + this.ano);
    }
}
