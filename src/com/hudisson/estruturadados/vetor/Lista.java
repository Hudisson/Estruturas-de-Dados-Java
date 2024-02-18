package com.hudisson.estruturadados.vetor;

//import java.lang.reflect.Array;

public class Lista<TIPO> {
        
        private TIPO[] elementos;
        private int capacidadeEmUso;
        private int capacidadeDefinida;

        public Lista(int capacidade){
            this.elementos = (TIPO[]) new Object[capacidade];
            this.capacidadeEmUso = 0;
        }
    
        // public Lista(int capacidade, Class<TIPO> tipoClasse){
        //     this.elementos = (TIPO[]) Array.newInstance(tipoClasse, capacidade);
        //     this.capacidadeEmUso = 0;
        // }
    
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
                TIPO[] novosElementos = (TIPO[]) new Object[this.elementos.length * 2];
                for(int i = 0; i < this.elementos.length; i++){
                    novosElementos[i] = this.elementos[i];
                }
    
                this.elementos = novosElementos;
            }
        }
    
        public boolean adicionar(TIPO valor){
    
            this.aumentarCapacidade();
    
            if(this.capacidadeEmUso < this.elementos.length){
                this.elementos[this.capacidadeEmUso] = valor;
                this.capacidadeEmUso++; 
                return true;
            }
    
            return false;
        }
    
        /* Método para adicionar um novo elemento ao vetor sem perde os outros elementos */
        public boolean adicionar(int posicao, TIPO valor){
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

        /* Remove o elemento pelo nome apartir da primeira ocorrência */
        public boolean removerElemento(TIPO valor){
            // verificar se o elemento exite
            if(buscaExite(valor) == true ){
                remove(existeNaPosicao(valor));
                return true;
            }
            return false;
        }

        /* Remove elemetos repetidos deixando apenas um igual ao iten buscado */
        public boolean removeClones(TIPO valor){
            if(buscaExite(valor) == true){
                for(int i = 0; i < tamanho(); i++){
                    if(this.elementos[i] == valor){
                        remove(i);
                    }
                 }
                 return true;
            }

            return false;
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
        public TIPO buscaElemento(int posicao){
            if(!(posicao >= 0 && posicao < capacidadeEmUso)){
                throw new IllegalArgumentException("Posição inválida");
            }
            return this.elementos[posicao];
        }
    
        /* Verficar se elemento existe no vetor: retorna true o false*/
        public boolean buscaExite(TIPO busca){
            return existeNaPosicao(busca) >= 0;
        }
    
        /* Verficar se elemento existe no vetor , se existir, retornar a posição, se não, retornar -1*/
        public int existeNaPosicao(TIPO busca){
            for(int i = 0; i < this.capacidadeEmUso; i++){
                if(this.elementos[i].equals(busca)){
                    return i; // Existe na posição [i]
                }
            }
     
            return -1; // Não existe em nehuma posição
        }

        /* Último indice em que um item aparece na lista */
        public int ultimoIndice(TIPO valor){

            // Retorna -1 se não existir ou retorna o último indice que o elemento aparece.
            for(int i = this.tamanho()-1; i >=0; i--){
                if(this.elementos[i].equals(valor)){
                    return i;
                }
            }

            return -1;
        }

}
