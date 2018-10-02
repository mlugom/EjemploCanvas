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
public class Carro {
    private int xref;
    private int yref;
    private int ancho;
    private int alto;
    private Llanta[] llantas;
    private Chasis chasis;

    public Carro(int xref, int yref, int ancho, int alto) {
        this.xref = xref;
        this.yref = yref;
        this.ancho = ancho;
        this.alto = alto;
        this.llantas = new Llanta[2];
        this.llantas[0] = new Llanta(xref,yref+alto,10);
        this.llantas[1] = new Llanta(xref+10,yref+alto,10);
        this.chasis = new Chasis(this.xref,this.yref,this.ancho,this.alto);
    }

    public int getXref() {
        return xref;
    }

    public int getYref() {
        return yref;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public Chasis getChasis() {
        return chasis;
    }
    
    public void mover(){
        boolean cond1;
        if(this.xref == 0){
            cond1 = true;
        }else if(this.xref == 280){
            cond1 = false;
        }
        if(cond1==true){
            xref--;
        }else{
            xref++;
        }
        this.llantas[0].setX(xref);
        this.llantas[1].setX(xref+10);
    }
}
