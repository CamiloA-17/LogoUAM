/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.files;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class InstructionsManager {
    private DocumentReader reader;

    public InstructionsManager() {
        this.reader = new DocumentReader();
    }
    
    
    public void searchFile(){
        reader.searchFile();
    }
    
      
}
