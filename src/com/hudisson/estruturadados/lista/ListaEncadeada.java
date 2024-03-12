package com.hudisson.estruturadados.lista;

public class ListaEncadeada<TIPO> {

    private No<TIPO> inicio;
    private No<TIPO> ultimo;
    private int tamanho = 0;
    private final int NAO_ENCONTRADO = -1;

    /* Inserir no final da lista encadeada */
    public void adicionar(TIPO elemento){

        No<TIPO> celula = new No<TIPO>(elemento);

        if(tamanho == 0){
            this.inicio = celula;
        }else{
            this.ultimo.setProximo(celula);
        }
      
        this.ultimo = celula;
        this.tamanho++;
    }

    /* Método para obter o tamanho da lista */
    public int getTamanho(){
        return this.tamanho;
    }

    /* Busca na lista por posição e retorna o elemento */
    private No<TIPO> bucarNo(int posicao){

            if(!(posicao >= 0 && posicao <= this.tamanho)){
            throw new IllegalArgumentException("NÃO EXISTE");
        }

        No<TIPO> noAtual = this.inicio;
        for(int i = 0; i < posicao; i++){
            noAtual = noAtual.getProximo();
        }
        
        return noAtual;
    }

    public TIPO buscarPosicao(int posicao){
        return this.bucarNo(posicao).getElemento();
    }

    /* Pesquisa se um determinado elemento existe na lista  */
    public int buscarElemento(TIPO elemento){

        No<TIPO> noAtual = this.inicio;
        int posicao = 0;

        while (noAtual != null) {

            if(noAtual.getElemento().equals(elemento)){
                return posicao;
            }
            posicao++;
            noAtual = noAtual.getProximo();

        }

        return NAO_ENCONTRADO;
    }

    /* Limpa a lista */
    public void limpar(){

        /* define os valores de cada nó como null */
       for(No<TIPO> atual = this.inicio; atual != null;){
            No<TIPO> proximoNo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximoNo;
       }

       this.inicio = null;
       this.ultimo = null;
       this.tamanho = 0;
    }

    /* Método que imprimi a lista (Percorrer a lista) */
    @Override
    public String toString() {

        if(tamanho == 0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder();

        No<TIPO> atual = this.inicio;

       
        for(int i = 0; i < this.tamanho-1; i++){
            builder.append(atual.getElemento()).append(", ");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento());

        return builder.toString();
    }

}
