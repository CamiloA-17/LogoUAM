/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.elements;

import co.autonoma.edu.game.exceptions.*;
import co.autonoma.edu.game.instructions.*;
import java.util.LinkedList;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author izibr
 */
public class Program {

    private LinkedList<Instruction> instructions;

    public Program() {
        instructions = new LinkedList<>();
    }
    
    public Instruction handleInstruction(String instruction) throws NotAvailableInstructionException, VoidInstructionException, ParametersExceededException, NumberFormatException, NegativeDistanceException, PatternSyntaxException, NoParameterException{
        if (instruction.length() > 0) {
            String command = instruction.split(" ")[0].toUpperCase();
            if (command.equals("FD") || command.equals("FORWARD")) {
                return addForwardInstruction(instruction); // -> throws exceptions
            } else if (command.equals("BD") || command.equals("BACKWARD")) {
                return addBackwardInstruction(instruction); // -> throws exceptions
            } else if (command.equals("RT") || command.equals("RIGHTTURN")) {

            } else if (command.equals("LT") || command.equals("LEFTTURN")) {

            } else if (command.equals("SC") || command.equals("SETCOLOR")) {
                
            } else if (command.equals("R") || command.equals("RESET")) {
                
            } else if (command.equals("H") || command.equals("HOME")) {
                
            } else if (command.equals("L") || command.equals("LOAD")) {
                
            } else if (command.equals("S") || command.equals("SAVE")) {
                
            } else {
                throw new NotAvailableInstructionException(instruction); // throw exception
            }
        } else {
            throw new VoidInstructionException(); //throw exception
        }
        return null;
    }
    
    public Instruction addForwardInstruction(String instruction) throws NumberFormatException, NegativeDistanceException, PatternSyntaxException{
        Instruction newInstruction = new ForwardInstruction();
        newInstruction.setParameter(instruction);
        instructions.add(newInstruction);
        return newInstruction;
    }
    
    public Instruction addBackwardInstruction(String instruction) throws NumberFormatException, NegativeDistanceException{
        Instruction newInstruction = new BackwardInstruction();
        newInstruction.setParameter(instruction);
        instructions.add(newInstruction);
        return newInstruction;
    }
}
