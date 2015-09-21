package ghostsvisual;

/*
 * @Author Roberto Melara
 */
public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        
        //Esconder label de coincidencia.
        jLabelCoincidencia.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jPasswordFieldPassConfirm = new javax.swing.JPasswordField();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        jLabelPassConfirm = new javax.swing.JLabel();
        jLabelRegresar = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jLabelCoincidencia = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTextFieldUsuario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(190, 60, 120, 20);

        jPasswordFieldPass.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(jPasswordFieldPass);
        jPasswordFieldPass.setBounds(190, 90, 120, 20);

        jPasswordFieldPassConfirm.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(jPasswordFieldPassConfirm);
        jPasswordFieldPassConfirm.setBounds(190, 120, 120, 19);

        jLabelUsuario.setFont(new java.awt.Font("Fipps", 0, 10)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(251, 255, 68));
        jLabelUsuario.setText("Usuario:");
        jPanel1.add(jLabelUsuario);
        jLabelUsuario.setBounds(80, 60, 90, 17);

        jLabelPass.setFont(new java.awt.Font("Fipps", 0, 10)); // NOI18N
        jLabelPass.setForeground(new java.awt.Color(251, 255, 68));
        jLabelPass.setText("Password:");
        jPanel1.add(jLabelPass);
        jLabelPass.setBounds(80, 90, 90, 17);

        jLabelPassConfirm.setFont(new java.awt.Font("Fipps", 0, 10)); // NOI18N
        jLabelPassConfirm.setForeground(new java.awt.Color(251, 255, 68));
        jLabelPassConfirm.setText("Password:");
        jPanel1.add(jLabelPassConfirm);
        jLabelPassConfirm.setBounds(80, 120, 90, 17);

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
        jLabelRegresar.setBounds(290, 270, 80, 20);

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMousePressed(evt);
            }
        });
        jPanel1.add(jButtonRegistrar);
        jButtonRegistrar.setBounds(200, 160, 90, 23);

        jLabelCoincidencia.setForeground(new java.awt.Color(251, 255, 68));
        jLabelCoincidencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCoincidencia.setText("Campos no coinciden.");
        jPanel1.add(jLabelCoincidencia);
        jLabelCoincidencia.setBounds(170, 200, 160, 14);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/BackgroundSignUp.jpg"))); // NOI18N
        jPanel1.add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 380, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegresarMousePressed
        //Ir a ventana de Menu de Inicio.
        GhostsMenuInicio abrir = new GhostsMenuInicio();
        abrir.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabelRegresarMousePressed

    private void jButtonRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMousePressed
        //Validar si coinciden ambas passwords y crear nuevo objeto player.
        if(Player.ValidarPass(jPasswordFieldPass.getText(), jPasswordFieldPassConfirm.getText(), jTextFieldUsuario.getText())== true){
            //Preparar arreglo de los ultimos 10 juegos.
            Player.usuarios[Player.posuser1].ult10 = new String[10];
            
            //Ir a ventana de Menu de Inicio.
            GhostsMenuPrincipal abrir = new GhostsMenuPrincipal();
            abrir.setVisible(true);
            this.setVisible(false);
        }else{
            jLabelCoincidencia.setVisible(true);
        }
        
    }//GEN-LAST:event_jButtonRegistrarMousePressed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabelBackground;
    public static javax.swing.JLabel jLabelCoincidencia;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelPassConfirm;
    public static javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField jPasswordFieldPass;
    public static javax.swing.JPasswordField jPasswordFieldPassConfirm;
    public static javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
