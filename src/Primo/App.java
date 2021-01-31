/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primo;

import java.util.Iterator;

/**
 *
 * @author scian
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Catalogo cat = new Catalogo();

        Articolo art = new Articolo("Frutta", 10);
        cat.aggiungiArticolo(art);
        art = new Articolo("PC", 20);
        cat.aggiungiArticolo(art);
        art = new Articolo("Bici", 400);
        cat.aggiungiArticolo(art);

        System.out.println(cat.toString().replace("[", "").replace("]", "").replace(",", ""));

        System.out.println("\n---ARTICOLI SOTTO PREZZO---");
        System.out.println(cat.getArticoliSottoPrezzo(25).toString().replace("[", "").replace("]", "").replace(",", ""));

        System.out.println("\n---ITERATORE---");
        stampa(cat);

    }

    public static <E> void stampa(Iterable<E> it) {
        Iterator<E> scorri = it.iterator();

        while (scorri.hasNext()) {
            System.out.println(scorri.next());
        }

    }

}
