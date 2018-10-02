
import Modelo.Carro;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

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

    public LoopJuego(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.carro = new Carro(0,100,20,20);
    }
    
    @Override
    public void handle(long now) {
        lapiz.clearRect(0, 0, 300, 300);
        lapiz.strokeRect(this.carro.getXref(), this.carro.getYref(), this.carro.getAncho(), this.carro.getAlto());
        lapiz.strokeOval(this.carro.getLlantas()[0].getX(), this.carro.getLlantas()[0].getY(), this.carro.getLlantas()[0].getDiametro(), this.carro.getLlantas()[0].getDiametro());
        lapiz.strokeOval(this.carro.getLlantas()[1].getX(), this.carro.getLlantas()[1].getY(), this.carro.getLlantas()[1].getDiametro(), this.carro.getLlantas()[1].getDiametro());
        this.carro.mover();
        lapiz.strokeText("Puntaje: 100.000", 540, 20);
    }
}
