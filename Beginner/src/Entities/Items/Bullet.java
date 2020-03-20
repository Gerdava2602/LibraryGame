/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.Items;

import Entities.Creatures.Creature;
import Entities.Creatures.Player;
import Entities.Entity;
import States.GameState;
import Tiles.Tile;
import Worlds.World;
import beginner.Game;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author German David
 */
public class Bullet extends Entity {
    
    private int X;
    private int Y;
    
    public Bullet(Game game, float x, float y, int width, int height) {
        super(game, x, y, width, height);
        X=(int) (x+Player.DEFAULT_CREATURE_WIDTH/2 - game.getGameCamara().getxOffset());
        Y=(int) ( Player.DEFAULT_CREATUR_HEIGHT/2 + y -game.getGameCamara().getyOffset());
    }
    
    
    
    @Override
    public void update() {
       
        X+=2;
        
      
    }

    @Override
    public void render(Graphics g) {
        if(X <= game.getWidth()*Tile.TILEWIDTH){
         g.setColor(Color.yellow);
         g.fillOval( X,  Y, 10, 10);
        }
    }

    
    
    public boolean isShoot(){
        if(x>=game.getWidth()){
            return false;
        }else{
            return true;
        }
    }
    
}
