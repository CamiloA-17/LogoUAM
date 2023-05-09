/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.elements;

import co.autonoma.edu.co.game.interfaces.Drawable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Turtle {

    private int x;
    private int y;
    private int width;
    private int height;
    private double angle;
    private Color pencilColor;
    private Drawable drawable;

    public Turtle(int x, int y, int width, int height, double angle, Color pencilColor) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.angle = angle;
        this.pencilColor = pencilColor;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(x, y);
        g2d.rotate(Math.toRadians(angle));
        g2d.setColor(pencilColor);
        g2d.fillRect(0, 0, width, height);
    }

    public void handleInstruction(String instruction, String parameter) throws NumberFormatException {
        if (instruction.equals("SC") || instruction.equals("SETCOLOR")){
            setColor(parameter);
            drawable.redraw();
            return;
        }
        int value = Integer.parseInt(parameter);
        if (instruction.equals("FD") || instruction.equals("FORWARD")
         || instruction.equals("BD") || instruction.equals("BACKWARD")) {
            move(instruction, value);
            drawable.redraw();
        }
        if (instruction.equals("RT") || instruction.equals("RIGHTTURN") 
        || instruction.equals("LT") || instruction.equals("LEFTTURN")){
            turn(instruction, value);
            drawable.redraw();
        }
    }
    
    public void move(String direction, double value){
        System.out.println("Se intenta mover");
        double aux_x = x;
        double aux_y = y;
        if (direction.equals("FD") || direction.equals("FORWARD")) {
            aux_x = aux_x + (Math.sin(Math.toRadians(angle))*value);
            aux_y = aux_y - (Math.cos(Math.toRadians(angle))*value);
        }
        if (direction.equals("BD") || direction.equals("BACKWARD")) {
            aux_x = aux_x - (Math.sin(Math.toRadians(angle))*value);
            aux_y = aux_y + (Math.cos(Math.toRadians(angle))*value);
        }
        
        x = (int)Math.round(aux_x);
        y = (int)Math.round(aux_y);
    }
    
    public void turn(String direction, int value){
        if (direction.equals("RT") || direction.equals("RIGHTTURN")) {
            angle += value;
        }
        if (direction.equals("LT") || direction.equals("LEFTTURN")) {
            angle -= value;
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
