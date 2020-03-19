/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

import Entities.Creatures.Player;
import Graficos.Assets;
import Tiles.Tile;
import beginner.Game;
import java.awt.Graphics;


public class GameState extends State{

    private Player player;
    public GameState(Game game) {
        super(game);
        player= new Player( this.game,100,100);
    }

    
    @Override
    public void update() {
        player.update();
    }

    @Override
    public void render(Graphics g) {
        player.render(g);
        Tile.tiles[1].render(g, 0, 0);
    }

    
    
}
