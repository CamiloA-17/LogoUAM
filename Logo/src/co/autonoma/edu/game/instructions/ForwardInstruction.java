/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.instructions;

import co.autonoma.edu.game.exceptions.NegativeDistanceException;
import co.autonoma.edu.game.exceptions.ParametersExceededException;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author izibr
 */
public class ForwardInstruction extends Instruction {

    private int distance;

    public ForwardInstruction() {

    }

    @Override
    public void setParameter(String parameter) throws NumberFormatException, NegativeDistanceException, PatternSyntaxException {
        if (parameter.split(" ").length < 3) {
            int auxDistance = Integer.parseInt(parameter.split(" ")[1]);
            if (auxDistance >= 0) {
                this.distance = auxDistance;
            } else {
                throw new NegativeDistanceException();
            }
        } else {
            String[] parameters = parameter.split(" ");
            String extraParameters = "";
            for (int i = 2; i < parameters.length; i++) {
                extraParameters += parameters[i] + " ";
            }
            throw new ParametersExceededException(extraParameters);
        }
    }
    
    

    public int getDistance() {
        return distance;
    }
}
