package com.hudisson.estruturadados.fila;

public class FilaComPrioridade<TIPO> extends Fila<TIPO> {

    /*Enfieleirar com prioridade */
    @SuppressWarnings("unchecked")
    public void enfileirar(TIPO valor){
        Comparable<TIPO> chave = (Comparable<TIPO>) valor;
        int i;
        for(i = 0; i < this.tamanho(); i++){
            if(chave.compareTo(this.elementos[i]) < 0){
                break;
            }
        }
        this.adicionar(i, valor);
    }  
    
    
}
