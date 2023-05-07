/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.files;

/**
 *
 * @author ASUS
 */
public class InstructionsManager {

    private DocumentReader reader;

    public void handleInstruction(String instruction) throws NumberFormatException {
        String command = instruction.split(" ")[0].toUpperCase();
        String parameter = instruction.split(" ")[1]; // Esta línea puede tirar errores
        if (command.equals("FD") || command.equals("FORWARD")
                || command.equals("BD") || command.equals("BACKWARD")) {
            int value = Integer.parseInt(parameter);
            move(command, value);
        } else if (command.equals("RT") || command.equals("RIGHTTURN")
                || command.equals("LT") || command.equals("LEFTTURN")) {
            int value = Integer.parseInt(parameter);
            turn(command, value);
        } else if (command.equals("SC") || command.equals("SETCOLOR")) {
            setColor(parameter);
        } else if (command.equals("R") || command.equals("RESET")) {
            reset();
        } else if (command.equals("H") || command.equals("HOME")) {
            home();
        } else if (command.equals("L") || command.equals("LOAD")) {
            loadFile(parameter);
        } else if (command.equals("S") || command.equals("SAVE")) {
            saveFile(parameter);
        } else {
            // throw exception -> Instrucción inválida
        }

    }

    public void move(String command, int value) {
        if (value > 0) {
            if (command.equals("FD") || command.equals("FORWARD")) {
                moveForward(value);
            }
            if (command.equals("BD") || command.equals("BACKWARD")) {
                moveBackward(value);
            }
        }else{
            //throw exception -> Valor menor a 0
        }

    }

    public void turn(String command, int value) {
        if (command.equals("RT") || command.equals("RIGHTTURN")) {
            turnRight(value);
        }
        if (command.equals("LT") || command.equals("LEFTTURN")) {
            turnLeft(value);
        }
    }

    public void loadFile(String fileName) {
        
    }

    public void saveFile(String fileName) {

    }

    public void moveForward(int value) {

    }

    public void moveBackward(int value) {

    }

    public void turnRight(int value) {

    }

    public void turnLeft(int value) {

    }

    public void setColor(String color) {

    }

    public void reset() {

    }

    public void home() {

    }
}
