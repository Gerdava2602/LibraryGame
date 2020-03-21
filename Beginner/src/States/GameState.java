/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

import Entities.Creatures.Player;
import Entities.Items.Bullet;

import Graficos.Assets;
import Tiles.Tile;
import Worlds.World;
import beginner.Game;
import beginner.Handler;
import java.awt.Graphics;


public class GameState extends State{

    private Player player;
    private World world;
    private Bullet[] bulls;
    
    public GameState(Handler handler) {
        super(handler);
        world= new World(handler,"res/worlds/world1.txt");
        handler.setWorld(world);
        player= new Player( this.handler,100,100);
        
    }

    
    @Override
    public void update() {
        world.update();
        player.update();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        player.render(g);
        
    }

    
    
}
