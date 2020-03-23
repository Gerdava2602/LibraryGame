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
import beginner.Handler;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author German David
 */

//Estas balas se pueden activar, pero no son usadas en el juego y tienen errores en el movimiento
public class Bullet extends Entity {
    
    private int X;
    private int Y;
    private int Speed=2;
    public Bullet(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
        X=(int) (x+Player.DEFAULT_CREATURE_WIDTH/2 - handler.getGameCamara().getxOffset());
        Y=(int) ( Player.DEFAULT_CREATUR_HEIGHT/2 + y -handler.getGameCamara().getyOffset());
    }
    
    
    
    @Override
    public void update() {
       
        X+=Speed;
        
      
    }

    @Override
    public void render(Graphics g) {
        
         g.setColor(Color.yellow);
         g.fillOval( X,  Y, 10, 10);
         
    }

    public void die(){
        
    }
    

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }
    
}
