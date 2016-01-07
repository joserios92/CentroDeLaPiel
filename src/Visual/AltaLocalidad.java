package Visual;

import LogicaDeNegocio.Localidad;
import LogicaDeNegocio.Pais;
import LogicaDeNegocio.Provincia;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AltaLocalidad extends javax.swing.JFrame {

    ControladoraVisual miControl = new ControladoraVisual();
    DefaultListModel misPaises = new DefaultListModel();
    DefaultListModel misProvincias = new DefaultListModel();
    DefaultListModel misLocalidades = new DefaultListModel();
    DefaultComboBoxModel comboPaises = new DefaultComboBoxModel();
    DefaultComboBoxModel comboPaises2 = new DefaultComboBoxModel();
    DefaultComboBoxModel comboProvincias = new DefaultComboBoxModel(); 
    
    public AltaLocalidad() {
        initComponents();
        this.cargarListaPaises();
        this.cargarComboPaisesProv();
        this.cargarComboPaisesLoc();
        this.cargarComboProvincias();
        this.cargarListaProvincias();
        this.cargarListaLocalidades();
        this.listaProvincias.setModel(misProvincias);
        this.listaLocalidades.setModel(misLocalidades);
    }

    public void cargarListaPaises(){
        List <Pais> paises = this.miControl.damePaises();
        for(Pais unP:paises){
            misPaises.addElement(unP);
        }
        listaPaises.setModel(misPaises);
    }

    public void cargarComboPaisesProv(){
        List <Pais> paises = this.miControl.damePaises();
        for(Pais unP:paises){
            comboPaises.addElement(unP);
        }
        cmbPais1.setModel(comboPaises);
    }
    
    public void cargarComboPaisesLoc(){
        List <Pais> paises = this.miControl.damePaises();
        for(Pais unP:paises){
            comboPaises2.addElement(unP);
        }
        cmbPais2.setModel(comboPaises2);
    }
       
    public void cargarComboProvincias(){
        Pais unP = (Pais) cmbPais2.getSelectedItem();
        List <Provincia> provincias = miControl.dameProvincias();
        for(Provincia unaP:provincias){
            if(unaP.getUnPais().getNombrePais() == unP.getNombrePais()){
                comboProvincias.addElement(unaP);
            }
        }
        cmbProvincia.setModel(comboProvincias);
    }        
        
    public void cargarListaProvincias(){
    Pais unP = (Pais) cmbPais1.getSelectedItem();
        List <Provincia> provincias = miControl.dameProvincias();
        for(Provincia unaP:provincias){
            if(unaP.getUnPais().getNombrePais() == unP.getNombrePais()){
                misProvincias.addElement(unaP);
            }
        }
        listaProvincias.setModel(misProvincias);
    }
    
    public void cargarListaLocalidades(){
            Provincia unaP = (Provincia) cmbProvincia.getSelectedItem();
        List <Localidad> localidades = miControl.dameLocalidades();
        for(Localidad unaL:localidades){
            if(unaL.getUnaProvincia().getNombreProvincia() == unaP.getNombreProvincia()){
                misLocalidades.addElement(unaL);
            }
        }
        listaLocalidades.setModel(misLocalidades);
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPaises = new javax.swing.JList();
        txtPais = new javax.swing.JTextField();
        btnAgregarPais = new javax.swing.JButton();
        btnGuardarPais = new javax.swing.JButton();
        cmbPais1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaProvincias = new javax.swing.JList();
        jTextField2 = new javax.swing.JTextField();
        btnAgregarProvincia = new javax.swing.JButton();
        btnGuardarProvincia = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbProvincia = new javax.swing.JComboBox();
        cmbPais2 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaLocalidades = new javax.swing.JList();
        jTextField3 = new javax.swing.JTextField();
        btnAgregarLocalidad = new javax.swing.JButton();
        btnGuardarLocalidad = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("PAIS");

        jLabel2.setText("LOCALIDAD");

        jLabel3.setText("PROVINCIA");

        listaPaises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPaisesMouseClicked(evt);
            }
        });
        listaPaises.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPaisesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaPaises);

        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });

        btnAgregarPais.setText("Agregar");
        btnAgregarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPaisActionPerformed(evt);
            }
        });

        btnGuardarPais.setText("Guardar");
        btnGuardarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPaisActionPerformed(evt);
            }
        });

        cmbPais1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbPais1MouseClicked(evt);
            }
        });

        jLabel4.setText("PAIS");

        jScrollPane2.setViewportView(listaProvincias);

        btnAgregarProvincia.setText("Agregar");

        btnGuardarProvincia.setText("Guardar");
        btnGuardarProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProvinciaActionPerformed(evt);
            }
        });

        jLabel5.setText("PROVINCIA");

        cmbProvincia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbProvinciaMouseClicked(evt);
            }
        });
        cmbProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProvinciaActionPerformed(evt);
            }
        });

        cmbPais2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbPais2MouseClicked(evt);
            }
        });

        jLabel6.setText("PAIS");

        jScrollPane3.setViewportView(listaLocalidades);

        btnAgregarLocalidad.setText("Agregar");

        btnGuardarLocalidad.setText("Guardar");
        btnGuardarLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLocalidadActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarPais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarPais))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarProvincia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarProvincia))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(cmbPais1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarLocalidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalir)
                            .addComponent(btnGuardarLocalidad)))
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cmbProvincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbPais2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAgregarPais)
                                    .addComponent(btnGuardarPais))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(3, 3, 3)
                                        .addComponent(cmbPais2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnAgregarLocalidad)
                                            .addComponent(btnGuardarLocalidad)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbPais1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnAgregarProvincia)
                                            .addComponent(btnGuardarProvincia))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnSalir)
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarPaisActionPerformed

    private void btnGuardarProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarProvinciaActionPerformed

    private void btnGuardarLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarLocalidadActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed

    private void btnAgregarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPaisActionPerformed
        try {
            String aux = txtPais.getText();
            Pais unP = this.miControl.crearPais(aux);
            if (unP != null){
                JOptionPane.showMessageDialog(null, "País Agregado Exitosamente","Aviso", WIDTH);
            }
            else{
                JOptionPane.showMessageDialog(null, "País NO Agregado","Error", WIDTH);
            }
        } catch (Exception ex) {
            Logger.getLogger(AltaLocalidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarPaisActionPerformed

    private void listaPaisesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPaisesValueChanged
    }//GEN-LAST:event_listaPaisesValueChanged

    private void listaPaisesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPaisesMouseClicked
        Pais unP = (Pais) listaPaises.getSelectedValue();
        String nombrepais = unP.getNombrePais();
        txtPais.setText(nombrepais);
    }//GEN-LAST:event_listaPaisesMouseClicked

    private void cmbPais1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPais1MouseClicked
        cargarListaProvincias();
    }//GEN-LAST:event_cmbPais1MouseClicked

    private void cmbProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProvinciaActionPerformed

    }//GEN-LAST:event_cmbProvinciaActionPerformed

    private void cmbProvinciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbProvinciaMouseClicked
        misLocalidades.clear();
        cargarListaLocalidades();
    }//GEN-LAST:event_cmbProvinciaMouseClicked

    private void cmbPais2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPais2MouseClicked
        cargarComboProvincias();
    }//GEN-LAST:event_cmbPais2MouseClicked

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
            java.util.logging.Logger.getLogger(AltaLocalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaLocalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaLocalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaLocalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaLocalidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLocalidad;
    private javax.swing.JButton btnAgregarPais;
    private javax.swing.JButton btnAgregarProvincia;
    private javax.swing.JButton btnGuardarLocalidad;
    private javax.swing.JButton btnGuardarPais;
    private javax.swing.JButton btnGuardarProvincia;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbPais1;
    private javax.swing.JComboBox cmbPais2;
    private javax.swing.JComboBox cmbProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JList listaLocalidades;
    private javax.swing.JList listaPaises;
    private javax.swing.JList listaProvincias;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
