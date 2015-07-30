/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import CargarImagen.ImagenFondo;
import CargarImagen.ImagenFrame;
import LogicaDeNegocio.Colegio;
import LogicaDeNegocio.TipoUsuario;
import LogicaDeNegocio.Usuario;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Login extends javax.swing.JFrame {
    ControladoraVisual miControl = new ControladoraVisual();
    DefaultComboBoxModel tipos = new DefaultComboBoxModel();
    
    public Login() {
        initComponents();
        verSiHayTiposDeUsuarios();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.jpg")).getImage());
    }
    private void verSiHayTiposDeUsuarios(){
        List<TipoUsuario> tiposDeUs = this.miControl.dameTipoUsuarios();
        if (tiposDeUs.size()==0) {
            try {
                this.miControl.crearTipoUsuario("Secretario");
                this.miControl.crearTipoUsuario("Profesional");
                this.miControl.crearTipoUsuario("Administrador");
                TipoUsuario unT = this.miControl.dameTipoUsuario("Administrador");
                this.miControl.crearUsuario("ruso", "1", unT);
            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogin = new javax.swing.JPanel();
        BtnValidarUsuario = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        TXTPassword = new javax.swing.JPasswordField();
        TXTUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnValidarUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruso\\Documents\\NetBeansProjects\\Colegio\\src\\Icons\\accept.png")); // NOI18N
        BtnValidarUsuario.setText("Entrar");
        BtnValidarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnValidarUsuarioMouseClicked(evt);
            }
        });
        BtnValidarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnValidarUsuarioActionPerformed(evt);
            }
        });
        BtnValidarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnValidarUsuarioKeyPressed(evt);
            }
        });

        BtnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruso\\Documents\\NetBeansProjects\\Colegio\\src\\Icons\\control_power.png")); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        TXTPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPasswordKeyTyped(evt);
            }
        });

        TXTUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTUsuarioKeyTyped(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruso\\Documents\\Iconos\\famfamfam_mini_icons\\icon_user.gif")); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruso\\Documents\\Iconos\\famfamfam_mini_icons\\icon_key.gif")); // NOI18N
        jLabel2.setText("Contraseña:");

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addComponent(BtnValidarUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSalir))
                    .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TXTUsuario)
                        .addComponent(TXTPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXTPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnValidarUsuario)
                    .addComponent(BtnSalir))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        getContentPane().add(PanelLogin, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnValidarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnValidarUsuarioActionPerformed
        String ventana=null;
        String user = TXTUsuario.getText();
        String pass = TXTPassword.getText();
        ventana=miControl.validarUsuario(user,pass);
        if (ventana != null) {
        if (ventana=="Secretario") {
            Secretario miEsc = new Secretario();
            miEsc.setVisible(true);
            miEsc.setTitle("Sistema Cokifimi - Secretario");
            miEsc.setSize(1366,730);
            miEsc.setLocationRelativeTo(null);
            this.dispose();
            
        }else{
            if (ventana=="Abogado") {
                Secundario miEsc = new Secundario();
                miEsc.setVisible(true);
                miEsc.setTitle("Sistema Cokifimi - Secundario");
                miEsc.setSize(1366,730);
                miEsc.setLocationRelativeTo(null);
            this.dispose();
            }else{
                if (ventana=="Administrador") {
                    Administrador miAd = new Administrador();
                    miAd.setVisible(true);
                    miAd.setTitle("Sistema Cokifimi - Administrador");
                    miAd.setSize(1366,730);
                    miAd.setLocationRelativeTo(null);
                    
                    
                }
            }
        }
        }else{
            JOptionPane.showMessageDialog(null, "No es correcto el usuario o la contraseña", "Error", WIDTH);
        }
    }//GEN-LAST:event_BtnValidarUsuarioActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnValidarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnValidarUsuarioMouseClicked
        
    }//GEN-LAST:event_BtnValidarUsuarioMouseClicked

    private void BtnValidarUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnValidarUsuarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnValidarUsuarioKeyPressed

    private void TXTUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTUsuarioKeyTyped
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER) {
            BtnValidarUsuario.doClick();
        }
    }//GEN-LAST:event_TXTUsuarioKeyTyped

    private void TXTPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPasswordKeyTyped
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER) {
            BtnValidarUsuario.doClick();
        }
    }//GEN-LAST:event_TXTPasswordKeyTyped

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnValidarUsuario;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JPasswordField TXTPassword;
    private javax.swing.JTextField TXTUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
