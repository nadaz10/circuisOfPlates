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
public class Plates implements GameObject {
    private static final int MAX_MSTATE = 1;
    private BufferedImage[] spriteImages = new BufferedImage[MAX_MSTATE];
    private int x;
    private int y;
    private boolean visible;
    private int type;
    private boolean horizontalOnly;
    private ImageObject image;
    private String path;
    
    
     public Plates(int posX, int posY, String path) {
        this(posX, posY, path, 0);
    }
    

    public ImageObject getImage() {
        return image;
    }

    public void setC(ImageObject i) {
        this.image = i;
    }

    public Plates(boolean horizontalOnly) {
        this.horizontalOnly = horizontalOnly;
    }

   

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Plates(int posX, int posY, String path, int type) {
        this.x = posX;
        this.y = posY;
        this.type = type;
        this.visible = true;
        this.path = path;
        try {
            spriteImages[0] = ImageIO.read(getClass().getResourceAsStream(path));
        } catch (IOException e) {

        }
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int mX) {
        if (type == 1) {
            this.x = image.getX();
        } else {
            this.x = mX;
        }
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int mY) {
        if (!horizontalOnly) {
            this.y = mY;
        }
    }

    public boolean isHorizontalOnly() {
        return horizontalOnly;
    }

    public void setHorizontalOnly(boolean horizontalOnly) {
        this.horizontalOnly = horizontalOnly;
    }

    @Override
    public BufferedImage[] getSpriteImages() {
        return spriteImages;
    }

    @Override
    public int getWidth() {
        return spriteImages[0].getWidth();
    }

    @Override
    public int getHeight() {
        return spriteImages[0].getHeight();
    }

    @Override
    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
