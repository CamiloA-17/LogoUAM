/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.elements;

import co.autonoma.edu.game.instructions.*;
import java.util.LinkedList;

/**
 *
 * @author izibr
 */
public class Program {

    private LinkedList<Instruction> instructions;

    public Program() {
        instructions = new LinkedList<>();
    }

    public void handleInstruction(String instruction) {
        if (instruction.length() > 0) {
            String command = instruction.split(" ")[0].toUpperCase();
            if (command.equals("FD") || command.equals("FORWARD")) {
                addForwardInstruction(instruction);
            } else if (command.equals("BD") || command.equals("BACKWARD")) {
                
            } else if (command.equals("RT") || command.equals("RIGHTTURN")) {

            } else if (command.equals("LT") || command.equals("LEFTTURN")) {

            } else if (command.equals("SC") || command.equals("SETCOLOR")) {
                
            } else if (command.equals("R") || command.equals("RESET")) {
                
            } else if (command.equals("H") || command.equals("HOME")) {
                
            } else if (command.equals("L") || command.equals("LOAD")) {
                
            } else if (command.equals("S") || command.equals("SAVE")) {
                
            } else {
                System.out.println("INSTRUCCIÓN NO DISPONBLE" + command); // throw exception
            }
            //instructions.add(instruction);
            //shareInstructions();
        } else {
            System.out.println("INSTRUCCIÓN VACÍA"); //throw exception
        }
    }
    
    public void addForwardInstruction(String instruction){
        Instruction newInstruction = new ForwardInstruction();
        newInstruction.setParameter(instruction);
    }
}
