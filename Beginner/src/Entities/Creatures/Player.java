/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.Creatures;

import Graficos.Assets;
import beginner.Game;
import java.awt.Graphics;

/**
 *
 * @author German David
 */
public class Player extends Creature{

    private Game game;
    
    public Player(Game game,float x, float y) {
        super(x, y);
        this.game=game;
    }

    

    @Override
    public void update() {
        if(game.getKeyManager().up){
            y-=3;
        }
        if(game.getKeyManager().down){
            y+=3;
        }
        if(game.getKeyManager().right){
            x+=3;
        }
        if(game.getKeyManager().left){
            x-=3;
        }
        
    }

    @Override
    public void render(Graphics g) {
       
        g.drawImage(Assets.playerStand,(int) x, (int) y, null);
        
    }
    
}
