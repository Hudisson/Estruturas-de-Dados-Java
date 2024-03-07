package com.hudisson.estruturadados.lista;

public class No<TIPO> {

    private TIPO elemento;
    private No<TIPO> proximo;

    
    /* Método Construtor */
    public No(TIPO elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    /* Método Construtor */
    public No(TIPO elemento, No<TIPO> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public TIPO getElemento() {
        return elemento;
    }

    public void setElemento(TIPO elemento) {
        this.elemento = elemento;
    }

    public No<TIPO> getProximo() {
        return proximo;
    }

    public void setProximo(No<TIPO> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
    }

}
