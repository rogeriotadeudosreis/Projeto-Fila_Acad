/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.app;

import br.com.rogerio.model.Fila;
import java.util.Date;

/**
 *
 * @author roger
 */
public class FilaMain {

    public static void main(String[] args) {

        Fila fila = new Fila();

        System.out.println("A fila está vazia ?: " + fila.isEmpty());
        System.out.println("A fila está cheia ?: " + fila.isFull());

        int i = 1;
        while(fila.isEmpty()){
        fila.inserir(i);
        i++;
        }
        
        System.out.println("A fila está vazia ? " + fila.isEmpty());
        System.out.println("A fila está cheia ? " + fila.isFull());
        

        while (!fila.isEmpty()) {
            int x = fila.retirar();
            System.out.println("Retirando: " + x);
        }

        System.out.println("E agora ? a fila está vazia ? " + fila.isEmpty());
        
        Date data = new Date();
        System.out.println(data.getYear());
    }
}
