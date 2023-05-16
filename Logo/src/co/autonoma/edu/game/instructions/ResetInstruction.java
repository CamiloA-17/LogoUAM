/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.instructions;

/**
 *
 * @author izibr
 */
public class ResetInstruction extends Instruction{

    public ResetInstruction() {
        super(0);
    }
    
    @Override
    public void setParameter(String parameter) {
        parametersValidation(parameter);
    }
}
