/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.instructions;

import co.autonoma.edu.game.exceptions.NoParameterException;
import co.autonoma.edu.game.exceptions.ParametersExceededException;

/**
 *
 * @author izibr
 */
public abstract class Instruction {
    private int argCount;

    public Instruction(int argCount) {
        this.argCount = argCount;
    }
    
    
    public abstract void setParameter(String parameter);
    
    public void parametersValidation(String parameter) {
        if (parameter.split(" ").length > argCount + 1) {
            String[] parameters = parameter.split(" ");
            String extraParameters = "";
            for (int i = 2; i < parameters.length; i++) {
                extraParameters += parameters[i] + " ";
            }
            throw new ParametersExceededException(extraParameters);
        }
    }

    public void noParameterValidation(String parameter) {
        if (parameter.split(" ").length < 2){
            throw new NoParameterException();
        }
    }
}
