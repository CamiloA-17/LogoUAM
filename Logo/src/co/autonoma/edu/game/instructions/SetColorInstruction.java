/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.instructions;

import java.awt.Color;

/**
 *
 * @author izibr
 */
public class SetColorInstruction extends Instruction {

    Color color;

    public SetColorInstruction() {
        super(1);
    }

    @Override
    public void setParameter(String parameter) {
        noParameterValidation(parameter);
        parametersValidation(parameter);
        String colorName = parameter.split(" ")[1].toUpperCase();
        switch (colorName) {
            case "BLACK":
                this.color = Color.BLACK;
                break;
            case "BLUE":
                this.color = Color.BLUE;
                break;
            case "CYAN":
                this.color = Color.CYAN;
                break;
            case "GREEN":
                this.color = Color.GREEN;
                break;
            case "MAGENTA":
                this.color = Color.MAGENTA;
                break;
            case "ORANGE":
                this.color = Color.ORANGE;
                break;
            case "PINK":
                this.color = Color.PINK;
                break;
            case "RED":
                this.color = Color.RED;
                break;
            case "WHITE":
                this.color = Color.WHITE;
                break;
            case "YELLOW":
                this.color = Color.YELLOW;
                break;
            default:
                //throw exception
        }
    }

}
