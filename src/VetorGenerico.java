import com.hudisson.estruturadados.vetor.Lista;

public class VetorGenerico {
    
    public static void main(String[] args) throws Exception {
      
        Lista<String> nome = new Lista<String>(3);

        nome.adicionar("Fulano");
        nome.adicionar("Ciclano");
        nome.adicionar("Beltrano");

        nome.adicionar(2, "TEXTO");

        System.out.println("\nNomes: "+ nome);

        String busca = "TEXTO";

        if(nome.buscaExite(busca) == true){

            System.out.println("\nContém: SIM, na posição: " + nome.existeNaPosicao(busca) + "\n");

        }else{

            System.out.println("\nContém: NÃO\n");
        }

    }
    
}
