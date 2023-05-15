/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.autonoma.edu.game.gui;

import co.autonoma.edu.game.elements.Interpreter;
import javax.swing.DefaultListModel;
import javax.swing.border.BevelBorder;
import co.autonoma.edu.game.exceptions.*;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;

/**
 *
 * @author izibr
 */
public class Window extends javax.swing.JFrame{
    private Interpreter interpreter;
    private TurtleWindow turtleWindow;
    private final int PANEL_X = 25;
    private final int PANEL_Y = 80;
    private final int PANEL_WIDTH = 800;
    private final int PANEL_HEIGHT = 500;
    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        setTitle("Logo UAM");
        setResizable(false);
        setLocationRelativeTo(this);
        turtleWindow = new TurtleWindow();
        turtleWindow.setBounds(PANEL_X, PANEL_Y, PANEL_WIDTH, PANEL_HEIGHT);
        turtleWindow.setBorder(new BevelBorder(BevelBorder.RAISED));
        add(turtleWindow);
    }

    public void setInterpreter(Interpreter interpreter) {
        this.interpreter = interpreter;
        this.interpreter.setX(PANEL_X);
        this.interpreter.setY(PANEL_Y);
        this.interpreter.setWidth(PANEL_WIDTH);
        this.interpreter.setHeight(PANEL_HEIGHT);
        this.interpreter.setInitialTurtleValues();
        this.interpreter.setDrawable(this.turtleWindow);
        turtleWindow.setInterpreter(this.interpreter);
        //this.interpreter.setDrawable(this);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPrompt = new javax.swing.JTextField();
        btnAccept = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listInstructions = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 800));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setText("Logo UAM");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Prompt:");

        txtPrompt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnAccept.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listInstructions);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Instructions list");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrompt, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(512, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(289, 289, 289)
                        .addComponent(jLabel2)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAccept, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(txtPrompt))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//throws NotAvailableInstructionException, VoidInstructionException, NumberFormatException, NegativeDistanceException, PatternSyntaxException, ParametersExceededException
    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        try{
            interpreter.handleInstruction(this.txtPrompt.getText());
        }catch (NotAvailableInstructionException e1){
            JOptionPane.showMessageDialog(this, e1.getMessage());
        }catch (VoidInstructionException e2){
            JOptionPane.showMessageDialog(this, e2.getMessage());
        }catch (NumberFormatException e3){
            JOptionPane.showMessageDialog(this, e3.getMessage());
        }catch (ParametersExceededException e4){
            JOptionPane.showMessageDialog(this, e4.getMessage());
        }catch(NegativeDistanceException e5){
            JOptionPane.showMessageDialog(this, e5.getMessage());
        }catch(PatternSyntaxException e6){
            JOptionPane.showMessageDialog(this, e6.getMessage());
        }catch (NoParameterException e7){
            JOptionPane.showMessageDialog(this, e7.getMessage());
        }
        
    }//GEN-LAST:event_btnAcceptActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<String> listInstructions;
    private javax.swing.JTextField txtPrompt;
    // End of variables declaration//GEN-END:variables

    //@Override
    //public void fillList(DefaultListModel data) {
        //this.listInstructions.setModel(data);
    //}
}
