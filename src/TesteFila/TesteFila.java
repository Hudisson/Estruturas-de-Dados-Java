package TesteFila;

import com.hudisson.estruturadados.fila.Fila;

public class TesteFila{

    public static void main(String[] args) throws Exception{
        
        Fila<String> pessoas = new Fila<String>();

        System.out.println("\nCapacidade definida: "+pessoas.capacidadeDefinda());
        System.out.println("Tamanho em uso.......: "+pessoas.tamanho());
        System.out.println("A Fila está vazia? "+ pessoas.estaVazio());

        System.out.println("\nEnfileirar");
        pessoas.enfileirar("Fulano");
        pessoas.enfileirar("Ciclano");
        pessoas.enfileirar("Beltrano");

        System.out.println("\nTamanho em uso.......: "+pessoas.tamanho());
        System.out.println("A Fila está vazia: "+ pessoas.estaVazio());
        System.out.println("Fila: "+pessoas);

        System.out.println("\nElemento do início da fila: "+pessoas.espiar());

        System.out.println("\nDesenfileirar: ");
        System.out.println("Removido: "+pessoas.desenfileirar());
        System.out.println("Fila: "+pessoas);
        System.out.println("Removido: "+pessoas.desenfileirar());
        System.out.println("Fila: "+pessoas);
        System.out.println("Removido: "+pessoas.desenfileirar());
        System.out.println("Fila: "+pessoas);
        System.out.println("Removido: "+pessoas.desenfileirar());
        System.out.println("Fila: "+pessoas);


    }
}
