/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.elements;

import co.autonoma.edu.game.interfaces.Dimensionable;
import java.awt.Graphics;

/**
 *
 * @author izibr
 */
public abstract class Sprite {

    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected Dimensionable area;

    public Sprite(int x, int y, int width, int height) {
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }

    public abstract void draw(Graphics g);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Dimensionable getArea() {
        return area;
    }
    
    public void setArea(Dimensionable area) {
        this.area = area;
    }
    
    
}
