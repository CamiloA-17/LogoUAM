/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.files;

import co.autonoma.edu.game.interfaces.Drawable;
import co.autonoma.edu.game.elements.Turtle;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author ASUS
 */
public class InstructionsManager implements Drawable {

    private DocumentReader reader;
    private ArrayList<String> instructions = new ArrayList<>();
    private Turtle turtle;
    private Drawable drawable; //Test

    public InstructionsManager() {
        this.reader = new DocumentReader();
        this.turtle = new Turtle(100, 100, 20, 50);
        this.turtle.setDrawable(this);
    }

    public void searchFile() {
        reader.searchFile();
    }

    public void handleInstruction(String instruction) {
        if (instruction.length() > 0) {
            String command = instruction.split(" ")[0].toUpperCase();
            String parameter = instruction.split(" ")[1]; // Esta línea puede tirar errores
            if (command.equals("FD") || command.equals("FORWARD")
                    || command.equals("BD") || command.equals("BACKWARD")
                    || command.equals("RT") || command.equals("RIGHTTURN")
                    || command.equals("LT") || command.equals("LEFTTURN")
                    || command.equals("SC") || command.equals("SETCOLOR")) {
                //turtle.handleInstruction(command, parameter);
            } else if (command.equals("R") || command.equals("RESET")) {
                reset();
            } else if (command.equals("H") || command.equals("HOME")) {
                home();
            } else if (command.equals("L") || command.equals("LOAD")) {
                readFile();
            } else if (command.equals("S") || command.equals("SAVE")) {
                saveFile(parameter, instructions);
            } else {
                System.out.println("INSTRUCCIÓN NO DISPONBLE" + command);
            }
            instructions.add(instruction);
            shareInstructions();
        }else{
            System.out.println("INSTRUCCIÓN VACÍA");
        }
    }

    public void validateInstructions(ArrayList<String> validateInstructions) {
        for (String validateInstruction : validateInstructions) {
            handleInstruction(validateInstruction);
        }
        this.instructions = validateInstructions;
        shareInstructions();
    }

    public void shareInstructions() {
        DefaultListModel list = new DefaultListModel();
        for (String instruction : instructions) {
            list.addElement(instruction);
        }
        //drawable.fillList(list);
    }

    public void readFile() {
        ArrayList<String> instructions = reader.readFile();
        validateInstructions(instructions);
    }

    public void saveFile(String fileName, ArrayList<String> instructions) {
        reader.createFile(fileName, instructions);
    }

    public void setColor(String color) {

    }

    public void reset() {

    }

    public void home() {

    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public void draw(Graphics g) {
        turtle.draw(g);
    }

    @Override
    public void redraw() {
        this.drawable.redraw();
    }
}
