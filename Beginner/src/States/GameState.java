/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

import Entities.Creatures.Player;
import Entities.Items.Bullet;
import Entities.Static.BookPile;

import Graficos.Assets;
import static Graficos.Assets.BookPile;
import Tiles.Tile;
import Worlds.World;
import beginner.Game;
import beginner.Handler;
import java.awt.Graphics;


public class GameState extends State{

   
    private World world;
    private Bullet[] bulls;
    
    public GameState(Handler handler) {
        super(handler);
        world= new World(handler,"res/worlds/world1.txt");
        handler.setWorld(world);
               
    }

    
    @Override
    public void update() {
        world.update();
 
           }

    @Override
    public void render(Graphics g) {
        world.render(g);
      
        
    }

    
    
}
