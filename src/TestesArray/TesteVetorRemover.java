package TestesArray;
import com.hudisson.estruturadados.vetor.ListaOld;

public class TesteVetorRemover {
    public static void main(String[] args) throws Exception {
        ListaOld<String> itens = new ListaOld<String>(8);

        itens.adicionar("Mouse");
        itens.adicionar("Teclado");
        itens.adicionar("Câmera");
        itens.adicionar("Monitor");
        itens.adicionar("Mouse");
        itens.adicionar("Mouse");
        itens.adicionar("Celular");


       System.out.println("---------------------------------------------------------------");

       String buscaIten = "Mouse";

       System.out.println("\nCom itens repetidos: "+ itens.toString());

       if(itens.removeClones(buscaIten)){
        System.out.println("Sem itens repetidos: "+ itens.toString()+"\n\n");
        System.out.println("Elemento duplicado <"+buscaIten+"> Removido");
       
       }else{
        System.out.println("Não removido");
        System.out.println("\n\nItens: "+ itens.toString()+"\n\n");
       }

       System.out.println("---------------------------------------------------------------");

        itens.limpar();
        System.out.println("Itens: "+itens.toString());
    }
}
