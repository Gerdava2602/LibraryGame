/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.Creatures;

import Entities.Entity;
import java.awt.Graphics;

/**
 *
 * @author German David
 */
public abstract class Creature extends Entity{
    
    protected int health;
    
    public Creature(float x, float y) {
        super(x, y);
        health=10;
    }

    
}
