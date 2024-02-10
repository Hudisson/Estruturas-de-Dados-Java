import com.hudisson.estruturadados.vetor.Vetor;

public class TesteVetor {
    
    public static void main(String[] args) throws Exception {
        
        Vetor vetor = new Vetor(10);
        
        vetor.adicionar("Faca");    // 0
        vetor.adicionar("Pistola"); // 1
        vetor.adicionar("Rifle");   // 2
        vetor.adicionar("Mapa");    // 3
        vetor.adicionar("Mochila");    // 4



        System.out.println("Tamanho: "+ vetor.tamanho());
        System.out.println("Capacidade: "+vetor.capacidadeDefinda());
        System.out.println("---------------------------------");
        // System.out.println("Existe: "+ vetor.buscaExite("Mapa"));
        // System.out.println("Existe na posição: "+ vetor.existeNaPosicao("Mapa"));
        // System.out.println("Item: "+ vetor.buscaElemento(3));

        System.out.println("Elementos: "+vetor);
        vetor.adicionar(4, "TESTE-NOVO");
        System.out.println("Elementos: "+vetor);

        System.out.println("---------------------------------");
        System.out.println("Tamanho: "+ vetor.tamanho());
        System.out.println("Capacidade: "+vetor.capacidadeDefinda());
    }
}
