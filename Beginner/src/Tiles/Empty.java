/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tiles;

import Graficos.Assets;
import java.awt.image.BufferedImage;

/**
 *
 * @author German David
 */
public class Empty extends Tile{
    
    public Empty( int id) {
        super(Assets.empty, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
