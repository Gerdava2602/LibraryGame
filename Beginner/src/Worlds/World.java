/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Worlds;

import Graficos.Assets;
import Tiles.Tile;
import static Tiles.Tile.TILEHEIGHT;
import static Tiles.Tile.TILEWIDTH;
import Utils.Util;
import java.awt.Graphics;

/**
 *
 * @author German David
 */
public class World {
    
    private int width,height;
    private int spawnX,spawnY;
    private int[][] tiles= new int [100][100];
    
    public World(String path){
        loadWorld(path);
    }
    
    public void update(){
        
    }
    
    public void render(Graphics g){
        g.drawImage(Assets.background, 0, 0,800,600 ,null);
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
        String file= Util.loadFileAsString(path);
        //\\s+ es cada espacio en blanco
        String[] tokens= file.split("\\s+");
        width= Util.parseInt(tokens[0]);
        height= Util.parseInt(tokens[1]);
        spawnX= Util.parseInt(tokens[2]);
        spawnY= Util.parseInt(tokens[3]);
        
        tiles= new int[width][height];
        for(int y=0;y<height;y++){
            for(int x=0;x<width;x++){
                
                tiles[x][y]=Util.parseInt(tokens[(x+y*width)+4]);
            }
        }
    }
    
}
