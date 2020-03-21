/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import Entities.Entity;
import Tiles.Tile;
import beginner.Game;
import beginner.Handler;

/**
 *
 * @author German David
 */
public class GameCamara {
    private Handler handler;
    //El desplazamiento adicional de la cámara
    private float xOffset,yOffset;
    
    public GameCamara(Handler handler,float xOffset,float yOffset){
        this.handler=handler;
        this.xOffset=xOffset;
        this.yOffset=yOffset;
    }
    
    //Para que solo se vea la parte del mapa con Tiles
    public void checkBlankSpace(){
        if(xOffset<0){
            xOffset=0;
        }else if(xOffset>handler.getWorld().getWidth()*Tile.TILEWIDTH - handler.getWidth()){
            xOffset=handler.getWorld().getWidth()*Tile.TILEWIDTH - handler.getWidth();
        }
        if(yOffset<0){
            yOffset=0;
        }else if(yOffset>handler.getWorld().getHeight()*Tile.TILEHEIGHT - handler.getHeight()){
            yOffset=handler.getWorld().getHeight()*Tile.TILEHEIGHT - handler.getHeight();
        }
        
    }
    
    //centrar la cámara en el personaje
    public void centerOnEntity(Entity e){
        xOffset=e.getX() - handler.getWidth()/2 + e.getWidth()/2;
        yOffset=e.getY() - handler.getHeight()/2+ e.getHeight()/2;
        checkBlankSpace();
    }
    
    //Mover la cámara
    public void move(float xAmt,float yAmt){
        xOffset+=xAmt;
        yOffset+=yAmt;
    }
    
    
//Getters y setters   
    public float getxOffset() {
        return xOffset;
    }

    public void setxOffset(float xOffset) {
        this.xOffset = xOffset;
    }

    public float getyOffset() {
        return yOffset;
    }

    public void setyOffset(float yOffset) {
        this.yOffset = yOffset;
    }
    
    
}
