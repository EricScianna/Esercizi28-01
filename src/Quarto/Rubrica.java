/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author scian
 *
 */
public class Rubrica {

    Map<Chiave, Valore> contatti = new HashMap<>();

    public void Aggiungi(Chiave ch, Valore va) {
        contatti.put(ch, va);
    }

    public void Modifica(Chiave ch, Valore va) {
        contatti.replace(ch, va);
    }

    public void Elimina(Chiave ch) {
        contatti.remove(ch);
    }

    public void RicercaChiave(Chiave ch) {
        System.out.println(contatti.containsKey(ch));
    }

    public void RicercaValore(Valore va) {
        System.out.println(contatti.containsValue(va));
    }

    public void Scorrere() {
        Iterator<Chiave> iteratore = contatti.keySet().iterator();
        while (iteratore.hasNext()) {
            Chiave prossimo = iteratore.next();
            System.out.println(prossimo);
            System.out.println(contatti.get(prossimo));
        }
    }

    public void Ordinare() {
    }

    public void Stampa() {
        System.out.println(contatti);
    }

}
