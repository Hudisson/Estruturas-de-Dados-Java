package TesteFila;

import com.hudisson.estruturadados.fila.FilaComPrioridade;

public class TesteFilaPrioridade {
    public static void main(String[] args) throws Exception{

        FilaComPrioridade<Integer> numeros = new FilaComPrioridade<Integer>();

        numeros.enfileirar(1);
        numeros.enfileirar(4);
        numeros.enfileirar(2);
        numeros.enfileirar(3);

        System.out.println("Fila de números....: "+numeros); // 1, 2, 3, 4
        System.out.println("Capacidade definida: "+numeros.capacidadeDefinda());
        System.out.println("Tamanho em uso.....: "+numeros.tamanho());
    }
}
