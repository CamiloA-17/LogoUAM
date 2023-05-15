/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.autonoma.edu.game.interfaces;

/**
 *
 * @author izibr
 */
public interface Limitable {
    public final int LIMIT = 2;
    public void parametersValidation(String parameter);
    public void noParameterValidation(String parameter);
}
