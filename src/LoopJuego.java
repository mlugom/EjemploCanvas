
import Modelo.Carro;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */

public class LoopJuego extends AnimationTimer{
    private GraphicsContext lapiz;
    private Carro carro;
    private Image fondo;
    private Image gato;
    private Image munequito;
    private int contador;
    private int contador2;
    private int puntaje;

    public LoopJuego(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.fondo = new Image("Imagen/image/fondo.png");
        this.carro = new Carro(0,100,20,20);
        this.gato = new Image("Imagen/image/cats.gif");
        this.munequito = new Image("Imagen/image/left0.png");
        this.contador = 0;
        this.contador2 = 0;
        this.puntaje = 0;
    }
    
    @Override
    public void handle(long now) {
        lapiz.clearRect(0, 0, 1024, 512);
        lapiz.drawImage(this.fondo, contador2, 0);
        lapiz.drawImage(gato, 132*(this.contador/5), 0, 132, 80, 20, 20, 132, 80);
        lapiz.strokeRect(20, 20, 132, 80);
        lapiz.drawImage(munequito, contador2+200, 20);
        lapiz.drawImage(munequito, contador2+400, 20);
        lapiz.drawImage(munequito, contador2+600, 20);
        lapiz.strokeRect(contador2+200, 20, 30, 39);
        lapiz.strokeRect(contador2+400, 20, 30, 39);
        lapiz.strokeRect(contador2+600, 20, 30, 39);
        lapiz.strokeText("Puntaje: " + puntaje, 250, 55);

        contador++;            

        contador2--;
        if(contador > 25){
            contador = 0;
        }
        if(contador2 <= -724){
            contador2 = 0;
        }
        Shape rRectangulo1 = new Rectangle(20, 20, 132, 80);
        Shape rRectangulo2 = new Rectangle(contador2+200, 20, 30, 39);
        Shape rRectangulo3 = new Rectangle(contador2+400, 20, 30, 39);
        Shape rRectangulo4 = new Rectangle(contador2+600, 20, 30, 39);
        
        Shape[] intersecciones = new Shape[3];
        intersecciones[0] = SVGPath.intersect(rRectangulo2, rRectangulo1);
        intersecciones[1] = SVGPath.intersect(rRectangulo3, rRectangulo1);
        intersecciones[2] = SVGPath.intersect(rRectangulo4, rRectangulo1);

        for(int i = 0; i < intersecciones.length; i++){
            if(intersecciones[i].getBoundsInLocal().getWidth() != -1){
                puntaje+=10;
            }
        }
    }
}
