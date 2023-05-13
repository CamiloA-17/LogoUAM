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
public class ForwardInstruction extends Instruction {

    private int distance;

    public ForwardInstruction() {

    }

    @Override
    public void setParameter(String parameter) throws NumberFormatException, NegativeDistanceException {
        int auxDistance = Integer.parseInt(parameter.split(" ")[1]);
        if (auxDistance >= 0) {
            this.distance = auxDistance;
        } else {
            throw new NegativeDistanceException();
        }
    }

}
