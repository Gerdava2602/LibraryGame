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
        super(x, y,Creature.DEFAULT_CREATURE_WIDTH,Creature.DEFAULT_CREATUR_HEIGHT);
        this.game=game;
    }

    

    @Override
    public void update() {
        getInput();
        move();
    }

    private void getInput(){
        Xmove=0;
        Ymove=0;
        
        if(game.getKeyManager().up){
            Ymove =-speed;
        }
        if(game.getKeyManager().down){
            Ymove =speed;
        }
        if(game.getKeyManager().right){
            Xmove =speed;
        }
        if(game.getKeyManager().left){
            Xmove =-speed;
        }
    }
    @Override
    public void render(Graphics g) {
        
        g.drawImage(Assets.playerStand[1],(int) x, (int) y, width, height, null);
        
    }
    
}
