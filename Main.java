import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        // Variáveis

        // Tipo, nome e/ou atribuir valor
        int minhaIdade = 20;
        var meuNome = "Juan";

        /*
            Tipos Primitivos
                Números inteiros
                   byte -> 8 bits => -128 a 127
                   short -> 16 bits => -32.768 a 32.767
                   int -> 32 bits => -2.147.483.648 a 2.147.483.647
                   long -> 64 bits -=> -9.223.372.036.854.775.808 a  9.223.372.036.854.775.807

                Números decimais
                    float -> 32 bits => Precisão simples
                    double -> 64 bits => Precisão dupla

                Strings
                    String -> Representar palavras e frases (é uma Classe nativa, não um tipo primitivo)
                    char ->  Representar um único caractere

                Boolean
                    boolean -> True ou False
         */

        // Condicionais
        byte b = 100;
        short s = 10000;
        // int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Juan";
        boolean bool = false;

        // como o bool já foi declarado
        if (bool) {
            System.out.println("Verdadeiro");
        } else{
            System.out.println("Falso");
        }

        // Array
        // Tamanho fixo com os valores
        int[] colecaoDeInteiros = {1, 2, 3, 4, 5};

        // Tamanho fixo sem os valores
        int[] meusNumeros = new int[5];

        // Print de um valor específico
        System.out.println(colecaoDeInteiros[0]);

        // Saber tamanho do array
        System.out.println(colecaoDeInteiros.length);

        // Array list (Necessita fazer import)
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Juan");
        nomes.add("Leo");
        nomes.add("Maria");

        System.out.println(nomes.get(0));

        nomes.remove(0);

        System.out.println(nomes.get(0));

        nomes.remove("Leo");

        System.out.println(nomes.get(0));

        // Loops
        // variavel de interação, condicional e atribuição/manipulação
        // For
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        for(String nome : nomes){
            System.out.println(nome);
        }

        // While
        int contador = 0;
        while(contador < 10){
            System.out.println("Estou no while");
            contador++;
        }

        // Casting - conversão de tipos de dados
        double resultado = 0.0;
        int resultadoInt = (int)resultado;

        int meuInt = 10;
        double meuDouble = (double)meuInt;

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        String minhaString = String.valueOf(meuInt2);
    }

}
