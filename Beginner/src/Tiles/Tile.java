/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author German David
 */
//Cada uno de los pedazos en el mundo
public class Tile {

    //STATIC STUFF
    //Arreglo para guardar los diferentes tipos de Tile
    public static Tile[] tiles = new Tile[256];
    public static Tile library = new LibraryTile(0);
    public static Tile floor = new FloorTile(1);

    //Class
    public static final int TILEWIDTH = 128, TILEHEIGHT = 128;
    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture, int id) {
        this.texture = texture;
        this.id = id;

        tiles[id] = this;
    }

    public void update() {

    }

    public void render(Graphics g, int x, int y) {
        g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
    }

    public boolean isSolid() {
        return false;
    }

    public int getId() {
        return id;
    }
}
