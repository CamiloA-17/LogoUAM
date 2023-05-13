/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.elements;

import co.autonoma.edu.game.files.DocumentReader;
import co.autonoma.edu.game.files.DocumentWriter;

/**
 *
 * @author izibr
 */
public class Interpreter {
    private DocumentReader reader;
    private DocumentWriter writer;
    private Program program;

    public Interpreter() {
        reader = new DocumentReader();
        writer = new DocumentWriter();
        program = new Program();
    }
    
    
    
    
    
    
}
