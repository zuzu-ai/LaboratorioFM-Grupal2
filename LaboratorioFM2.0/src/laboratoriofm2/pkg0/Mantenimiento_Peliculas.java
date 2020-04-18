/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriofm2.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Sucely Alvarez
 */
public class Mantenimiento_Peliculas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Mantenimiento_Peliculas
     */
    public Mantenimiento_Peliculas() {
        initComponents();
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Labfm", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("select Nombre_A from Genero_A where CTipo_A=1");
            ResultSet rs = pst.executeQuery();
            
            PreparedStatement pst2 = cn.prepareStatement("select Nombre_A from Clas_A where CTipo_A=1");
            ResultSet rs2 = pst2.executeQuery();
            
             PreparedStatement pst3 = cn.prepareStatement("select Nombre_T from Tiendas");
            ResultSet rs3 = pst3.executeQuery();
            
            
            cbox_Genero.addItem("Seleccione una opción");
            while(rs.next()){
            cbox_Genero.addItem(rs.getString("Nombre_A"));
            }
            
   
            cbox_Clas.addItem("Seleccione una opción");
            while(rs2.next()){
            cbox_Clas.addItem(rs2.getString("Nombre_A"));
            }
            
            cbox_Tienda.addItem("Seleccione una opción");
            while(rs3.next()){
            cbox_Tienda.addItem(rs3.getString("Nombre_T"));
            }

        }catch (Exception e){

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

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNombre_P = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAutor_P = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDuración_P = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio_P = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtExistencia_P = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtbuscado = new javax.swing.JTextField();
        cbox_Genero = new javax.swing.JComboBox<>();
        cbox_Clas = new javax.swing.JComboBox<>();
        lbGenero = new javax.swing.JLabel();
        lbClas = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbox_Tienda = new javax.swing.JComboBox<>();
        lbTienda = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);
        setIconifiable(true);
        setTitle("Peliculas");
        setVisible(true);

        jLabel3.setText("Nombre");

        jLabel4.setText("Autor");

        jLabel5.setText("Género");

        jLabel6.setText("Clasificación");

        jLabel7.setText("Duración");

        jLabel8.setText("Precio");

        jLabel9.setText("Existencia");

        txtExistencia_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExistencia_PActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cbox_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_GeneroActionPerformed(evt);
            }
        });

        cbox_Clas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_ClasActionPerformed(evt);
            }
        });

        lbGenero.setText("...");

        lbClas.setText("...");

        jLabel10.setText("Tienda");

        cbox_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_TiendaActionPerformed(evt);
            }
        });

        lbTienda.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPrecio_P, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addComponent(txtDuración_P, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addComponent(txtAutor_P, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addComponent(txtNombre_P, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addComponent(cbox_Genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbox_Clas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbox_Tienda, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtExistencia_P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbGenero)
                    .addComponent(lbClas)
                    .addComponent(lbTienda))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAutor_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbox_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbox_Clas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbClas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDuración_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPrecio_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtExistencia_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbox_Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTienda))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Labfm", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("insert into Articulos values(?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txtNombre_P.getText().trim());
            pst.setString(3, txtAutor_P.getText().trim());
            pst.setString(4, lbGenero.getText().trim());
            pst.setString(5, lbClas.getText().trim());
            pst.setString(6, txtDuración_P.getText().trim());
            pst.setString(7, txtPrecio_P.getText().trim());
            pst.setString(8, txtExistencia_P.getText().trim());
            pst.setString(9, "1");
            pst.setString(10, lbTienda.getText().trim());
            pst.executeUpdate();


            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
           
            txtNombre_P.setText("");
            txtAutor_P.setText("");
            txtDuración_P.setText("");
            txtPrecio_P.setText("");
            txtExistencia_P.setText("");
            lbGenero.setText("");
            lbClas.setText("");
            lbTienda.setText("");
            txtbuscado.setText("");
            cbox_Genero.setSelectedIndex(0);
            cbox_Clas.setSelectedIndex(0);
            cbox_Tienda.setSelectedIndex(0);
        }catch (Exception e){
             JOptionPane.showMessageDialog(this, "¡REGITRO FALLIDO!", "Error", JOptionPane.ERROR_MESSAGE);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtExistencia_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExistencia_PActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExistencia_PActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
String buscar = txtbuscado.getText().trim();
        if(buscar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso el campo de busqueda!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Labfm", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("select * from Articulos where Codigo_A = ? and CTipo_A=2");
            pst.setString(1, txtbuscado.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
            txtNombre_P.setText(rs.getString("Nombre_A"));
            txtAutor_P.setText(rs.getString("Autor_A"));
            lbGenero.setText(rs.getString("CGenero_A"));
            lbClas.setText(rs.getString("Clasificacion_A"));
            txtDuración_P.setText(rs.getString("Duracion_A"));
            txtPrecio_P.setText(rs.getString("Precio_A"));
            txtExistencia_P.setText(rs.getString("Existencia"));
            lbTienda.setText(rs.getString("Tienda"));
            
            btnEliminar.setEnabled(true);
            btnModificar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "Pelicula no registrado.");
            }

        }catch (Exception e){

        }


        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Labfm", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("delete from Articulos where Codigo_A = ?");

            pst.setString(1, txtbuscado.getText().trim());
            pst.executeUpdate();

            txtbuscado.setText("");

            JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);

            txtNombre_P.setText("");
            txtAutor_P.setText("");
            txtDuración_P.setText("");
            txtPrecio_P.setText("");
            txtExistencia_P.setText("");
            lbGenero.setText("");
            lbClas.setText("");
            lbTienda.setText("");
            txtbuscado.setText("");
            cbox_Genero.setSelectedIndex(0);
            cbox_Clas.setSelectedIndex(0);
            cbox_Tienda.setSelectedIndex(0);
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en la eliminación de registros.", "Error", JOptionPane.ERROR_MESSAGE);
        }   
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
try {
            String codigo = txtbuscado.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Labfm", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("update articulos set Nombre_A = ? , Autor_A= ? , CGenero_A=? , Clasificacion_A= ? , Duracion_A= ?, Precio_A= ?, Existencia=?, Tienda=? where Codigo_A = " + codigo);
      
            
            pst.setString(1, txtNombre_P.getText().trim());
            pst.setString(2, txtAutor_P.getText().trim());
            pst.setString(3, lbGenero.getText().trim());
            pst.setString(4, lbClas.getText().trim());
            pst.setString(5, txtDuración_P.getText().trim());
            pst.setString(6, txtPrecio_P.getText().trim());
            pst.setString(7, txtExistencia_P.getText().trim());
            pst.setString(8, lbTienda.getText().trim());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "MODIFICACION EXITOSA.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            
            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);
            
            txtNombre_P.setText("");
            txtAutor_P.setText("");
            txtDuración_P.setText("");
            txtPrecio_P.setText("");
            txtExistencia_P.setText("");
            lbGenero.setText("");
            lbClas.setText("");
            lbTienda.setText("");
            txtbuscado.setText("");
            cbox_Genero.setSelectedIndex(0);
            cbox_Clas.setSelectedIndex(0);
            cbox_Tienda.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "NO SE PUDO MODIFICAR.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void cbox_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_GeneroActionPerformed
