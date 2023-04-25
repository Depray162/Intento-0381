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
       objeto.sumar(10,10,10);
    }

}

class Obj {

    public Obj(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    
    private int x, y, z, total;

    public String sumar() {
        x =10;
        y = x;
        z = y;
        total = x + y + z;
        return "El total de la suma es: " + total;
    }
}
