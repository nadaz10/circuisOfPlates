/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eg.edu.alexu.csd.oop.game;

/**
 *
 * @author Nada
 */
public class Clown extends ImageObject {
     private int x;
    private int y;

    private static Clown C;
    
    public Clown(int posX, int posY, String path, int type) {
        super(posX, posY, path, type);
        
    }

    private Clown(int posX, int posY, String path) {
        super(posX, posY, path);
    }

    
       public static synchronized Clown getInstance(int posX, int posY, String path) {
        if (C == null) {
            C= new Clown(posX, posY, path);
        }
        return C;
    }

 
    


    @Override
    public void setY(int mY) {
        
    }

    @Override
    public void setX(int mX) {
        if (mX > 10 && mX < 590) {
            super.setX(mX);
        }

    }
    
    
}
