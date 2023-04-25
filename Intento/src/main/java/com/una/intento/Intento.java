/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.una.intento;

/**
 *
 * @author Noe
 */
public class Intento {

    Obj objeto = new Obj();

    public static void main(String[] args) {
       objeto.sumar();
    }

}

class Obj {

    private int x, y, z, total;

    public String sumar() {
        x =10;
        y = x;
        z = y;
        total = x + y + z;
        return "El total de la suma es: " + total;
    }
}
