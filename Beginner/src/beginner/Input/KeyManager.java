/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginner.Input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author German David
 */
public class KeyManager implements KeyListener{

    private boolean[] keys;
    public boolean up,down,left,right;
    
    public KeyManager() {
        keys= new boolean[256];
        
    }
    
    public void update(){
        up=keys[KeyEvent.VK_W];
        down=keys[KeyEvent.VK_S];
        right=keys[KeyEvent.VK_D];
        left=keys[KeyEvent.VK_A];
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        keys[ke.getKeyCode()]= true;
        System.out.println("Pressed");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        keys[ke.getKeyCode()]=false;
    }
    
}
