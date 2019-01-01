/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

/**
 *
 * @author jiach
 */
public class Stats{
    private int hp;
    private int weight;
    private double ms; //movementSpeed
    
    public Stats(){
        hp=100;
        weight=150; //pound
        ms=10;
    }
    public Stats(int hp,int weight,double ms){
        this.hp=hp;
        this.weight=weight;
        this.ms=ms;
    }
    
}
