/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package eg.edu.alexu.csd.oop.game;

import java.util.List;

/**
 *
 * @author welcome
 */
public interface World {
    
    /**
     *
     * @return
     */
    List<GameObject> getConstantObjects();
    List<GameObject> getMovableObjects();
    List<GameObject> getControlableObjects();
    int getWidth();
    int getHeight();  // of screen
    boolean refresh();
    String getStatus();
    int getSpeed();
    int getControlSpeed();
    
}
