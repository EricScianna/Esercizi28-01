/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primo_e_Secondo;

import java.util.ArrayList;

/**
 *
 * @author scian
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProvaMobile pm = new ProvaMobile();
        ArrayList<Mobile> mobArr = new ArrayList<>();
        Mobile m = new Mobile("Credenza", 250.5, 100, 50, 30);
        mobArr.add(m);
        m = new Mobile("Scaffale", 150.5, 80, 40, 20);
        mobArr.add(m);
        m = new Mobile("Libreria", 50.5, 70, 30, 10);
        mobArr.add(m);
        
        System.out.println("---MOBILI DISPONIBILI---\n");
        pm.scegliMobile(mobArr, 400.0, 150, 60, 30);

    }

}
