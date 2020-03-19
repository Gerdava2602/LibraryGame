/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

import Entities.Creatures.Player;
import Graficos.Assets;
import Tiles.Tile;
import Worlds.World;
import beginner.Game;
import java.awt.Graphics;


public class GameState extends State{

    private Player player;
    private World world;
    
    public GameState(Game game) {
        super(game);
        player= new Player( this.game,100,100);
        world= new World("res/worlds/world1.txt");
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
