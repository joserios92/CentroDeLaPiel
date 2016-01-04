
package Visual;

import LogicaDeNegocio.TipoUsuario;
import LogicaDeNegocio.Usuario;
import java.awt.Toolkit;
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
        //this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.jpg")).getImage());
    }
    private void verSiHayTiposDeUsuarios(){
        List<TipoUsuario> tiposDeUs = this.miControl.dameTipoUsuarios();
        if (tiposDeUs.size()==0) {
            try {
                this.miControl.crearTipoUsuario("Secretario");
                this.miControl.crearTipoUsuario("Profesional");
                this.miControl.crearTipoUsuario("Administrador");
                TipoUsuario unT = this.miControl.dameTipoUsuarioPorNombreTipo("Administrador");
                this.miControl.crearUsuario("admin", "admin", unT);
            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogin = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BtnSalir = new javax.swing.JButton();
        BtnValidarUsuario = new javax.swing.JButton();
        TXTUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TXTPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

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

        TXTUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTUsuarioKeyTyped(evt);
            }
        });

        jLabel1.setText("Usuario:");

        TXTPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPasswordKeyTyped(evt);
            }
        });

        jLabel2.setText("Contraseña:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BtnValidarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnValidarUsuario)
                    .addComponent(BtnSalir)))
        );

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
        if (ventana.equals("Profesional")) {
            MenuProfesional unP = new MenuProfesional();
            unP.setVisible(true);
            unP.setTitle("                  Doctora");
            float escalarAlto = 0.95F; // una ventana al 95% del tamaño de la pantalla
            float escalarAncho = 1F;
            int ancho = (int)(Toolkit.getDefaultToolkit().getScreenSize(). width*escalarAncho);
            int alto = (int)(Toolkit.getDefaultToolkit().getScreenSize(). height*escalarAlto);
            unP.setSize(ancho,alto);
            unP.setLocationRelativeTo(null);
            this.dispose();
            
        }else{
            if (ventana.equals("Secretario")) {
                MenuSecretario miEsc = new MenuSecretario();
                miEsc.setVisible(true);
                miEsc.setTitle("                  Secretario ");
                float escalarAlto = 0.95F; // una ventana al 95% del tamaño de la pantalla
                float escalarAncho = 1F;
                int ancho = (int)(Toolkit.getDefaultToolkit().getScreenSize(). width*escalarAncho);
                int alto = (int)(Toolkit.getDefaultToolkit().getScreenSize(). height*escalarAlto);
                miEsc.setSize(ancho,alto);
                miEsc.setLocationRelativeTo(null);
            this.dispose();
            }else{
                if (ventana.equals("Administrador")) {
                    Administrador miAd = new Administrador();
                    miAd.setVisible(true);
                    miAd.setTitle("                  Administrador");
                    float escalarAlto = 0.97F; // una ventana al 95% del tamaño de la pantalla
                    float escalarAncho = 1.2F;
                    int ancho = (int)(Toolkit.getDefaultToolkit().getScreenSize(). width*escalarAncho);
                    int alto = (int)(Toolkit.getDefaultToolkit().getScreenSize(). height*escalarAlto);
                    miAd.setSize(ancho,alto);
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
