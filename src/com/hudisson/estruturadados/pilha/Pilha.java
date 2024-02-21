package com.hudisson.estruturadados.pilha;

import com.hudisson.estruturadados.base.EstruturaEstatica;

public class Pilha<TIPO> extends EstruturaEstatica<TIPO> {

    public Pilha(int capacidade){
        super(capacidade);
    }

    public Pilha(){
        super();
    }

    /* Empilhar - Adiciona no topo da pilha */
    public void empilhar(TIPO valor){
        super.adicionar(valor);
    }

    
}
