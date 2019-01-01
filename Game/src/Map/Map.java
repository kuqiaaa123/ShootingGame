/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import Player.Player;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

/**
 *
 * @author jiach
 */
public abstract class Map {
    private Scene scene;
    private Pane pane;
    private Player player[];
    private String mapName;
    private int numPlayer;
    
    public Map(int mapHeight,int mapWeight,String mapName,int numPlayer){
        this.numPlayer=numPlayer;
        this.mapName=mapName;
        player=new Player[numPlayer];
        for(int i=0;i<numPlayer;i++)
            player[i]=new Player();
        pane=new Pane();
        scene=new Scene(pane,mapHeight,mapWeight,Color.RED);
    }
    
    protected Player getPlyaer(int index){
        return player[index];
    }
    
    protected Pane getPane(){
        return pane;
    }
    
    public Scene getScene(){
        return scene;
    }
    public String getMapName(){
        return mapName;
    }
    
    public abstract boolean isInBound();
    public abstract void initialize();
    
}
