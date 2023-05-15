/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.instructions;

import co.autonoma.edu.game.exceptions.NegativeDistanceException;

/**
 *
 * @author izibr
 */
public class RightTurnInstruction extends Instruction{
    private int angle;
    public RightTurnInstruction() {
        super(1);
    }
    
    @Override
    public void setParameter(String parameter) {
        noParameterValidation(parameter);
        parametersValidation(parameter);
        int auxAngle = Integer.parseInt(parameter.split(" ")[1]);
        if (auxAngle >= 0) {
            this.angle = auxAngle;
        } else {
            throw new NegativeDistanceException();
        }
    }

    public int getAngle() {
        return angle;
    }
}
