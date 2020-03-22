/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Entities.Creatures.Player;
import beginner.Handler;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author German David
 */
public class EntityManager {
 
    private Handler handler;
    private Player player;
    private ArrayList <Entity> entities;

    public EntityManager(Handler handler, Player player) {
        this.handler = handler;
        this.player = player;
        entities = new ArrayList<Entity>();
        //Agregando al personaje en el Array de entidades
        addEntity(player);
    }
    
    public void update(){
        for(int i=0;i<entities.size();i++){
            Entity e = entities.get(i);
            e.update();
        }
        
    }
    
    public void render(Graphics g){
        for (Entity e : entities) {
            e.render(g);
        }
        
    }
    
    public void addEntity(Entity e){
        entities.add(e);
    }
    
//Getters and Setters
    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;
    }
    
    
}
