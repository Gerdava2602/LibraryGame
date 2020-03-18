/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

import java.awt.Graphics;

/**
 *
 * @author German David
 */
public abstract class State {
    
//States    
    private static State currentState = null;

    public static void setState(State state){
        currentState= state;
    }
    
    public static State getState(){
        return currentState;
    }
    
//Class
    public abstract void update();
    
    public abstract void render(Graphics g);
    
    
}
