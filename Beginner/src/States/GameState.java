/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

import Graficos.Assets;
import java.awt.Graphics;


public class GameState extends State{

    public GameState() {
    
    }

    
    @Override
    public void update() {
        
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.playerStand, 0, 0, null);
    }
    
}
