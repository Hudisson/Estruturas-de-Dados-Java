package TestesPilha;

import com.hudisson.estruturadados.pilha.Pilha;

public class TestePilha {
    
    public static void main(String[] args) throws Exception {
        Pilha<String> cartas = new Pilha<String>(3);

        System.out.println("Capacidade definida: "+cartas.capacidadeDefinda());
    }

}
