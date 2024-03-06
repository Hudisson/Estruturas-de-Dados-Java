package TesteListaLigada;

import com.hudisson.estruturadados.lista.ListaEncadeada;

public class TesteLisataEncadeada {

    public static void main(String[] args) throws Exception{
        
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.adicionar(1);
    
        System.out.println("\nLista: "+lista);
    }

}
