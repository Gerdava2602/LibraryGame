/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

import Graficos.Assets;
import UI.ClickListener;
import UI.UIImageButton;
import UI.UIManager;
import beginner.Game;
import beginner.Handler;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author German David
 */
public class MenuState extends State{

    private UIManager uiManager;
    
    public MenuState(Handler handler) {
        super(handler);
        uiManager = new UIManager(handler);
        handler.getMouseManager().setUIManager(uiManager);
        
        uiManager.addUIObject(new UIImageButton(400,300,100,100,Assets.Start, new ClickListener() {
            @Override
            public void onClick() {
                handler.getMouseManager().setUIManager(null);
                State.setState(handler.getGame().gameState);
            }
        }));
    }

    @Override
    public void update() {
        uiManager.tick();
    }

    @Override
    public void render(Graphics g) {
      uiManager.render(g);
    }

    
}
