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
    public static BufferedImage EnemyUp[]= new BufferedImage[9];
    public static BufferedImage EnemyRight[]= new BufferedImage[9];
    public static BufferedImage EnemyDown[]= new BufferedImage[9];
    public static BufferedImage EnemyLeft[]= new BufferedImage[9];
    public static BufferedImage Start[]= new BufferedImage[2];
    //Background Sprites
    public static BufferedImage Background[]= new BufferedImage[4];
    
    private static final int width = 64, height = 64;

    public static void init() {
        //                                       Girl SPRITE path /textures/sheet.png"
        SpriteSheet sheet = new SpriteSheet(Imageloader.loadImage("/textures/DudeSprite.png"));
        SpriteSheet sheetEnemy = new SpriteSheet(Imageloader.loadImage("/textures/EnemySprite.png"));
        SpriteSheet BackSheet = new SpriteSheet(Imageloader.loadImage("/textures/BackSheet.png"));
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
                            EnemyUp[k]=sheetEnemy.crop(64*k, 64*i, width, height);
                            break;
                        case 1:
                            playerLeft[k]=sheet.crop(64*k, 64*i, width, height);
                            EnemyLeft[k]=sheetEnemy.crop(64*k, 64*i, width, height);
                            break;
                        case 2:
                            playerDown[k]=sheet.crop(64*k, 64*i, width, height);
                            EnemyDown[k]=sheetEnemy.crop(64*k, 64*i, width, height);
                        case 3: 
                            playerRight[k]=sheet.crop(64*k, 64*i, width, height);
                            EnemyRight[k]=sheetEnemy.crop(64*k, 64*i, width, height);
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
        background = Imageloader.loadImage("/textures/espacio.png");
        empty=Imageloader.loadImage("/textures/empty.png");
        BookPile=Imageloader.loadImage("/textures/BookPile.png");
        settings= Imageloader.loadImage("/textures/Settings.png");
    }
}

