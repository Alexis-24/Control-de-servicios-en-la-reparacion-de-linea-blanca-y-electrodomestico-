/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Index.Consultar;
import conexion.Database;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author roy_b
 */
public class Cliente extends javax.swing.JFrame {

DefaultTableModel dtm;
private ResultSet rs;
    private PreparedStatement ps;
    private ResultSetMetaData rsm;
    public Cliente() {
        initComponents();
        Mostrardatos();
     
        this.setLocationRelativeTo(null); //Poner el form en el centro
         
         Border panel =BorderFactory.createMatteBorder(5, 5, 4, 4,Color.black);
         jPanel1.setBorder(panel);
    }
    
    void Mostrardatos(){
        QueryTableBusqueda("SELECT * FROM public.cliente\n" +
"ORDER BY idcliente ASC;");

        
     }
     public void QueryTableBusqueda(String SQL){

 
        try {
            Statement estatuto = Database.getConexion().createStatement();
            rs = estatuto.executeQuery(SQL);
            rsm = rs.getMetaData();

            ArrayList<Object[]> datos = new ArrayList<>();
            while (rs.next()) {
                Object[] filas = new Object[rsm.getColumnCount()];
                for (int i = 0; i < filas.length; i++) {
                    filas[i] = rs.getObject(i + 1);

                }
                datos.add(filas);
            }
            dtm = (DefaultTableModel) Jengi.getModel();
            for (int i = 0; i < datos.size(); i++) {
                dtm.addRow(datos.get(i));
            }

            System.out.println("Llenado Automatico");
            System.out.println("Query Exitoso");
            estatuto.close();
            

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Algo anda mal...  "); //Manda mensaje de error
        } finally {
       
        }
       
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
        jScrollPane2 = new javax.swing.JScrollPane();
        Jengi = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_apellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_direccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_fecha = new javax.swing.JTextField();
        jButton_volver = new javax.swing.JButton();
        jButton_modificar = new javax.swing.JButton();

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

        Jengi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Dirección", "Teléfono", "Fecha nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Jengi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mouseclicked(evt);
            }
        });
        jScrollPane2.setViewportView(Jengi);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Apellidos: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Dirección:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Telefono:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Fecha Nacimiento:");

        jButton_volver.setBackground(new java.awt.Color(192, 57, 43));
        jButton_volver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_volver.setForeground(new java.awt.Color(255, 255, 255));
        jButton_volver.setText("Volver");
        jButton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_volverActionPerformed(evt);
            }
        });

        jButton_modificar.setBackground(new java.awt.Color(34, 167, 240));
        jButton_modificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_modificar.setText("Modificar");
        jButton_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelmin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_nombre)
                    .addComponent(jTextField_direccion)
                    .addComponent(jTextField_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jButton_volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                .addComponent(jButton_modificar)
                .addGap(302, 302, 302))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelmin)
                            .addComponent(jLabelcerrar)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_volver, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButton_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelminMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelminMouseClicked

    private void jLabelcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcerrarMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelcerrarMouseClicked

    private void jButton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_volverActionPerformed
        Consultar form = new Consultar();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                //Cerra el formulario actual
                this.dispose();
    }//GEN-LAST:event_jButton_volverActionPerformed

    private void Mouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mouseclicked
       PreparedStatement cs;
        ResultSet rs;
        Cargardatos();
        int filaPulsada;
        filaPulsada =Jengi.getSelectedRow();
        if(filaPulsada>=0){
            //int identificador=(int)dtm.getValueAt(filaPulsada,0);
            try{
                System.err.println(dtm.getValueAt(filaPulsada,0));
                cs=Database.getConexion().prepareStatement("SELECT idcliente FROM cliente WHERE idcliente = "+dtm.getValueAt(filaPulsada,0)+";");
                System.out.println("SELECT idcliente FROM cliente WHERE idcliente = "+dtm.getValueAt(filaPulsada,0)+";");
                //cs.setInt(1,identificador);
                //String codigo=(String)dtm.getValueAt(filaPulsada, 0);
                //codigo=idempleado;
                rs=cs.executeQuery();
                /*
                cs=Database.getConexion().prepareStatement("SELECT id_empleado FROM empleados WHERE id_empleado = ?");
                cs.setInt(1,identificador);
                rs=cs.executeQuery();
                if(rs.next()){
                   System.err.println(dtm.getValueAt(filaPulsada,0));
                }*/
            }catch(SQLException e){
                System.err.println("Error al cargar un cliente");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_Mouseclicked

    private void jButton_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modificarActionPerformed
    String nomb = jTextField_nombre.getText();
    String apell = jTextField_apellidos.getText();
    String direccion = jTextField_direccion.getText();
    String telefono = jTextField_telefono.getText();
    String fecha = jTextField_fecha.getText();
    Cargardatos();
    
    if(veryfiel()){  
       
        
        String SQL = ("UPDATE cliente"+
                
                      " SET nombre='"+nomb+"', apellidos='"+apell+"', direccion='"+direccion+"', telefono='"+telefono+"',fechanac='"+fecha+"'" +
                      " WHERE idcliente=?;");
        
        try {
            Statement estatuto = Database.getConexion().createStatement();
            estatuto.executeUpdate(SQL);
            JOptionPane.showMessageDialog(null, "Se ha modificado Exitosamente","Informacion",JOptionPane.INFORMATION_MESSAGE); //Manda mensaje de registro exitoso
            estatuto.close();
            

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Modifico "); //Manda mensaje de error
        }finally {
            
        }
    }

    }//GEN-LAST:event_jButton_modificarActionPerformed

    void Cargardatos(/*int idempleado*/) {
    PreparedStatement cs;
        ResultSet rs;
        
            try{
                cs=Database.getConexion().prepareStatement("SELECT nombre, apellidos, direccion, telefono, fechanac  FROM cliente WHERE idcliente=?");
                
                rs=cs.executeQuery();
                if(rs.next()){
                   //cs.setInt(1,idempleado);
                   jTextField_nombre.setText(rs.getString(1));
                   jTextField_apellidos.setText(rs.getString(2));
                   jTextField_direccion.setText(rs.getString(3));
                   jTextField_telefono.setText(rs.getString(4));
                   jTextField_fecha.setText(rs.getString(5));
                    ;
                   
                }
            }catch(SQLException e){
                System.err.println("Error al cargar un cliente");
                e.printStackTrace();
            }
        }
    public boolean veryfiel(){
    String nomb = jTextField_nombre.getText();
    String apell = jTextField_apellidos.getText();
    String direc = jTextField_direccion.getText();
    String telefono = jTextField_telefono.getText();
    String fechanac = jTextField_fecha.getText();
    //Cmprueba los campos vacios
    if(nomb.trim().equals("") || apell.trim().equals("") || direc.trim().equals("") || telefono.trim().equals("") ||
     fechanac.trim().equals("") )
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jengi;
    private javax.swing.JButton jButton_modificar;
    private javax.swing.JButton jButton_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelcerrar;
    private javax.swing.JLabel jLabelmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_apellidos;
    private javax.swing.JTextField jTextField_direccion;
    private javax.swing.JTextField jTextField_fecha;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
