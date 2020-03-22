/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginner;

import Graficos.GameCamara;
import Worlds.World;
import beginner.Input.KeyManager;
import beginner.Input.MouseManager;
/**
 *
 * @author German David
 */
public class Handler {
    
    private Game game;
    private World world;
    
    public Handler (Game game){
        this.game=game;
    }
    
    public int getWidth(){
        return game.getWidth();
    }
    
    public int getHeight(){
        return game.getHeight();
    }
    
    public GameCamara getGameCamara(){
        return game.getGameCamara();
    }
    
    public KeyManager getKeyManager(){
        return game.getKeyManager();
    }

    public MouseManager getMouseManager(){
        return game.getMouseManager();
    }
    
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }
    
    public int getFps(int Fps){
        return game.getFps();
    }
    
    public void setFps(int fps){
        game.setFps(fps);
    }
}
