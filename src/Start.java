/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eg.edu.alexu.csd.oop.game;



import eg.edu.alexu.csd.oop.game.GameEngine;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Start {

    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();;
        JMenu menu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem pauseMenuItem = new JMenuItem("Pause");
        JMenuItem resumeMenuItem = new JMenuItem("Resume");
        menu.add(newMenuItem);
        menu.addSeparator();
        menu.add(pauseMenuItem);
        menu.add(resumeMenuItem);
        menuBar.add(menu);
        final GameEngine.GameController gameController = GameEngine.start("Welcome to Circus Of Plates", new Circus(800, 500), menuBar, Color.white);
        newMenuItem.addActionListener((ActionEvent e) -> {
            gameController.changeWorld(new Circus(800, 500));
        });
        pauseMenuItem.addActionListener((ActionEvent e) -> {
            gameController.pause();
        });
        resumeMenuItem.addActionListener((ActionEvent e) -> {
            gameController.resume();
        });
    }
}
