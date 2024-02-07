import com.hudisson.estruturadados.vetor.Vetor;

public class TesteVetor {
    
    public static void main(String[] args) throws Exception {
        
        Vetor vetor = new Vetor(3);
        
        vetor.adicionar("Teste-1");
        vetor.adicionar("Teste-2");
        vetor.adicionar("Teste-3");
        vetor.adicionar("Teste-4");

        System.out.println("Tamanho: "+ vetor.tamanho());

        System.out.println("Elementos: "+vetor);
        

        int i = 0;
        i++;
    }
}
