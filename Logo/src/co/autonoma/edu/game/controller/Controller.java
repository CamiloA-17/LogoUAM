    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.controller;
import co.autonoma.edu.game.files.InstructionsManager;
import co.autonoma.edu.game.gui.Window;

/**
 *
 * @author ASUS
 */
public class Controller {
    public static void main(String[] args) {
        Window mainWindow = new Window();
        InstructionsManager manager = new InstructionsManager();
        //DocumentReader reader = new DocumentReader();
        //String file= reader.searchFile();
        //System.out.println(reader.readFile());
        mainWindow.setManager(manager);
        mainWindow.setVisible(true);
    }
    
    
}
