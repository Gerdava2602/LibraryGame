/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.image.BufferedImage;

//every image, music or resource
public class Assets {

    public static BufferedImage playerDown[]= new BufferedImage[9],empty, library, background, playerJump, playerWalk, floor;
    public static BufferedImage playerUp[]= new BufferedImage[9];
    public static BufferedImage playerRight[]= new BufferedImage[9];
    public static BufferedImage playerLeft[]= new BufferedImage[9];
    private static final int width = 64, height = 64;

    public static void init() {
        //                                       Girl SPRITE path /textures/sheet.png"
        SpriteSheet sheet = new SpriteSheet(Imageloader.loadImage("/textures/DudeSprite.png"));
        library = Imageloader.loadImage("/textures/Library.png");
        floor = Imageloader.loadImage("/textures/Floor.png");
        int j = 0;
        //sacando cada espacio del spriteSheet
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 9; k++) {
                    switch(i){
                        case 0:
                            playerUp[k]=sheet.crop(64*k, 64*i, width, height);
                            break;
                        case 1:
                            playerLeft[k]=sheet.crop(64*k, 64*i, width, height);
                            break;
                        case 2:
                            playerDown[k]=sheet.crop(64*k, 64*i, width, height);
                            
                        case 3: 
                            playerRight[k]=sheet.crop(64*k, 64*i, width, height);
                            break;
                    }
                   
                
            }
        }
        /* Girl Sprite
        for (int i = 1; i <= 8; i++) {

            if (i % 2 != 0) {
                playerStand[i] = sheet.crop(0, 110*j, width, height);
            } else {
                playerStand[i] = sheet.crop(131*3, 110*j, width, height);
                j++;
            }
            
        }
        */
        background = Imageloader.loadImage("/textures/espacio.png");
        empty=Imageloader.loadImage("/textures/empty.png");

    }
}

