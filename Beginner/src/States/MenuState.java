/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

import Graficos.Assets;
import beginner.Game;
import beginner.Handler;
import java.awt.Graphics;

/**
 *
 * @author German David
 */
public class MenuState extends State{

    public MenuState(Handler handler) {
        super(handler);
    }

    @Override
    public void update() {
        
    }

    @Override
    public void render(Graphics g) {
       g.drawImage(Assets.background, 0, 0, null);
    }

    
}
