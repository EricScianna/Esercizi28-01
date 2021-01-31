/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarto;

/**
 *
 * @author scian
 */
public class Chiave {

    public static enum Tipologia {
        AMICIZIE, LAVORO, SPORT, MUSICA, FAMIGLIA
    }

    private final String nome;
    private final Tipologia tipologia;

    public Chiave(String nome, Tipologia tipologia) {
        this.nome = nome;
        this.tipologia = tipologia;

    }

    public String getNome() {
        return nome;
    }

    public Tipologia getTipologia() {
        return tipologia;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nTipologia: " + tipologia;
    }

    @Override
    public int hashCode() {
        return 31 * nome.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // basic type validation
        if (!(obj instanceof Chiave)) {
            return false;
        }

        Chiave t = (Chiave) obj;
        return nome.equals(t.nome);
    }
}


