package com.hudisson.estruturadados.lista;

public class ListaEncadeada<TIPO> {

    private No<TIPO> inicio;
    private No<TIPO> ultimo;
    private int tamanho = 0;

    gi/* Inserir no final da lista encadeada */
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

    /* Método que imprimi a lista */
    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }

}
