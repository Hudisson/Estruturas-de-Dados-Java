package com.hudisson.estruturadados.vetor;

public class VetorObjeto {
    
    private Object[] elementos;
    private int capacidadeEmUso;
    private int capacidadeDefinida;

    public VetorObjeto(int capacidade){
        this.elementos = new Object[capacidade];
        this.capacidadeEmUso = 0;
    }

    /* Verificar capacidade definida */
    public int capacidadeDefinda(){
        return this.capacidadeDefinida = this.elementos.length; 
    }

    /* Verifica tamanho do vetor */
    public int tamanho(){
        return this.capacidadeEmUso;
    }

    /* Método para aumentar a caacidade do vetor */
    private void aumentarCapacidade(){
        if(this.tamanho() == this.elementos.length){
            Object[] novosElementos = new Object[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; i++){
                novosElementos[i] = this.elementos[i];
            }

            this.elementos = novosElementos;
        }
    }

    public boolean adicionar(Object valor){

        this.aumentarCapacidade();

        if(this.capacidadeEmUso < this.elementos.length){
            this.elementos[this.capacidadeEmUso] = valor;
            this.capacidadeEmUso++; 
            return true;
        }

        return false;
    }

    /* Método para adicionar um novo elemento ao vetor sem perde os outros elementos */
    public boolean adicionar(int posicao, Object valor){
        this.aumentarCapacidade();
        if(!(posicao >= 0 && posicao < this.capacidadeEmUso)){
            throw new IllegalArgumentException("Posição inválida");
        }

        // mover os elementos
        for(int i = this.tamanho()-1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = valor;
        this.capacidadeEmUso++;
        return false;
    }

    /* Método para remover elementos do array */
    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < this.capacidadeEmUso)){
            throw new IllegalArgumentException("Posição inválida");
        }

        // Move os elementos para à esquerda no vetor
        for(int i =  posicao; i < tamanho()-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }

        this.capacidadeEmUso--; // elimina a úlima posição que fiaca sobrando(elementos duplicados); 
    }

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
    public Object buscaElemento(int posicao){
        if(!(posicao >= 0 && posicao < capacidadeEmUso)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    /* Verficar se elemento existe no vetor: retorna true o false*/
    public boolean buscaExite(Object busca){
        for(int i = 0; i < this.capacidadeEmUso; i++){
            if(this.elementos[i].equals(busca)){
                return true;
            }
        }

        return false;
    }

    /* Verficar se elemento existe no vetor , se existir, retornar a posição, se não, retornar -1*/
    public int existeNaPosicao(Object busca){
        for(int i = 0; i < this.capacidadeEmUso; i++){
            if(this.elementos[i].equals(busca)){
                return i; // Existe na posição [i]
            }
        }
 
        return -1; // Não existe em nehuma posição
    }

    /* Generalizar */
}
