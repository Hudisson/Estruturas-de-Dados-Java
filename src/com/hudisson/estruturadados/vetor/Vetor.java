package com.hudisson.estruturadados.vetor;

public class Vetor {
    
    private String[] elementos;
    private int capacidadeEmUso;
    private int capacidadeDefinida;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
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
            String[] novosElementos = new String[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; i++){
                novosElementos[i] = this.elementos[i];
            }

            this.elementos = novosElementos;
        }
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

        this.aumentarCapacidade();

        if(this.capacidadeEmUso < this.elementos.length){
            this.elementos[this.capacidadeEmUso] = valor;
            this.capacidadeEmUso++; 
            return true;
        }

        return false;
    }

    /* Método para adicionar um novo elemento ao vetor sem perde os outros elementos */
    public boolean adicionar(int posicao, String valor){
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

    /* Verficar se elemento existe no vetor: retorna true o false*/
    public boolean buscaExite(String busca){
        for(int i = 0; i < this.capacidadeEmUso; i++){
            if(this.elementos[i].equals(busca)){
                return true;
            }
        }

        return false;
    }

    /* Verficar se elemento existe no vetor , se existir, retornar a posição, se não, retornar -1*/
    public int existeNaPosicao(String busca){
        for(int i = 0; i < this.capacidadeEmUso; i++){
            if(this.elementos[i].equals(busca)){
                return i; // Existe na posição [i]
            }
        }
 
        return -1; // Não existe em nehuma posição
    }

    /* Adicionar elementos em qualquer posição do vetor  */
}
