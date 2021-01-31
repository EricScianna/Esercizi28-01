/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terzo;

import java.util.ArrayList;

/**
 *
 * @author scian
 */
public class App {

    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5};
        int i = 4;
        minoreDi(array, i);
    }

    public static <T extends Comparable<T>> void minoreDi(T[] array, T in) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(in) < 0) {
                System.out.println(array[i].toString());

            }
        }
    }

}
