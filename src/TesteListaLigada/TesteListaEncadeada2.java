package TesteListaLigada;

import com.hudisson.estruturadados.lista.ListaEncadeada;

public class TesteListaEncadeada2 {
    
    public static void main(String[] args) throws Exception{
        ListaEncadeada<String> nomes = new ListaEncadeada<String>();
        nomes.adicionar(0,"Teste");
        nomes.adicionar("Fulano");
        nomes.adicionar("Beltrano");
        nomes.adicionar("Ciclano");

        System.out.println("\nLista de Nomes");
        System.out.println("Lista: "+ nomes +"\n");

        System.out.println("Inserir no início:");
        nomes.adicionar(0, "NovoNome1");
        System.out.println("Lista: "+ nomes +"\n");

        System.out.println("Inserir no meio:");
        nomes.adicionar(2, "NovoNome2");
        System.out.println("Lista: "+ nomes +"\n");

        System.out.println("Inserir no final:");
        nomes.adicionar(4, "NovoNome3");
        System.out.println("Nomes: "+ nomes +"\n");

        System.out.println("\nRemover do início:");
        System.out.println("Removido: "+ nomes.removerInicio());
        System.out.println("Lista: "+ nomes +"\n");


    }
}
