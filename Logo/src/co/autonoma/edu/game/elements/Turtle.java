/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.elements;

import co.autonoma.edu.game.instructions.*;
import co.autonoma.edu.game.interfaces.Drawable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Turtle extends Sprite{
    private double angle;
    private Color pencilColor;
    private Drawable drawable;
    
    public Turtle(int x, int y, int width, int height){
        super(x, y, width, height);
        this.angle = 0;
        this.pencilColor = Color.BLACK;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(x, y);
        g2d.rotate(Math.toRadians(angle));
        g2d.setColor(pencilColor);
        g2d.fillRect(0, 0, width, height);
    }

    public void handleInstruction(Instruction instruction) throws NumberFormatException {
        if (instruction instanceof SetColorInstruction){
            //setColor((SetColorInstruction)instruction);
            //drawable.redraw();
            return;
        }
        if (instruction instanceof ForwardInstruction
         || instruction instanceof BackwardInstruction) {
            move(instruction);
            drawable.redraw();
        }
        if (instruction.equals("RT") || instruction.equals("RIGHTTURN") 
        || instruction.equals("LT") || instruction.equals("LEFTTURN")){
            turn(instruction);
            drawable.redraw();
        }
    }
    
    public void move(Instruction instruction){
        System.out.println("Se intenta mover");
        double aux_x = x;
        double aux_y = y;
        if (instruction instanceof ForwardInstruction) {
            int value = ((ForwardInstruction)instruction).getDistance();
            aux_x = aux_x + (Math.sin(Math.toRadians(angle))*value);
            aux_y = aux_y - (Math.cos(Math.toRadians(angle))*value);
        }
        if (instruction instanceof BackwardInstruction) {
            int value = ((ForwardInstruction)instruction).getDistance();
            aux_x = aux_x - (Math.sin(Math.toRadians(angle))*value);
            aux_y = aux_y + (Math.cos(Math.toRadians(angle))*value);
        }
        
        x = (int)Math.round(aux_x);
        y = (int)Math.round(aux_y);
    }
    
    public void turn(Instruction instruction){
        if (instruction instanceof RightTurnInstruction) {
            int value = ((ForwardInstruction)instruction).getDistance();
        }
        if (instruction instanceof LeftTurnInstruction) {
            int value = ((ForwardInstruction)instruction).getDistance();
        }
    }
    
    
    public void setColor(String color){
        switch(color){
            case "BLACK":
                pencilColor = Color.BLACK;
                break;
            case "BLUE":
                pencilColor = Color.BLUE;
                break;
            case "CYAN":
                pencilColor = Color.CYAN;
                break;
            
        }
    }

    public void home() {

    }

    public void repeat(int cant, ArrayList<String> instruccionts) {

    }
    
    public void setDrawable(Drawable drawable){
        this.drawable = drawable;
    }
}
