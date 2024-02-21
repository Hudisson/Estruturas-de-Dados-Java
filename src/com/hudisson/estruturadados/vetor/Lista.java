package com.hudisson.estruturadados.vetor;

import com.hudisson.estruturadados.base.EstruturaEstatica;

public class Lista<TIPO> extends EstruturaEstatica<TIPO> {

    /* Construtor com parâmentro */
    public Lista(int capacidade){
        super(capacidade);
    }

     /* Construtor sem parâmentro */
    public Lista(){
        super();
    }

    /* Retorna a capacidade em uso */
    public int tamanho(){
        return super.tamanho();
    }

    /* Retorna a capacidade definida */
    public int Capacidade(){
        return super.capacidadeDefinda();
    }
    
    /* Adiciona no no final */
    public boolean adicionar(TIPO valor){
        return super.adicionar(valor);
    }

    /* Adiciona em qualquer posição */
    public boolean adicionar(int posicao, TIPO valor){
        return super.adicionar(posicao, valor);
    }

    /* Remove elemento da posição informada */
    public void remove(int posicao){
        super.remove(posicao);
    }

    /* Remove pelo nome apartir da primeira ocorrência */
    public boolean removerElemento(TIPO valor){
        return super.removerElemento(valor);
    }

    /* Obter elemento de uma poção */
    public TIPO getElemento(int posicao){
        return super.buscaElemento(posicao);
    }

    /* Verificar se um elemento existe no array (True or False) */
    public boolean contem(TIPO valor){
        return super.buscaExite(valor);
    }

      /*
     * Verficar se elemento existe no vetor , se existir, retornar a posição, se
     * não, retornar -1
     */
    public int contemEm(TIPO valor){
        return super.existeNaPosicao(valor);
    }

    /* Retorna o último indice que um elemento aparece. */
    public int lastIndice(TIPO valor){
        return super.ultimoIndice(valor);
    }

    /* Limpar array/vetores */
    public void limpar(){
        super.limpar();
    }
}
