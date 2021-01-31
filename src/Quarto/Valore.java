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
public class Valore {

    public static enum Tipo {
        PERSONALE, CASA, UFFICIO, EMAIL, TELEGRAM
    }

    private final Tipo tipo;
    private final String contatto;

    public Valore(Tipo tipo, String contatto) {
        this.tipo = tipo;
        this.contatto = contatto;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "\nTipo: " + tipo+ " - Contatto: "+contatto;
    }

}
