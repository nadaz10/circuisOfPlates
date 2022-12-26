/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eg.edu.alexu.csd.oop.game;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author welcome
 */
public class ImageObject implements GameObject {
    
  
    private BufferedImage[] spriteImages = new BufferedImage[1];
    private int x;
    private int y;
    private boolean visible;
    public static ImageObject image;
    private int type;
    
     public ImageObject(int x, int y, String path , int type) {
        this.x = x;
        this.y = y;
        this.visible = true;
        this.type=type;
        try {
            spriteImages[0] = ImageIO.read(getClass().getResourceAsStream(path));
        } catch (IOException e) {
            System.out.println("error in reading png");
        }
    }
     public ImageObject(int posX, int posY, String path){
		this(posX, posY, path, 0);
	}

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public void setX(int x) {
        this.x=x;
    }

    @Override
    public int getY() {
        return this.y;    
    }

    @Override
    public void setY(int y) {
        this.y=y;
    }

    @Override
    public int getWidth() {
        return this.spriteImages[0].getWidth();
    }

    @Override
    public int getHeight() {
        return this.spriteImages[0].getHeight();
    }

    @Override
    public boolean isVisible() {
        return this.visible;
    }

    @Override
    public BufferedImage[] getSpriteImages() {
        return this.spriteImages;
    }
     
     public void setVisible(boolean visible) {
        this.visible = visible;
    }

   
    
}
