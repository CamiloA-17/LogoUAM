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
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class Turtle extends Sprite {

    private double angle;
    private Color pencilColor;
    private Drawable drawable;
    private LinkedList<Integer> xPoints;
    private LinkedList<Integer> yPoints;
    private ImageIcon image;
    private int initialX;
    private int initialY;
    private LinkedList<Line> lines;

    public Turtle(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.angle = 0;
        this.pencilColor = Color.BLACK;
        this.lines = new LinkedList<>();
        this.image = new ImageIcon("C:\\Users\\izibr\\OneDrive\\Escritorio\\Universidad\\ProOri\\ProjectLogo\\LogoUAM\\Logo\\src\\co\\autonoma\\edu\\game\\imgs\\turtle.png");
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (Line line : lines) {
            line.draw(g2d);
        }
        g2d.translate(x, y);
        AffineTransform tx = AffineTransform.getRotateInstance(Math.toRadians(angle), width / 2, height / 2);
        g2d.drawImage(image.getImage(), tx, area.getObserver());
    }

    public void handleInstruction(Instruction instruction) throws NumberFormatException {
        if (instruction instanceof SetColorInstruction) {
            pencilColor = ((SetColorInstruction) instruction).getColor();
            drawable.redraw();
            return;
        }
        if (instruction instanceof ForwardInstruction
                || instruction instanceof BackwardInstruction) {
            move(instruction);
            drawable.redraw();
        }
        if (instruction instanceof RightTurnInstruction
                || instruction instanceof LeftTurnInstruction) {
            turn(instruction);
            drawable.redraw();
        }
        if (instruction instanceof HomeInstruction) {
            home(instruction);
            drawable.redraw();
        }
        if (instruction instanceof ResetInstruction) {
            reset(instruction);
            drawable.redraw();
        }
    }

    public void move(Instruction instruction) {
        double aux_x = x;
        double aux_y = y;
        if (instruction instanceof ForwardInstruction) {
            int value = ((ForwardInstruction) instruction).getDistance();
            aux_x = aux_x + (Math.sin(Math.toRadians(angle)) * value);
            aux_y = aux_y - (Math.cos(Math.toRadians(angle)) * value);
        }
        if (instruction instanceof BackwardInstruction) {
            int value = ((BackwardInstruction) instruction).getDistance();
            aux_x = aux_x - (Math.sin(Math.toRadians(angle)) * value);
            aux_y = aux_y + (Math.cos(Math.toRadians(angle)) * value);
        }
        Line newLine = new Line(this.pencilColor, x + width / 2, y + height / 2, (int) Math.round(aux_x) + width / 2, (int) Math.round(aux_y) + height / 2);
        lines.add(newLine);
        x = (int) Math.round(aux_x);
        y = (int) Math.round(aux_y);
        //xPoints.add(x + width / 2);
        //yPoints.add(y + height / 2);
    }

    public void turn(Instruction instruction) {
        if (instruction instanceof RightTurnInstruction) {
            angle += ((RightTurnInstruction) instruction).getAngle();
        }
        if (instruction instanceof LeftTurnInstruction) {
            angle -= ((LeftTurnInstruction) instruction).getAngle();
        }
    }

    public void home(Instruction instruction) {
        if (instruction instanceof HomeInstruction) {
            this.x = initialX;
            this.y = initialY;
            xPoints.add(x + width / 2);
            yPoints.add(y + height / 2);
        }
    }

    public void reset(Instruction instruction) {
        if (instruction instanceof ResetInstruction) {
            this.setX(initialX);
            this.setY(initialY);
            this.angle = 0;
        }
    }

    public void repeat(int cant, ArrayList<String> instruccionts) {

    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public int[] updateXPoints() {
        int[] xAuxPoints = new int[xPoints.size()];
        for (int i = 0; i < xPoints.size(); i++) {
            xAuxPoints[i] = xPoints.get(i);
        }
        return xAuxPoints;
    }

    public int[] updateYPoints() {
        int[] yAuxPoints = new int[yPoints.size()];
        for (int i = 0; i < yPoints.size(); i++) {
            yAuxPoints[i] = yPoints.get(i);
        }
        return yAuxPoints;
    }

    @Override
    public void setX(int x) {
        this.x = x;
        this.initialX = x;
        this.xPoints = new LinkedList<>();
        this.xPoints.add(x + width / 2);
    }

    @Override
    public void setY(int y) {
        this.y = y;
        this.initialY = y;
        this.yPoints = new LinkedList<>();
        yPoints.add(y + height / 2);
    }
}
