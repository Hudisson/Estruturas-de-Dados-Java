package com.hudisson.estruturadados.vetor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetor {
    
    private String[] elementos;
    private int capacidadeEmUso;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.capacidadeEmUso = 0;
    }

    // public void adicionar(String valor){
    //     for(int i = 0; i < this.elementos.length; i++){
    //         if(this.elementos[i] == null){
    //             this.elementos[i] = valor;
    //             break;
    //         }
    //     }
    // }

    // public void adicionar(String valor) throws Exception{
    //     if(this.capacidadeEmUso < this.elementos.length){
    //         this.elementos[this.capacidadeEmUso] = valor;
    //         this.capacidadeEmUso+=1;
    //     }else{
    //         throw new Exception("Limite máximo atingido");
    //     }
    // }

      public boolean adicionar(String valor){

         if(this.capacidadeEmUso < this.elementos.length){
            this.elementos[this.capacidadeEmUso] = valor;
            this.capacidadeEmUso++; 
            return true;
         }

        return false;
    }

    /* Verifica tamanho do vetor */
    public int tamanho(){
        return this.capacidadeEmUso;
    }

    /* Imprimi elementos do vetor */
    
    // public String imprimir(){
    //     return Arrays.toString(elementos);
    // }

    @Override
    public String toString(){

        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i < this.capacidadeEmUso-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.capacidadeEmUso > 0){
            s.append(this.elementos[this.capacidadeEmUso-1]);
        }

        s.append("]");
        return s.toString();
    }

    /* Obter elemento de uma posição do vetor */

    public String buscaElemento(int posicao){
        if(!(posicao >= 0 && posicao < capacidadeEmUso)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    // public String getElemento(int posicao){
    //     String item = "Não encontrado";
    //     if(posicao >= 0 && posicao == capacidadeEmUso-1){
    //         item = this.elementos[posicao];
    //     }

    //     return item;  
    // 
}
