/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.elements;

import co.autonoma.edu.game.files.DocumentReader;
import co.autonoma.edu.game.files.DocumentWriter;
import co.autonoma.edu.game.instructions.Instruction;
import co.autonoma.edu.game.interfaces.Dimensionable;
import co.autonoma.edu.game.interfaces.Drawable;
import java.awt.Graphics;
import javax.swing.DefaultListModel;

/**
 *
 * @author izibr
 */
public class Interpreter extends Sprite implements Dimensionable, Drawable {

    private DocumentReader reader;
    private DocumentWriter writer;
    private Program program;
    private Turtle turtle;
    private Drawable drawable;

    private final int TURTLE_WIDTH = 30;
    private final int TURTLE_HEIGHT = 50;

    public Interpreter() {
        super(0, 0, 0, 0);
        reader = new DocumentReader();
        writer = new DocumentWriter();
        program = new Program();
        turtle = new Turtle(0, 0, TURTLE_WIDTH, TURTLE_HEIGHT);
    }

    public void addInstruction(String instruction) {
        Instruction newInstruction = program.handleInstruction(instruction); // -> Si se tira una excepción, esto no se ejecuta
        turtle.handleInstruction(newInstruction);
    }

    public void draw(Graphics g) {
        turtle.draw(g);
    }

    public void setInitialTurtleValues() {
        turtle.setX(this.width / 2 - TURTLE_WIDTH / 2);
        turtle.setY(this.height / 2 - TURTLE_HEIGHT / 2);
        turtle.setDrawable(this);
    }
    
    public void setDrawable(Drawable drawable){
        this.drawable = drawable;
    }
    
    @Override
    public void redraw() {
        this.drawable.redraw();
    }
    
    

}
