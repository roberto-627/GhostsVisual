
package ghostsvisual;

public class SignIn extends javax.swing.JFrame {
    public SignIn() {
        initComponents();
        //Ocultar jLabelSignInFail.
        jLabelSignInFail.setVisible(false);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabelPassword = new javax.swing.JLabel();
        jButtonSignIn = new javax.swing.JButton();
        jLabelSignInFail = new javax.swing.JLabel();
        jLabelRegresar = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTextFieldUsuario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(60, 140, 110, 19);

        jLabelUsuario.setFont(new java.awt.Font("Fipps", 0, 10)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(251, 255, 68));
        jLabelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsuario.setText("Usuario");
        jPanel1.add(jLabelUsuario);
        jLabelUsuario.setBounds(60, 117, 110, 20);

        jPasswordFieldPassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(jPasswordFieldPassword);
        jPasswordFieldPassword.setBounds(60, 190, 110, 19);

        jLabelPassword.setFont(new java.awt.Font("Fipps", 0, 10)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(251, 255, 68));
        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPassword.setText("Password");
        jPanel1.add(jLabelPassword);
        jLabelPassword.setBounds(60, 170, 110, 17);

        jButtonSignIn.setText("Sign In");
        jButtonSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonSignInMousePressed(evt);
            }
        });
        jPanel1.add(jButtonSignIn);
        jButtonSignIn.setBounds(80, 220, 70, 23);

        jLabelSignInFail.setForeground(new java.awt.Color(251, 255, 68));
        jLabelSignInFail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSignInFail.setText("Usuario o Password Incorrecto.");
        jPanel1.add(jLabelSignInFail);
        jLabelSignInFail.setBounds(30, 260, 170, 14);

        jLabelRegresar.setFont(new java.awt.Font("Fipps", 0, 10)); // NOI18N
        jLabelRegresar.setForeground(new java.awt.Color(251, 255, 68));
        jLabelRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegresar.setText("Regresar");
        jLabelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelRegresarMousePressed(evt);
            }
        });
        jPanel1.add(jLabelRegresar);
        jLabelRegresar.setBounds(280, 270, 80, 17);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/BackgroundSignIn.png"))); // NOI18N
        jPanel1.add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 380, 302);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegresarMousePressed
        //Ir a ventana de Menu de Inicio.
        GhostsMenuInicio abrir = new GhostsMenuInicio();
        abrir.setVisible(true);
        this.setVisible(false);       
    }//GEN-LAST:event_jLabelRegresarMousePressed

    private void jButtonSignInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSignInMousePressed
        //Validacion de datos.
        if(Player.ValidarSignIn(jTextFieldUsuario.getText(), jPasswordFieldPassword.getText())== true){            
            GhostsMenuPrincipal abrir = new GhostsMenuPrincipal();
            abrir.setVisible(true);
            this.setVisible(false);
        }else{
            jLabelSignInFail.setVisible(true);
        }
    }//GEN-LAST:event_jButtonSignInMousePressed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSignIn;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelSignInFail;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
