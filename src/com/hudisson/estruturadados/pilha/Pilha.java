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

    /*Verificar elemento do topo (Peek)*/
    public TIPO topo(){
        if(this.estaVazio()){
            return null;
        }
        return super.elementos[(super.capacidadeEmUso)-1];
    }
    /* Remover elemento do topo */
    public TIPO desempilhar(){

      if(this.estaVazio()){
        return null;
      }  

    //   TIPO elemento = this.elementos[(super.capacidadeEmUso)-1];
    //   this.capacidadeEmUso--;
      return this.elementos[capacidadeEmUso--];
    }
}
