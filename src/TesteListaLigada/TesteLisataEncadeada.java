package TesteListaLigada;

import com.hudisson.estruturadados.lista.ListaEncadeada;

public class TesteLisataEncadeada {

    public static void main(String[] args) throws Exception{
        
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        lista.adicionar("Texto-1");
        lista.adicionar("Texto-2");
        lista.adicionar("Texto-3");
        lista.adicionar("Texto-4");
       
    
        System.out.println("\nLista........: "+lista.toString());
        System.out.println("Tamnho da lista: "+lista.getTamanho());

        System.out.println("\nBUSCA POR POSIÇÃO");
        System.out.println("elemento [0]: "+lista.buscarPosicao(0));
        System.out.println("Elemento [1]: "+lista.buscarPosicao(1));
        System.out.println("Elemento [2]: "+lista.buscarPosicao(2));
        System.out.println("Elemento [3]: "+lista.buscarPosicao(3));

        System.out.println("\nBUSCA POR ELEMENTO");
        System.out.println("Texto-1 Posição: "+lista.buscarElemento("Texto-1"));
        System.out.println("Texto-2 Posição: "+lista.buscarElemento("Texto-2"));
        System.out.println("Texto-3 Posição: "+lista.buscarElemento("Texto-3"));
        System.out.println("Texto-4 Posição: "+lista.buscarElemento("Texto-4"));
    

        lista.limpar();
        System.out.println("\nLista2........: "+lista.toString());
        
        
    }

}
