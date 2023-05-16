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
    
    public Instruction handleInstruction(String instruction) throws NotAvailableInstructionException, VoidInstructionException, ParametersExceededException, NumberFormatException, NegativeDistanceException, PatternSyntaxException, NoParameterException, NotAvailableColorException{
        if (instruction.length() > 0) {
            String command = instruction.split(" ")[0].toUpperCase();
            if (command.equals("FD") || command.equals("FORWARD")) {
                return addForwardInstruction(instruction); // -> throws exceptions
            } else if (command.equals("BD") || command.equals("BACKWARD")) {
                return addBackwardInstruction(instruction); // -> throws exceptionsreturn addBackwardInstruction(instruction);
            } else if (command.equals("RT") || command.equals("RIGHTTURN")) {
                return addRightTurnInstruction(instruction);
            } else if (command.equals("LT") || command.equals("LEFTTURN")) {
                return addLeftTurnInstruction(instruction);
            } else if (command.equals("SC") || command.equals("SETCOLOR")) {
                return addSetColorInstruction(instruction);
            } else if (command.equals("R") || command.equals("RESET")) {
                return addResetInstruction(instruction);
            } else if (command.equals("H") || command.equals("HOME")) {
                return addHomeInstruction(instruction);
            } else if (command.equals("L") || command.equals("LOAD")) {
                return addLoadInstruction(instruction);
            } else if (command.equals("S") || command.equals("SAVE")) {
                return addSaveInstruction(instruction);
            } else {
                throw new NotAvailableInstructionException(instruction);
            }
        } else {
            throw new VoidInstructionException();
        }
        // return null;
    }
    
    public Instruction addForwardInstruction(String instruction) throws NumberFormatException, NegativeDistanceException, PatternSyntaxException{
        Instruction newInstruction = new ForwardInstruction();
        newInstruction.setParameter(instruction);
        instructions.add(newInstruction);
        return newInstruction;
    }
    
    public Instruction addBackwardInstruction(String instruction) throws NumberFormatException, NegativeDistanceException, PatternSyntaxException{
        Instruction newInstruction = new BackwardInstruction();
        newInstruction.setParameter(instruction);
        instructions.add(newInstruction);
        return newInstruction;
    }
    
    // -------------------------------------------------------------------------
    
    public Instruction addRightTurnInstruction(String instruction) throws NumberFormatException, NegativeAngleException, PatternSyntaxException{
        Instruction newInstruction = new RightTurnInstruction();
        newInstruction.setParameter(instruction);
        instructions.add(newInstruction);
        return newInstruction;
    }
    
    public Instruction addLeftTurnInstruction(String instruction) throws NumberFormatException, NegativeAngleException, PatternSyntaxException{
        Instruction newInstruction = new LeftTurnInstruction();
        newInstruction.setParameter(instruction);
        instructions.add(newInstruction);
        return newInstruction;
    }
    
    // -------------------------------------------------------------------------
    
    public Instruction addSetColorInstruction(String instruction) throws ParametersExceededException, NotAvailableColorException{
        Instruction newInstruction = new SetColorInstruction();
        newInstruction.setParameter(instruction);
        instructions.add(newInstruction);
        return newInstruction;
    }
    // -------------------------------------------------------------------------
    public Instruction addHomeInstruction(String instruction) throws ParametersExceededException{
        Instruction newInstruction = new HomeInstruction();
        newInstruction.setParameter(instruction);
        instructions.add(newInstruction);
        return newInstruction;
    }
    // -------------------------------------------------------------------------
    public Instruction addResetInstruction(String instruction) throws ParametersExceededException{
        Instruction newInstruction= new ResetInstruction();
        newInstruction.setParameter(instruction);
        instructions.add(newInstruction);
        return newInstruction;
    }

    public Instruction addLoadInstruction(String instruction) throws ParametersExceededException{
        Instruction newInstruction= new LoadInstruction();
        newInstruction.setParameter(instruction);
        instructions.add(newInstruction);
        return newInstruction;
    }

    public Instruction addSaveInstruction(String instruction) throws ParametersExceededException{
        Instruction newInstruction= new SaveInstruction();
        newInstruction.setParameter(instruction);
        instructions.add(newInstruction);
        return newInstruction;
    }

    public LinkedList<Instruction> getInstructions(){
        return instructions;
    }
}   
