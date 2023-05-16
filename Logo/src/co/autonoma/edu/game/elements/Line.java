/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.elements;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author izibr
 */
public class Line {
    private Color color;
    private int x_1;
    private int y_1;
    private int x_2;
    private int y_2;

    public Line(Color color, int x_1, int y_1, int x_2, int y_2) {
        this.color = color;
        this.x_1 = x_1;
        this.y_1 = y_1;
        this.x_2 = x_2;
        this.y_2 = y_2;
    }
    
    public void draw(Graphics2D g2d){
        g2d.setColor(color);
        g2d.drawLine(x_1, y_1, x_2, y_2);
    }
}
