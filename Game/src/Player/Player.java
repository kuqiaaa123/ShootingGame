/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import Skill.Skill;
import java.util.HashSet;
import java.util.Set;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author jiach
 */
public class Player {
    private final int SKILL_NUM=4; // numnber of Skill
    private Stats stats;
    private String name;
    private String mod;
    private Action action;
    private Image icon;
    private ImageView iconView;
    private Skill skill[];
    private Point position;
    
    public Player(){
        stats=new Stats();
        name="Geri";
        mod="None";
        action=new Action();
        //icon=new Image
        //iconView=new ImageView
        skill=new Skill[SKILL_NUM];
        position=new Point();
    }
    
    public void move(Pane root,int index,int direction){
       if(direction==1)
           position.setY(position.getY()+stats.getMovementSpeed());
       else if(direction==2)
           position.setX(position.getX()-stats.getMovementSpeed());
       else if(direction==3)
           position.setX(position.getX()+stats.getMovementSpeed());
       else if(direction==4)
           position.setY(position.getY()-stats.getMovementSpeed());
       root.getChildren().set(index, action.getMovement().moveImageView(direction,position));
    }
    
    public Action getAction(){
        return action;
    }
    public Point getPoistion(){
        return position;
    }
}
