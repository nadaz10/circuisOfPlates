/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package eg.edu.alexu.csd.oop.game;

import java.awt.image.BufferedImage;

/**
 *
 * @author welcome
 */
public interface GameObject {
    
    int getX();
    void setX(int x);
    int getY();
    void setY(int y);
    int getWidth(); // return width of object
    int getHeight(); //return height of object
    boolean isVisible();
    BufferedImage[] getSpriteImages();
     
    
}
