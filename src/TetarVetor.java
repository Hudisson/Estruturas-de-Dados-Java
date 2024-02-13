import com.hudisson.estruturadados.vetor.Vetor;

public class TetarVetor {
    public static void main(String[] args) throws Exception {

        Vetor meuArray = new Vetor(2);

        System.out.println("\nCapacidade definda: "+ meuArray.capacidadeDefinda());
        System.out.println("Tamanho em uso....: "+ meuArray.tamanho());
        System.out.println("Elementos: "+meuArray);
        System.out.println("-------------------------------------------------------");

        meuArray.adicionar("Pistola");
        meuArray.adicionar("Munição-PS9mm-10");

        System.out.println("Capacidade definda: "+ meuArray.capacidadeDefinda());
        System.out.println("Tamanho em uso....: "+ meuArray.tamanho());
        System.out.println("Elementos: "+meuArray);
        System.out.println("-------------------------------------------------------");

        meuArray.adicionar(1,"Escopeta");
        meuArray.adicionar(2,"Munição-ES12-8");

        System.out.println("Capacidade definda: "+ meuArray.capacidadeDefinda());
        System.out.println("Tamanho em uso....: "+ meuArray.tamanho());
        System.out.println("Elementos: "+meuArray);
        System.out.println("-------------------------------------------------------");

        meuArray.adicionar(1,"Colete");
    
        System.out.println("Capacidade definda: "+ meuArray.capacidadeDefinda());
        System.out.println("Tamanho em uso....: "+ meuArray.tamanho());
        System.out.println("Elementos: "+meuArray);
        System.out.println("-------------------------------------------------------");

        meuArray.remove(4);
        meuArray.remove(0);

        System.out.println("Capacidade definda: "+ meuArray.capacidadeDefinda());
        System.out.println("Tamanho em uso....: "+ meuArray.tamanho());
        System.out.println("Elementos: "+meuArray);
        System.out.println("-------------------------------------------------------");

        
        System.out.println("Últimmo elemento:"+ meuArray.buscaElemento(meuArray.tamanho()-1));

        System.out.println("-------------------------------------------------------");

    }
}
