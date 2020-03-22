/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

import Graficos.Assets;
import beginner.Game;
import beginner.Handler;
import java.awt.Color;
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
        if(handler.getMouseManager().isLeftPressed() && handler.getMouseManager().isRightPressed()){
            State.setState(handler.getGame().gameState);
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.yellow);
       g.drawOval(handler.getMouseManager().getMouseX(), handler.getMouseManager().getMouseY(), 10, 10);
    }

    
}
