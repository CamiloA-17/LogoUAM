/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.instructions;

/**
 *
 * @author izibr
 */
public class LoadInstruction extends Instruction{

    public LoadInstruction() {
        super(1);
    }
    
    @Override
    public void setParameter(String parameter) {
        parametersValidation(parameter);
    }
    
}
