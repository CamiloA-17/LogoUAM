    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.controller;

import co.autonoma.edu.game.files.DocumentReader;
import co.autonoma.edu.game.files.InstructionsManager;
import co.autonoma.edu.game.gui.Window;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Controller {
    public static void main(String[] args) {
        Window mainWindow = new Window();
        InstructionsManager manager = new InstructionsManager();
        DocumentReader reader = new DocumentReader();
        mainWindow.setManager(manager);
        mainWindow.setVisible(true);
    }
    
    
}
