/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primo;

/**
 *
 * @author scian
 */
public class Articolo {

    private final String nome;
    private final double prezzo;

    public Articolo(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "\nNome articolo: " + nome + "\nPrezzo: " + prezzo+"\n------";
    }

}
