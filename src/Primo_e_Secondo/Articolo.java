/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primo_e_Secondo;

/**
 *
 * @author scian
 */
public interface Articolo <E>{

    String getNome();

    double getPrezzo();

    @Override
    String toString();

}
