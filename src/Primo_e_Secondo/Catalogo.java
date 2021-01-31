/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primo_e_Secondo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author scian
 * @param <E>
 */
public class Catalogo<E extends Articolo> implements Iterable<E> {

    ArrayList<E> articoliArr = new ArrayList<>();

    private String nome;
    private double prezzo;

    public Catalogo() {
    }

    public Catalogo(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public void aggiungiArticolo(E cat) {
        articoliArr.add(cat);
    }

    public List<E> getArticoliSottoPrezzo(double prezzo) {

        List<E> listaSottoPrezzo = new ArrayList<>();

        for (int i = 0; i < articoliArr.size(); i++) {
            if (articoliArr.get(i).getPrezzo() < prezzo) {
                listaSottoPrezzo.add(articoliArr.get(i));
            }
        }
        return listaSottoPrezzo;
    }

    @Override
    public String toString() {
        return "\n---CATALOGO---" + articoliArr;
    }

    @Override
    public Iterator<E> iterator() {
        return new CatalogIterator();
    }

    private class CatalogIterator implements Iterator<E> {

        private int current;

        public CatalogIterator() {
            this.current = -1;
        }

        @Override
        public boolean hasNext() {
            return this.current < articoliArr.size() - 1;
        }

        @Override
        public E next() {
            return articoliArr.get(++current);
        }
    }

}
