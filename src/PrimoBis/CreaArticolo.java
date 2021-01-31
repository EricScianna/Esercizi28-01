/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimoBis;

/**
 *
 * @author scian
 */
public class CreaArticolo implements Articolo {

    private final String nome;
    private final double prezzo;

    public CreaArticolo(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "\nNome articolo: " + nome + "\nPrezzo: " + prezzo + "\n------";
    }
}
