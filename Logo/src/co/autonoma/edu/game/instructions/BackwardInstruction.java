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
public class BackwardInstruction extends Instruction{
    public int distance;
    
    public BackwardInstruction() {
        super(1);
    }
    
    @Override
    public void setParameter(String parameter) {
        noParameterValidation(parameter);
        parametersValidation(parameter);
        int auxDistance = Integer.parseInt(parameter.split(" ")[1]);
        if (auxDistance >= 0) {
            this.distance = auxDistance;
        } else {
            throw new NegativeDistanceException();
        }
    }

    public int getDistance() {
        return distance;
    }
}
