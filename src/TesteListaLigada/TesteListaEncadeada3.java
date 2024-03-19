package TesteListaLigada;

import com.hudisson.estruturadados.lista.ListaEncadeada;

public class TesteListaEncadeada3 {
    
    public static void main(String[] args) throws Exception{

        ListaEncadeada<String> letras = new ListaEncadeada<String>();
        letras.adicionar("A");
        letras.adicionar("B");
        letras.adicionar("C");
        letras.adicionar("D");

        System.out.println("\nLetras: "+letras);
        System.out.println("Tamanho: "+letras.getTamanho());

        System.out.println("\nRemover do final");
        System.out.println("Removido: "+letras.removerFinal());
        System.out.println("Letras: "+letras);
        System.out.println("Tamanho: "+letras.getTamanho());
    }
}
