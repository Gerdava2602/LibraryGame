/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.Creatures;

import Entities.Entity;
import Tiles.Tile;
import beginner.Game;
import beginner.Handler;
import java.awt.Graphics;

/**
 *
 * @author German David
 */
public abstract class Creature extends Entity {

    protected float Xmove = 0, Ymove = 0;
    protected int health;
    protected float speed;

    public static final int DEFAULT_HEALTH = 10;
    public static final float DEFAULT_SPEED = 3.0f;
    public static final int DEFAULT_CREATURE_WIDTH = 131;
    public static final int DEFAULT_CREATUR_HEIGHT = 110;

    public Creature(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPEED;
    }

    public void move() {
        //Está viendo hacia donde en su siguiente movimiento va a colisionar
        if(!checkEntityCollisions(Xmove,0f))
        moveX();
        if(!checkEntityCollisions(0f,Ymove))
        moveY();
    }

    //Lo que usan estos movimientos es la hitbox creada en Entity y usan las esquinas del rectangulo para detectar sí está chocando
    public void moveX() {
        if (Xmove > 0) {
            //Posición temporal de la hitbox, cada que se mueve
            int tx = (int) (x + Xmove + bounds.x + bounds.width) / Tile.TILEWIDTH;
            
            if (!CollisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
                    && !CollisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
                x += Xmove;
            }else{
                //Se reubica la X cuando hay colisión para que quede lo mas pegado a el bloque, el 1 es para que haya 1 pixel de diferencia y se pueda mover en Y
                x=tx*Tile.TILEWIDTH-bounds.x-bounds.width-1;
            }
            
        } else if (Xmove < 0) {
            int tx = (int) (x + Xmove + bounds.x) / Tile.TILEWIDTH;
            
            if (!CollisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
                    && !CollisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
                x += Xmove;
            }else{
                x=tx*Tile.TILEWIDTH+Tile.TILEWIDTH-bounds.x;
            }
            
        }
    }

    public void moveY() {
        //Up
        if (Ymove < 0) {
            int ty = (int) (y + Ymove + bounds.y) / Tile.TILEHEIGHT;
            
            if (!CollisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
                    && !CollisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
                y += Ymove;
            }else{
                y=ty*Tile.TILEHEIGHT+Tile.TILEHEIGHT-bounds.y;
            }
            
        } else if (Ymove > 0) {
            int ty = (int) (y + Ymove + bounds.y+bounds.height) / Tile.TILEHEIGHT;
            
            if (!CollisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
                    && !CollisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
                y += Ymove;
            }else{
                y=ty*Tile.TILEHEIGHT-bounds.y-bounds.height-1;
            }
            
        }
    }

    protected boolean CollisionWithTile(int x, int y) {
        return handler.getWorld().getTile(x, y).isSolid();
    }
//Getters and setters

    public float getXmove() {
        return Xmove;
    }

    public void setXmove(float Xmove) {
        this.Xmove = Xmove;
    }

    public float getYmove() {
        return Ymove;
    }

    public void setYmove(float Ymove) {
        this.Ymove = Ymove;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

}
