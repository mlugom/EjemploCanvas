/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Estudiante
 */
public class Llanta {
    private int x;
    private int y;
    private int diametro;

    public Llanta(int x, int y, int diametro) {
        this.x = x;
        this.y = y;
        this.diametro = diametro;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    
}
