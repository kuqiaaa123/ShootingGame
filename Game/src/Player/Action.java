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
public class Action {
    private Movement movement;
    private Shoot shoot;
    
    public Action(){
        movement=new Movement();
        shoot=new Shoot();
    }
    
    public Movement getMovement(){
        return movement;
    }
}
