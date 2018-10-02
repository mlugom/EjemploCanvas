/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
public class Escenario extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane layout = new Pane();
        Canvas canvas = new Canvas(300,300);
        layout.getChildren().add(canvas);
        Scene escena = new Scene(layout,300,300,Color.WHITESMOKE);
        
        GraphicsContext lapiz = canvas.getGraphicsContext2D();
        LoopJuego juego = new LoopJuego(lapiz);
        juego.start();
        
        primaryStage.setScene(escena);
        primaryStage.setTitle("Ejemplo Escenario Interactivo");
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
