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
    public boolean up,down,left,right,space;
    //Ataques
    public boolean aUp,aDown,aLeft,aRight;
    public KeyManager() {
        keys= new boolean[256];
        
    }
    
    public void update(){
        up=keys[KeyEvent.VK_W];
        down=keys[KeyEvent.VK_S];
        right=keys[KeyEvent.VK_D];
        left=keys[KeyEvent.VK_A];
        space=keys[KeyEvent.VK_SPACE];
        
        aUp=keys[KeyEvent.VK_UP];
        aDown=keys[KeyEvent.VK_DOWN];
        aRight=keys[KeyEvent.VK_RIGHT];
        aLeft=keys[KeyEvent.VK_LEFT];
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        keys[ke.getKeyCode()]= true;
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        keys[ke.getKeyCode()]=false;
    }
    
}
