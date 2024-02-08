import com.hudisson.estruturadados.vetor.Vetor;

public class TesteVetor {
    
    public static void main(String[] args) throws Exception {
        
        Vetor vetor = new Vetor(4);
        
        vetor.adicionar("Faca");    // 0
        vetor.adicionar("Pistola"); // 1
        vetor.adicionar("Rifle");   // 2
        vetor.adicionar("Mapa");    // 3

        System.out.println("Tamanho: "+ vetor.tamanho());
        System.out.println("Elementos: "+vetor);
        System.out.println("Item: "+ vetor.buscaElemento(3));
        
        

        int i = 0;
        i++;
    }
}
