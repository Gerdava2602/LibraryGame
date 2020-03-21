/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.image.BufferedImage;

//every image, music or resource
public class Assets {

    public static BufferedImage playerStand[]= new BufferedImage[9],empty, library, background, playerJump, playerWalk, floor;

    private static final int width = 131, height = 110;

    public static void init() {
        SpriteSheet sheet = new SpriteSheet(Imageloader.loadImage("/textures/sheet.png"));
        library = Imageloader.loadImage("/textures/Library.png");
        floor = Imageloader.loadImage("/textures/Floor.png");
        int j = 0;
        //sacando cada espacio del spriteSheet
        for (int i = 1; i <= 8; i++) {

            if (i % 2 != 0) {
                playerStand[i] = sheet.crop(0, 110*j, width, height);
            } else {
                playerStand[i] = sheet.crop(131*3, 110*j, width, height);
                j++;
            }
            
        }
        
        background = Imageloader.loadImage("/textures/espacio.png");
        empty=Imageloader.loadImage("/textures/empty.png");

    }
}

