/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primo;

import java.util.List;

/**
 *
 * @author scian
 */
public interface Interface <E>{

    void aggiungiArticolo (E art);
    public  List<E> getArticoliSottoPrezzo(double prezzo);
    String toString();
}
