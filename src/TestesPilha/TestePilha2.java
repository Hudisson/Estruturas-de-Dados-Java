package TestesPilha;

import com.hudisson.estruturadados.pilha.Pilha;

public class TestePilha2 {
    public static void main(String[] args) throws Exception {
        Pilha<String> games = new Pilha<String>();

        System.out.println("\nCapacidade definida: " + games.capacidadeDefinda());

        games.empilhar("Resident evil 4 ");
        games.empilhar("Medal of honor");
        games.empilhar("Black");
        games.empilhar("Super Mario Bros");

        System.out.println("\nGames: " + games.toString());
        System.out.println("Tamanho em uso: " + games.tamanho());

        System.out.println("\nElemento do topo: "+games.topo());
        System.out.println("Remover elemento do topo: "+games.desempilhar());

        System.out.println("\nGames: " + games.toString());
        System.out.println("Tamanho em uso: " + games.tamanho());
        System.out.println("Elemento do topo: "+games.topo());
    }
}
