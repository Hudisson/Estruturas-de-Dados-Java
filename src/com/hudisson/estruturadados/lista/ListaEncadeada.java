package com.hudisson.estruturadados.lista;

public class ListaEncadeada<TIPO> {

    private No<TIPO> inicio;

    public void adicionar(TIPO elemento){
        No<TIPO> celula = new No<TIPO>(elemento);
        this.inicio = celula;
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }

}
