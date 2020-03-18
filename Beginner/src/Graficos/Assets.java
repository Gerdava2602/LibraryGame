/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;


import java.awt.image.BufferedImage;

/**
 *
 * @author German David
 */

//every image, music or resource
public class Assets {
    
    public static BufferedImage playerStand,library,playerJump,playerWalk,floor;
    
    private static final int width=131,height=110;
    public static void init(){
        SpriteSheet sheet= new SpriteSheet(Imageloader.loadImage("/textures/sheet.png"));
        library=Imageloader.loadImage("/textures/Library.png");
        floor=Imageloader.loadImage("/textures/Floor.png");
        playerStand=sheet.crop(0, 0, width, height);
         
    }
}
