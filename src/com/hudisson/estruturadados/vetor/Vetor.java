package com.hudisson.estruturadados.vetor;

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
}