try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Labfm", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("select CGenero_A from Genero_A where Nombre_A= ?");
            pst.setString(1, cbox_Genero.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                lbGenero.setText(rs.getString("CGenero_A"));


            } else {
                
            }

        }catch (Exception e){

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_GeneroActionPerformed

    private void cbox_ClasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_ClasActionPerformed

        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Labfm", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("select CClas_A from Clas_A where Nombre_A= ?");
            pst.setString(1, cbox_Clas.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                lbClas.setText(rs.getString("CClas_A"));


            } else {
                
            }

        }catch (Exception e){

        }


        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_ClasActionPerformed

    private void cbox_TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_TiendaActionPerformed
try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Labfm", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("select Codigo_T from Tiendas where Nombre_T= ?");
            pst.setString(1, cbox_Tienda.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                lbTienda.setText(rs.getString("Codigo_T"));


            } else {
                
            }

        }catch (Exception e){

        }


        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_TiendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbox_Clas;
    private javax.swing.JComboBox<String> cbox_Genero;
    private javax.swing.JComboBox<String> cbox_Tienda;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbClas;
    private javax.swing.JLabel lbGenero;
    private javax.swing.JLabel lbTienda;
    private javax.swing.JTextField txtAutor_P;
    private javax.swing.JTextField txtDuración_P;
    private javax.swing.JTextField txtExistencia_P;
    private javax.swing.JTextField txtNombre_P;
    private javax.swing.JTextField txtPrecio_P;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}
