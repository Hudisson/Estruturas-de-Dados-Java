import com.hudisson.estruturadados.vetor.VetorObjeto;

public class TestarVetorObj {
    
    public static void main(String[] args) throws Exception{

        VetorObjeto meuArray = new VetorObjeto(3);

        meuArray.adicionar(30);
        meuArray.adicionar("Laptop");
        meuArray.adicionar(5.7);

        meuArray.adicionar(1,"Smartphone");
        meuArray.adicionar(2, 28);

        System.out.println("\nItens:"+ meuArray);

        Object obj = "Smartphone";

        System.out.println("\nO Item < "+ obj +" > existe: "+meuArray.buscaExite(obj));
        System.out.println("O Item < "+ obj +" > existe na posição: "+ meuArray.existeNaPosicao(obj));

        System.out.println("\nCapacidade definda: "+ meuArray.capacidadeDefinda());
        System.out.println("Tamanho em uso....: "+ meuArray.tamanho());
        System.out.println("-------------------------------------------------------");


    }
}
