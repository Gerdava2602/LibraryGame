/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.Creatures;

import Entities.Items.Bullet;
import Graficos.Assets;

import beginner.Game;
import beginner.Handler;
import java.awt.Color;

import java.awt.Graphics;

/**
 *
 * @author German David
 */
public class Player extends Creature {

    public Bullet[] bullets= new Bullet[100];
    public static int bullcount = 0;
    private long clock;
    
    
    public Player(Handler handler, float x, float y) {
        super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATUR_HEIGHT);
        
        bounds.x=40;
        bounds.y=35;
        bounds.width=35;
        bounds.height=60;
    }

    @Override
    public void update() {
        getInput();
        move();
        for (int i = 0; i <100; i++) {
            //condición para que no se borren las balas ya hechas
            if(bullets[i] != null){
            bullets[i].update();
            }
        }
        handler.getGameCamara().centerOnEntity(this);
    }

    private void getInput() {
        Xmove = 0;
        Ymove = 0;

        if (handler.getKeyManager().up) {
            Ymove = -speed;
        }

        if (handler.getKeyManager().down) {
            Ymove = speed;
        }

        if (handler.getKeyManager().right) {
            Xmove = speed;
        }
        if (handler.getKeyManager().left) {
            Xmove = -speed;
        }
        if (handler.getKeyManager().space) {
            bullets[bullcount] = new Bullet(this.handler, x, y, Player.DEFAULT_CREATURE_WIDTH, Player.DEFAULT_CREATUR_HEIGHT);
            bullcount++;
            if(bullcount==100){
                bullcount=0;
            }
            System.out.println(""+bullcount);
        }

    }

    @Override
    public void render(Graphics g) {

        g.drawImage(Assets.playerStand[1], (int) (x - handler.getGameCamara().getxOffset()), (int) (y - handler.getGameCamara().getyOffset()), width, height, null);
        /*
        g.setColor(Color.yellow);
        g.fillRect((int) (x + bounds.x - handler.getGameCamara().getxOffset()), 
                (int) (y+bounds.y-handler.getGameCamara().getyOffset()), bounds.width,bounds.height);
        */
        for (int i = 0; i < 100; i++) {
           if(bullets[i]!= null){ 
            bullets[i].render(g);
           }
        }
        
    }
}
