package TestesArray;
import com.hudisson.estruturadados.vetor.ListaOld;

public class VetorGenerico {
    
    public static void main(String[] args) throws Exception {
      
        ListaOld<String> nome = new ListaOld<String>(3);

        nome.adicionar("Fulano");
        nome.adicionar("Ciclano");
        nome.adicionar("Beltrano");

        nome.adicionar(2, "TEXTO");
        nome.adicionar(2,"Fulano");

        System.out.println("\nNomes: "+ nome);

        String busca = "Fulano";

        if(nome.buscaExite(busca) == true){

            System.out.println("\nContém: SIM, na posição: " + nome.existeNaPosicao(busca) + "\n");

        }else{

            System.out.println("\nContém: NÃO\n");
        }

       System.out.println("Último vez que aparece no array - indice: "+nome.ultimoIndice(busca));
       System.out.println("Tamanho: "+nome.tamanho());

    }
    
}
