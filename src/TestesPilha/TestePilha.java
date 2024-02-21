package TestesPilha;

import com.hudisson.estruturadados.pilha.Pilha;

public class TestePilha {
    
    public static void main(String[] args) throws Exception {
        Pilha<Integer> pilha = new Pilha<Integer>(3);

        System.out.println("Capacidade definida: "+pilha.capacidadeDefinda());
    }

}
