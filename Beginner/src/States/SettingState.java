/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

import Graficos.Assets;
import UI.UIImageButton;
import UI.UIManager;
import beginner.Handler;
import java.awt.Graphics;

/**
 *
 * @author German David
 */
public class SettingState extends State{
    
    private UIManager uimanager;
    
    
    public SettingState(Handler handler) {
        super(handler);
        uimanager= new UIManager (handler);
        handler.getMouseManager().setUIManager(uimanager);
        
       // uimanager.addUIObject(new UIImageButton ());
    }

    @Override
    public void update() {
        
    }


    @Override
    public void render(Graphics g) {
        
        g.drawImage(Assets.settings, 0, 0, null);
        
    }
    
}
