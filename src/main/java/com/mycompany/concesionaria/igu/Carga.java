/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.concesionaria.igu;

import com.mycompany.concesionaria.logica.ControladoraLogica;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Roman
 */
public class Carga extends javax.swing.JFrame {
    ControladoraLogica control;
    
    private int xMouse, yMouse;
    /**
     * Creates new form Carga
     */
    public Carga() {
        initComponents();
        control = new ControladoraLogica();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navBar = new javax.swing.JPanel();
        closePanel = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        main = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        inputsPanel = new javax.swing.JPanel();
        txtModelo = new javax.swing.JTextField();
        labelModelo = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        labelMarca = new javax.swing.JLabel();
        txtMotor = new javax.swing.JTextField();
        labelMotor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        labelColor = new javax.swing.JLabel();
        labelPatente = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        txtPuertas = new javax.swing.JTextField();
        labelPuertas = new javax.swing.JLabel();
        btnClean = new javax.swing.JPanel();
        labelClean = new javax.swing.JLabel();
        btnSave = new javax.swing.JPanel();
        labelSave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navBar.setBackground(new java.awt.Color(199, 213, 222));
        navBar.setOpaque(false);
        navBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                navBarMouseDragged(evt);
            }
        });
        navBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navBarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                navBarMousePressed(evt);
            }
        });
        navBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closePanel.setBackground(new java.awt.Color(0, 102, 153));

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setText("X");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout closePanelLayout = new javax.swing.GroupLayout(closePanel);
        closePanel.setLayout(closePanelLayout);
        closePanelLayout.setHorizontalGroup(
            closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        closePanelLayout.setVerticalGroup(
            closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        navBar.add(closePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 50, 40));

        getContentPane().add(navBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        rightPanel.setBackground(new java.awt.Color(0, 102, 153));
        rightPanel.setLayout(new javax.swing.BoxLayout(rightPanel, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 220, 600));

        main.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(51, 51, 51));
        title.setText("CARGA DE AUTOS");

        separador.setBackground(new java.awt.Color(0, 102, 153));
        separador.setForeground(new java.awt.Color(0, 102, 153));

        inputsPanel.setBackground(new java.awt.Color(255, 255, 255));

        txtModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(51, 51, 51));
        txtModelo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 153)));

        labelModelo.setBackground(new java.awt.Color(0, 0, 0));
        labelModelo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelModelo.setForeground(new java.awt.Color(0, 0, 0));
        labelModelo.setText("Modelo");

        txtMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtMarca.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(51, 51, 51));
        txtMarca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 153)));

        labelMarca.setBackground(new java.awt.Color(0, 0, 0));
        labelMarca.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelMarca.setForeground(new java.awt.Color(0, 0, 0));
        labelMarca.setText("Marca");

        txtMotor.setBackground(new java.awt.Color(255, 255, 255));
        txtMotor.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtMotor.setForeground(new java.awt.Color(51, 51, 51));
        txtMotor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 153)));

        labelMotor.setBackground(new java.awt.Color(0, 0, 0));
        labelMotor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelMotor.setForeground(new java.awt.Color(0, 0, 0));
        labelMotor.setText("Motor");

        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtColor.setForeground(new java.awt.Color(51, 51, 51));
        txtColor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 153)));

        labelColor.setBackground(new java.awt.Color(0, 0, 0));
        labelColor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelColor.setForeground(new java.awt.Color(0, 0, 0));
        labelColor.setText("Color");

        labelPatente.setBackground(new java.awt.Color(0, 0, 0));
        labelPatente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelPatente.setForeground(new java.awt.Color(0, 0, 0));
        labelPatente.setText("Patente");

        txtPatente.setBackground(new java.awt.Color(255, 255, 255));
        txtPatente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPatente.setForeground(new java.awt.Color(51, 51, 51));
        txtPatente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 153)));

        txtPuertas.setBackground(new java.awt.Color(255, 255, 255));
        txtPuertas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPuertas.setForeground(new java.awt.Color(51, 51, 51));
        txtPuertas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 153)));

        labelPuertas.setBackground(new java.awt.Color(0, 0, 0));
        labelPuertas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelPuertas.setForeground(new java.awt.Color(0, 0, 0));
        labelPuertas.setText("Cant. de puertas");

        btnClean.setBackground(new java.awt.Color(0, 102, 153));
        btnClean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClean.setPreferredSize(new java.awt.Dimension(150, 50));

        labelClean.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        labelClean.setForeground(new java.awt.Color(255, 255, 255));
        labelClean.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClean.setText("Limpiar");
        labelClean.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCleanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCleanLayout = new javax.swing.GroupLayout(btnClean);
        btnClean.setLayout(btnCleanLayout);
        btnCleanLayout.setHorizontalGroup(
            btnCleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelClean, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        btnCleanLayout.setVerticalGroup(
            btnCleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelClean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnSave.setBackground(new java.awt.Color(0, 102, 153));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setPreferredSize(new java.awt.Dimension(150, 50));

        labelSave.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        labelSave.setForeground(new java.awt.Color(255, 255, 255));
        labelSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSave.setText("Guardar");
        labelSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSaveLayout = new javax.swing.GroupLayout(btnSave);
        btnSave.setLayout(btnSaveLayout);
        btnSaveLayout.setHorizontalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSave, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        btnSaveLayout.setVerticalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSave, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout inputsPanelLayout = new javax.swing.GroupLayout(inputsPanel);
        inputsPanel.setLayout(inputsPanelLayout);
        inputsPanelLayout.setHorizontalGroup(
            inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputsPanelLayout.createSequentialGroup()
                        .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(inputsPanelLayout.createSequentialGroup()
                        .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(inputsPanelLayout.createSequentialGroup()
                        .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(inputsPanelLayout.createSequentialGroup()
                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        inputsPanelLayout.setVerticalGroup(
            inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inputsPanelLayout.createSequentialGroup()
                        .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(inputsPanelLayout.createSequentialGroup()
                                .addComponent(labelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(inputsPanelLayout.createSequentialGroup()
                                .addComponent(labelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(labelMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputsPanelLayout.createSequentialGroup()
                        .addComponent(labelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inputsPanelLayout.createSequentialGroup()
                        .addComponent(labelPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputsPanelLayout.createSequentialGroup()
                        .addComponent(labelPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(btnClean, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addContainerGap(1088, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
        dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        closePanel.setBackground(Color.red);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        closePanel.setBackground(new Color(0,102,153));
    }//GEN-LAST:event_btnCloseMouseExited

    private void labelSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSaveMouseClicked
        String color = txtColor.getText();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String patente = txtPatente.getText();
        int puertas = Integer.parseInt(txtPuertas.getText());
        String motor = txtMotor.getText();
        
        control.guardar(color, marca, modelo, patente, puertas, motor);
        
        mostrarMensaje("Se ha guardado correctamente", "info", "Alta de automóviles");
    }//GEN-LAST:event_labelSaveMouseClicked

    private void mostrarMensaje(String msj, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(msj);
        if(tipo.equals("info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if(tipo.equals("error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    private void labelCleanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCleanMouseClicked
        txtColor.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtPatente.setText("");
        txtPuertas.setText("");
        txtMotor.setText("");
    }//GEN-LAST:event_labelCleanMouseClicked

    private void navBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navBarMouseClicked
        
    }//GEN-LAST:event_navBarMouseClicked

    private void navBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_navBarMouseDragged

    private void navBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_navBarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnClean;
    private javax.swing.JLabel btnClose;
    private javax.swing.JPanel btnSave;
    private javax.swing.JPanel closePanel;
    private javax.swing.JPanel inputsPanel;
    private javax.swing.JLabel labelClean;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelMotor;
    private javax.swing.JLabel labelPatente;
    private javax.swing.JLabel labelPuertas;
    private javax.swing.JLabel labelSave;
    private javax.swing.JPanel main;
    private javax.swing.JPanel navBar;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtPuertas;
    // End of variables declaration//GEN-END:variables
}
