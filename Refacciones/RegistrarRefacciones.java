/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refacciones;

import Index.Registro;
import conexion.Database;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author roy_b
 */
public class RegistrarRefacciones extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarRefacciones
     */
    public RegistrarRefacciones() {
        initComponents();
        this.setLocationRelativeTo(null); //Poner el form en el centro
         
         Border panel_reg =BorderFactory.createMatteBorder(5, 5, 4, 4,Color.black);
         jPanel1.setBorder(panel_reg);
         
         Border panel =BorderFactory.createMatteBorder(5, 5, 4, 4,Color.black);
         jPanel_registro.setBorder(panel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelmin = new javax.swing.JLabel();
        jLabelcerrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_guardar_Emp = new javax.swing.JButton();
        jButton_can = new javax.swing.JButton();
        jPanel_registro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_modelo = new javax.swing.JTextField();
        jTextField_desc = new javax.swing.JTextField();
        jTextField_stock = new javax.swing.JTextField();
        jTextField_precio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cservicios1.png"))); // NOI18N

        jLabelmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelmin.setText("-");
        jLabelmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelminMouseClicked(evt);
            }
        });

        jLabelcerrar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelcerrar.setText("x");
        jLabelcerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelcerrarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Refacciones");

        jButton_guardar_Emp.setBackground(new java.awt.Color(34, 167, 240));
        jButton_guardar_Emp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_guardar_Emp.setForeground(new java.awt.Color(255, 255, 255));
        jButton_guardar_Emp.setText("Guardar");
        jButton_guardar_Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardar_EmpActionPerformed(evt);
            }
        });

        jButton_can.setBackground(new java.awt.Color(192, 57, 43));
        jButton_can.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_can.setForeground(new java.awt.Color(255, 255, 255));
        jButton_can.setText("Cancelar");
        jButton_can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_canActionPerformed(evt);
            }
        });

        jPanel_registro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Modelo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Descripción");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Stock");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Precio");

        jTextField_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_stockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_registroLayout = new javax.swing.GroupLayout(jPanel_registro);
        jPanel_registro.setLayout(jPanel_registroLayout);
        jPanel_registroLayout.setHorizontalGroup(
            jPanel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_registroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(46, 46, 46)
                .addGroup(jPanel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_modelo)
                    .addComponent(jTextField_desc)
                    .addComponent(jTextField_stock)
                    .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel_registroLayout.setVerticalGroup(
            jPanel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_registroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelmin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButton_guardar_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_can)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel_registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_guardar_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_can, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelcerrar)
                    .addComponent(jLabelmin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelminMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelminMouseClicked

    private void jLabelcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcerrarMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelcerrarMouseClicked

    private void jButton_guardar_EmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardar_EmpActionPerformed
        String modelo = jTextField_modelo.getText();
        String descripcion = jTextField_desc.getText();
        String stock = jTextField_stock.getText();
        String precio = jTextField_precio.getText();

        if(veryfiel()){
            String SQL = ("INSERT INTO refaccion"+
                "( modelo, descrip, stock, precio)"+
                "VALUES ('"+modelo+"','"+descripcion+"','"+stock+"','"+precio+"')");

            try {
                Statement estatuto = Database.getConexion().createStatement();
                estatuto.executeUpdate(SQL);
                JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Informacion",JOptionPane.INFORMATION_MESSAGE); //Manda mensaje de registro exitoso
                estatuto.close();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "No se Registro "); //Manda mensaje de error
            }finally {

            }
        }
    }//GEN-LAST:event_jButton_guardar_EmpActionPerformed

    private void jButton_canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_canActionPerformed
        Registro R = new Registro();
        R.setVisible(true);
        R.pack();
        R.setLocationRelativeTo(null);
        //Cerra el formulario actual
        this.dispose();
    }//GEN-LAST:event_jButton_canActionPerformed

    private void jTextField_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_stockActionPerformed

    public boolean veryfiel(){
    String modelo = jTextField_modelo.getText();
    String descripcion = jTextField_desc.getText();
    String stock = jTextField_stock.getText();
    String precio = jTextField_precio.getText();
    //Cmprueba los campos vacios
    if(modelo.trim().equals("") || descripcion.trim().equals("")|| stock.trim().equals("") ||
     precio.trim().equals(""))
    {
        JOptionPane.showMessageDialog(null,"Uno o mas campos están vacíos");
        return false;
    }else{
        return true; 
    }
}
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarRefacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarRefacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarRefacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarRefacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarRefacciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_can;
    private javax.swing.JButton jButton_guardar_Emp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelcerrar;
    private javax.swing.JLabel jLabelmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_registro;
    private javax.swing.JTextField jTextField_desc;
    private javax.swing.JTextField jTextField_modelo;
    private javax.swing.JTextField jTextField_precio;
    private javax.swing.JTextField jTextField_stock;
    // End of variables declaration//GEN-END:variables
}
