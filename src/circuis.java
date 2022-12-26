/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eg.edu.alexu.csd.oop.game;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author welcome
 */
public class Circus implements World{
    
      
    private int score = 0;
    private final long startTime = System.currentTimeMillis();
    private final int widthOfScreen;
    private final int heightOfScreen;
    private final List<GameObject> constant = new LinkedList<GameObject>();
    private final List<GameObject> moving = new LinkedList<GameObject>();
    private final List<GameObject> control = new LinkedList<GameObject>();
    private List<GameObject> left = new LinkedList<GameObject>();
    private static final int EndTime = 60 * 1000;
    
    
     public Circus( int screenWidth, int screenHeight) {
        this.widthOfScreen = screenWidth;
        this.heightOfScreen= screenHeight;
       
        control.add(new ImageObject(screenWidth / 3, (int) (screenHeight * 0.6), "/clown.png",0));
        //constant.add(new BarObject(0, 50, 250, true, Color.BLACK));
        //constant.add(new BarObject(width - 250, 50, 250, true, Color.BLACK));
        // moving objects (enemy)
        for (int i = 0; i < 20; i++) {
            //moving.add(new PlateObject(0 - 50 * (3 * i), 43, "/plate" + ((int) (Math.random() * 1000) % 2 + 1) + ".png"));
        }
    }

    @Override
    public List<GameObject> getConstantObjects() {
        return this.constant;
    }

    @Override
    public List<GameObject> getMovableObjects() {
        return this.moving;
    }

    @Override
    public List<GameObject> getControlableObjects() {
        return this.control;
    }

    @Override
    public int getWidth() {
        return this.widthOfScreen;
    }

    @Override
    public int getHeight() {
        return this.heightOfScreen;
    }

    @Override
    public boolean refresh() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getStatus() {
        return "Score=" + score + "   |   Time=" + Math.max(0, (EndTime - (System.currentTimeMillis() - startTime)) / 1000);	// update status
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public int getControlSpeed() {
        return 10;
    }

    
}
