/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.instructions;

import co.autonoma.edu.game.exceptions.NegativeDistanceException;
import co.autonoma.edu.game.exceptions.NoParameterException;
import co.autonoma.edu.game.exceptions.ParametersExceededException;
import co.autonoma.edu.game.interfaces.Limitable;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author izibr
 */
public class ForwardInstruction extends Instruction{
    private int distance;

    public ForwardInstruction() {
        super(1);
    }
    

    @Override
    public void setParameter(String parameter) throws NumberFormatException, NegativeDistanceException, PatternSyntaxException, ParametersExceededException, NoParameterException{
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
