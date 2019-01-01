/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import Map.Map;
import Map.RectangleMap;
import Player.Player;
import java.util.Set;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author jiach
 */
public class Game extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        /*Player p=new Player();
        
        Pane root = new Pane();
        root.getChildren().add(p.getAction().getMovement().getMoveImageView());
        p.getAction().getMovement().getMoveImageView().setX(0);
        
        Scene scene = new Scene(root, 300, 250);
        
        scene.setOnKeyPressed((e) -> {
            if(e.getCode() == KeyCode.DOWN)
                p.move(root, 0, 1);
            else if(e.getCode() == KeyCode.LEFT)
                 p.move(root, 0, 2);
            else if(e.getCode() == KeyCode.RIGHT)
                 p.move(root, 0, 3);
            else if(e.getCode() == KeyCode.UP)
                 p.move(root, 0, 4);
        });*/
        Map map=new RectangleMap(1);
        
        primaryStage.setTitle(map.getMapName());
        primaryStage.setScene(map.getScene());
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
