package TestesPilha;

import com.hudisson.estruturadados.pilha.Pilha;

public class TestePilha {
    
    public static void main(String[] args) throws Exception {
        Pilha<String> games = new Pilha<String>(3);

        System.out.println("Capacidade definida: "+games.capacidadeDefinda());
        games.empilhar("Resident evil 4 ");
        games.empilhar("Medal of honor");
        games.empilhar("Black");
        games.empilhar("Super Mario Bros");

        System.out.println("Cartas: "+games.toString());
        System.out.println("Tamanho em uso: "+ games.tamanho());
    }

}
