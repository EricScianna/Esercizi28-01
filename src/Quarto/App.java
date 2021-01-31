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
public class App {

    public static void main(String[] args) {

        Rubrica ru = new Rubrica();

        Chiave ch = new Chiave("GianBurrasca", Chiave.Tipologia.LAVORO);
        Valore va  = new Valore(Valore.Tipo.CASA, "123");
        ru.Aggiungi(ch, va);
        Chiave ch1 = new Chiave("SuperMan", Chiave.Tipologia.AMICIZIE);
        Valore va1 = new Valore(Valore.Tipo.PERSONALE, "456");
        ru.Aggiungi(ch1, va1);
        Chiave ch2 = new Chiave("Topogigio", Chiave.Tipologia.MUSICA);
        Valore va2 = new Valore(Valore.Tipo.EMAIL, "417");
        ru.Aggiungi(ch2, va2);
        Chiave ch3 = new Chiave("Pluto", Chiave.Tipologia.SPORT);
        Valore va3 = new Valore(Valore.Tipo.UFFICIO, "7456");
        ru.Aggiungi(ch3, va3);

        ru.Stampa();

        System.out.println("\n----ELIMINAZIONE----");
        ru.Elimina(ch1);
        ru.Stampa();

        System.out.println("\n----MODIFICA----");
        ch1 = new Chiave("SuperMan", Chiave.Tipologia.AMICIZIE);
        va1 = new Valore(Valore.Tipo.PERSONALE, "456");
        ru.Aggiungi(ch1, va1);

        ru.Modifica(ch, va  = new Valore(Valore.Tipo.TELEGRAM, "999"));
        ru.Stampa();

        System.out.println("\n----RICERCA----");
        ru.RicercaChiave(ch2);
        ru.RicercaValore(va3);

        System.out.println("\n----SCORRERE----");
        ru.Scorrere();
        
        System.out.println("\n----TEST----");

    }

}
