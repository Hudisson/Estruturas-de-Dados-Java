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

    /*Verificar elemento do topo */
    public TIPO topo(){
        if(this.estaVazio()){
            return null;
        }
        return super.elementos[(super.capacidadeEmUso)-1];
    }
}
