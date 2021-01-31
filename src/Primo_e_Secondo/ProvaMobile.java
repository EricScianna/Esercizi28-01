/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primo_e_Secondo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author scian
 */
public class ProvaMobile {

    ArrayList<Mobile> mobiliMinori = new ArrayList<>();

    public void scegliMobile(ArrayList<Mobile> mobArr, Double prezzo, int larghezza, int altezza, int profondita) {

        for (Mobile m : mobArr) {
            if (m.getPrezzo() < prezzo && m.getLarghezza() < larghezza && m.getAltezza() < altezza && m.getProfondita() < profondita) {
                mobiliMinori.add(m);
            }
        }
        Iterator<Mobile> iteratore = mobiliMinori.iterator();
        while (iteratore.hasNext()) {
            Mobile m = iteratore.next();
            System.out.println(m);
        }

    }

}
