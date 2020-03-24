/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.Creatures;

import Entities.EntityManager;
import Graficos.Animation;
import Graficos.Assets;
import beginner.Handler;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author German David
 */
public class Ghost extends Creature{
    
    //Attack range
    private int attackR;
    //Attack timer, AttackCooldown=
    private long lastAttackTimer,attackCooldown=800, attackTimer=attackCooldown;
    
    //Animations
    private Animation animDown,animUp,animR,animL;
    private EntityManager manager;
    
    
    public Ghost(Handler handler,EntityManager manager, float x, float y) {
        super(handler, x, y, 48,48);
        
        this.manager=manager;
        speed=1;
        bounds.x=0;
        bounds.y=0;
        bounds.width=48;
        bounds.height=48;
        
                
        //Animations           Speed en millis()
        animDown= new Animation(500,Assets.GhostDown);
        animUp= new Animation(500,Assets.GhostUp);
        animR= new Animation(500,Assets.GhostRight);
        animL= new Animation(500,Assets.GhostLeft);
    }

    @Override
    public void update() {
        animDown.update();
        animUp.update();
        animR.update();
        animL.update();
        move();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamara().getxOffset()), (int) (y - handler.getGameCamara().getyOffset()), 48, 48, null);
    }
    
    @Override
    public void move(){
        movex();
        movey();
        x+=Xmove;
        y+=Ymove;
    }
    
    
    public void movex(){
        if(x>manager.getPlayer().getX()+ manager.getPlayer().getWidth()/2){
            Xmove=-speed;
        }else if(x<manager.getPlayer().getX()+ manager.getPlayer().getWidth()/2){
            Xmove=speed;
        }else{
            Xmove=0;
        }
    }
    
    
    public void movey(){
        if(y>manager.getPlayer().getY()+ manager.getPlayer().getHeight()/2){
            Ymove=-speed;
        }else if(y<manager.getPlayer().getY()+ manager.getPlayer().getHeight()/2){
            Ymove=speed;
        }else{
            Ymove=0;
        }
    }

    @Override
    public void die() {
        
    }
    
    //Conseguir la animación en cada movimiento
    private BufferedImage getCurrentAnimationFrame(){
        if(Xmove<0){
            return animL.getCurrentFrame();
        }else if (Xmove>0){
            return animR.getCurrentFrame();
        }else if(Ymove<0){
            return animUp.getCurrentFrame();
        }else if (Ymove>0){
            return animDown.getCurrentFrame();
        }else{
            return Assets.GhostDown[0];
        }
    }
    
}
