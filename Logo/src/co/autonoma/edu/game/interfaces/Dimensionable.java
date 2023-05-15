/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.autonoma.edu.game.interfaces;

import java.awt.image.ImageObserver;

/**
 *
 * @author izibr
 */
public interface Dimensionable {
    public int getX();
    public int getY();
    public int getWidth();
    public int getHeight();
    public ImageObserver getObserver();
}
