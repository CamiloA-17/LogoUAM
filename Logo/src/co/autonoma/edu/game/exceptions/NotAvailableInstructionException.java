/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.exceptions;

/**
 *
 * @author izibr
 */
public class NotAvailableInstructionException extends RuntimeException{

    public NotAvailableInstructionException(String instruction) {
        super("La instruccion: " + instruction + " no es valida");
    }
    
}
