/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.image.BufferedImage;

//every image, music or resource
public class Assets {
    
    //Player sprites
    public static BufferedImage playerDown[]= new BufferedImage[9],empty, library, background, playerJump, playerWalk,BookPile,settings, floor;
    public static BufferedImage playerUp[]= new BufferedImage[9];
    public static BufferedImage playerRight[]= new BufferedImage[9];
    public static BufferedImage playerLeft[]= new BufferedImage[9];
    
    //Enemy Sprites
    public static BufferedImage SkelUp[]= new BufferedImage[9];
    public static BufferedImage SkelRight[]= new BufferedImage[9];
    public static BufferedImage SkelDown[]= new BufferedImage[9];
    public static BufferedImage SkelLeft[]= new BufferedImage[9];
    public static BufferedImage Start[]= new BufferedImage[2];
    //Background Sprites
    public static BufferedImage Background[]= new BufferedImage[4];
    
    //Ghost sprite
        public static BufferedImage GhostUp[]= new BufferedImage[3];
    public static BufferedImage GhostRight[]= new BufferedImage[3];
    public static BufferedImage GhostDown[]= new BufferedImage[3];
    public static BufferedImage GhostLeft[]= new BufferedImage[3];
    
    private static final int width = 64, height = 64;

    public static void init() {
        //                                       Girl SPRITE path /textures/sheet.png"
        SpriteSheet sheet = new SpriteSheet(Imageloader.loadImage("/textures/DudeSprite.png"));
        SpriteSheet sheetEnemy = new SpriteSheet(Imageloader.loadImage("/textures/EnemySprite.png"));
        SpriteSheet BackSheet = new SpriteSheet(Imageloader.loadImage("/textures/BackSheet.png"));
        SpriteSheet GhostSheet = new SpriteSheet(Imageloader.loadImage("/textures/GhostSprite.png"));
        library = Imageloader.loadImage("/textures/Library.png");
        floor = Imageloader.loadImage("/textures/Floor.png");
        int j = 0;
        //sacando cada espacio de los spriteSheet
        for (int i = 0; i < 4; i++) {
            Background[i]= BackSheet.crop(800*i,0, 800, 492);
        }
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 9; k++) {
                    switch(i){
                        case 0:
                            playerUp[k]=sheet.crop(64*k, 64*i, width, height);
                            SkelUp[k]=sheetEnemy.crop(64*k, 64*i, width, height);
                            break;
                        case 1:
                            playerLeft[k]=sheet.crop(64*k, 64*i, width, height);
                            SkelLeft[k]=sheetEnemy.crop(64*k, 64*i, width, height);
                            break;
                        case 2:
                            playerDown[k]=sheet.crop(64*k, 64*i, width, height);
                            SkelDown[k]=sheetEnemy.crop(64*k, 64*i, width, height);
                        case 3: 
                            playerRight[k]=sheet.crop(64*k, 64*i, width, height);
                            SkelRight[k]=sheetEnemy.crop(64*k, 64*i, width, height);
                            break;
                    }
                   
                
            }
        }
        Start[0]=Imageloader.loadImage("/textures/Start.png");
        Start[1]=Imageloader.loadImage("/textures/StartActivated.png");
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
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 3; k++) {
                switch(i){
                        case 0:
                            GhostDown[k]=GhostSheet.crop(48*k, 48*i, 48, 48);
                            
                            break;
                        case 1:
                            GhostLeft[k]=GhostSheet.crop(48*k, 48*i, 48, 48);
                            break;
                        case 2:
                            GhostRight[k]=GhostSheet.crop(48*k, 48*i, 48, 48);
                        case 3: 
                            GhostUp[k]=GhostSheet.crop(48*k, 48*i, 48, 48);
                            break;
                    }
                   
            }
        }
        background = Imageloader.loadImage("/textures/espacio.png");
        empty=Imageloader.loadImage("/textures/empty.png");
        BookPile=Imageloader.loadImage("/textures/BookPile.png");
        settings= Imageloader.loadImage("/textures/Settings.png");
    }
}

