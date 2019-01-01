/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import game.Skill.Skill;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
    
    public Player(){
        stats=new Stats();
        name="Geri";
        mod="None";
        action=new Action();
        //icon=new Image
        //iconView=new ImageView
        skill=new Skill[SKILL_NUM];
    }
}
