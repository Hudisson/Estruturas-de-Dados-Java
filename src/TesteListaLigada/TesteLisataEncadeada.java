package TesteListaLigada;

import com.hudisson.estruturadados.lista.ListaEncadeada;

public class TesteLisataEncadeada {

    public static void main(String[] args) throws Exception{
        
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        lista.adicionar(4);
        // lista.adicionar(3);
    
        System.out.println("\nLista........: "+lista.toString());
        System.out.println("Tamnho da lista: "+lista.getTamanho());

        lista.limpar();
        System.out.println("\nLista2........: "+lista.toString());
    }

}
