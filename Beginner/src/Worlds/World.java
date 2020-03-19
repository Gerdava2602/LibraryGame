/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Worlds;

import Tiles.Tile;
import static Tiles.Tile.TILEHEIGHT;
import static Tiles.Tile.TILEWIDTH;
import java.awt.Graphics;

/**
 *
 * @author German David
 */
public class World {
    
    private int width,height;
    private int[][] tiles= new int [100][100];
    
    public World(String path){
        loadWorld(path);
    }
    
    public void update(){
        
    }
    
    public void render(Graphics g){
        for(int y=0;y<height;y++){
            for(int x=0;x<width;x++){
                getTile(x,y).render(g, x*TILEWIDTH, y*TILEHEIGHT);
            }
        }
    }
    
    public Tile getTile(int x, int y){
        Tile t= Tile.tiles[tiles[x][y]];
        if(t==null)
            return Tile.floor;
        return t;
    }
    
    private void loadWorld(String path){
        width=5;
        height=5;
        tiles= new int[width][height];
        
        for(int x=0; x<width;x++){
            for(int y=0;y<height;y++){
                tiles[x][y]=1;
            }
        }
    }
    
}
