/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.elements;

import co.autonoma.edu.co.game.interfaces.Drawable;
import java.awt.Color;
import java.awt.Graphics;
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
        g.setColor(pencilColor);
        g.drawRect(x, y, width, height);
    }

    public void handleInstruction(String instruction, String parameter) throws NumberFormatException {
        if (instruction.equals("SC") || instruction.equals("SETCOLOR")){
            setColor(parameter);
            return;
        }
        int value = Integer.parseInt(parameter);
        if (instruction.equals("FD") || instruction.equals("FORWARD")
         || instruction.equals("BD") || instruction.equals("BACKWARD")) {
            move(instruction, value);
            drawable.redraw();
        }
        if (instruction.equals("RT") || instruction.equals("RIGHTTURN")) {
            rightTurn(value);
        }
        if (instruction.equals("LT") || instruction.equals("LEFTTURN")) {
            leftTurn(value);
        }
    }
    
    public void move(String direction, int value){
        System.out.println("Se intenta mover");
        if (direction.equals("FD") || direction.equals("FORWARD")) {
            y -= value;
        }
        if (direction.equals("BD") || direction.equals("BACKWARD")) {
            y += value;
        }
    }
    
    public void rightTurn(double angle) {

    }

    public void leftTurn(double angle) {

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
