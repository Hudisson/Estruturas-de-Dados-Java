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

    /* Adicionar em qualquer posição da lista encadeada */
    public void adicionar(int posicao, TIPO elemento){

        if(posicao < 0 || posicao > this.tamanho){
            throw new IllegalArgumentException("Posição inválida");
        }

        if(posicao == 0){ // se a lista está vazia

            this.adicionaInicio(elemento);

        }else if(posicao == this.tamanho){ // adicionar no final
            this.adicionar(elemento);

        }else{ // adicionar no meio
            No<TIPO> noAnterior = this.buscarNo(posicao);
            No<TIPO> proximoNo = noAnterior.getProximo();
            No<TIPO> novoNo = new No<TIPO>(elemento,proximoNo);
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }

    }

    private void adicionaInicio(TIPO elemento){
        if(this.tamanho == 0){
            No<TIPO> novoNo = new No<TIPO>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        }else{
            No<TIPO> novoNo = new No<TIPO>(elemento, this.inicio);
            this.inicio = novoNo;
        }

        this.tamanho++;
    }

    /* Método para remover do início da lista */
    public TIPO removerInicio(){

        if(this.tamanho == 0){
            throw new RuntimeException("A lista está vazia.");
        }

        TIPO removido = this.inicio.getElemento();
        this.inicio = inicio.getProximo();
        this.tamanho--;

        if(this.tamanho == 0){ // se o tamanho passa a ser zero depois que remover o elemento
            this.ultimo = null;
        }

        return removido;

    }

    /* Método para remover do final da lista */
    public TIPO removerFinal(){

        if(this.tamanho == 0){
            throw new RuntimeException("A lista está vazia.");
        }

        if(this.tamanho == 1){
            return this.removerInicio();
        }

        TIPO removido = this.ultimo.getElemento();
        this.ultimo = buscarNo(this.tamanho-1);
        this.ultimo.setProximo(null);
        this.tamanho--;

        if(this.tamanho == 0){ // se o tamanho passa a ser zero depois que remover o elemento
            this.ultimo = null;
        }

        return removido;
    }

    /* Método para remover de qualquer posição */
    public TIPO remover(int posicao){

        if(posicao < 0 || posicao > this.tamanho){
            throw new IllegalArgumentException("Posição inválida");
        }

        if(posicao == 0){ return removerInicio(); }
        if(posicao == this.tamanho){ return removerFinal(); }

        TIPO removido = this.buscarNo(posicao).getElemento();

        No<TIPO> noAterior = this.buscarNo( posicao -1);
        No<TIPO> noAtual = noAterior.getProximo();
        No<TIPO> proximo = noAtual.getProximo();
        noAterior.setProximo(proximo);
        noAtual.setProximo(null);
        this.tamanho--;

        return removido;
    }

    /* Método para obter o tamanho da lista */
    public int getTamanho(){
        return this.tamanho;
    }

    /* Busca na lista por posição e retorna o elemento */
    private No<TIPO> buscarNo(int posicao){

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
        return this.buscarNo(posicao).getElemento();
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
