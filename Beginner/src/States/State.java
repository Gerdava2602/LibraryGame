/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

import beginner.Game;
import beginner.Handler;
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
    
   protected Handler handler;

    public State(Handler handler) {
        this.handler = handler;
    }
   
   
    
    public abstract void render(Graphics g);
    
    
}
