package com.hudisson.estruturadados.fila;

import com.hudisson.estruturadados.base.EstruturaEstatica;

public class Fila<TIPO> extends EstruturaEstatica<TIPO>{

    /* Método construtor */
    public Fila(){
        super();
    }

     /* Método construtor  parametrizado */
    public Fila(int capacidade){
        super(capacidade);
    }
    
    /* Adicionar um elemento na fila - Enfileirar (Queues) */
    public void enfileirar(TIPO valor){
        super.adicionar(valor);
    }

}
