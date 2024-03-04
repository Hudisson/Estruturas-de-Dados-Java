package com.hudisson.estruturadados.fila;

import com.hudisson.estruturadados.base.EstruturaEstatica;

public class Fila<TIPO> extends EstruturaEstatica<TIPO>{

    /* Método construtor */
    public Fila(){
        super();
    }

     /* Método construtor parametrizado */
    public Fila(int capacidade){
        super(capacidade);
    }
    
    /* Adicionar um elemento na fila - Enfileirar - (Queues) */
    public void enfileirar(TIPO valor){
        super.adicionar(valor);
    }

    /* Verificar elemento do início da fila - (peek) */
    public TIPO espiar(){
        return this.elementos[0]; // Retorna o elemento do inicio da fial ou nulo caso a fila esteja vazia.
    }

    /* Desenfileirar (remover) elementos da fila - (Dequeue) */
    public TIPO desenfileirar(){
        final int posicao = 0; 
        if(this.estaVazio()){
            return null;
        }
        TIPO removido = this.elementos[posicao];
        super.remove(posicao);
        return removido;
    }

}
