/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Skill;

/**
 *
 * @author jiach
 */
public abstract class Skill {
    private double durationTime; // skill duration time
    private double cooldown; // skill defual cooldown
    private int range; //skill range
    private boolean active; // on cooldown or not
    private String skillName; 
}
