/*
 * Link da aula com prof. isidro implementando estrutura de dados fila
 * https://www.youtube.com/watch?v=Gh636gK-2w8
 */
package br.com.rogerio.model;

/**
 *
 * @author roger
 */
public class Fila {

    private int[] valores;
    private int inicio;
    private int fim;
    private int total;

    public Fila() {
        valores = new int[10];
        inicio = 0;
        fim = 0;
        total = 0;
    }

    public void inserir(int elemento) {
        if (isFull()) {
            throw new RuntimeException("A fila está cheia!\n");
        }
        valores[fim] = elemento;
        fim = (fim + 1) % valores.length;
        total++;
                
    }

    public int retirar() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está cheia!\n");
        }
        int elemento = valores[inicio];
        inicio = (inicio +1) % valores.length;
        total--;
        return elemento;
    }

    public boolean isEmpty() {
        return total == 0;
    }

    public boolean isFull() {
        return total == valores.length;
    }

}
