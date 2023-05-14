/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.autonoma.edu.game.gui;

import co.autonoma.edu.game.elements.Interpreter;
import co.autonoma.edu.game.interfaces.Drawable;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.DefaultListModel;

/**
 *
 * @author ASUS
 */
public class TurtleWindow extends javax.swing.JPanel implements Drawable {
    Interpreter interprete;
    public TurtleWindow() {
        initComponents();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
        this.interprete.draw(g);
    }
    
    public void setInterpreter(Interpreter interprete){
        this.interprete = interprete;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public void redraw(){
        repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
