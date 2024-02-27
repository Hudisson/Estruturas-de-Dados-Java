package TesteFila;

import com.hudisson.estruturadados.fila.Fila;

public class TesteFila{

    public static void main(String[] args) throws Exception{
        
        Fila<String> pessoas = new Fila<String>();

        System.out.println("\nCapacidade definida: "+pessoas.capacidadeDefinda());
        System.out.println("Tamanho em uso.......: "+pessoas.tamanho());
        System.out.println("A Fila está vazia: "+ pessoas.estaVazio());
        
    }
}
