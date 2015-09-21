package ghostsvisual;

/*
 * @author Roberto Melara
 */
public class SubmenuMisDatos extends javax.swing.JFrame {

    public SubmenuMisDatos() {
        initComponents();
        ActualizarDatos(Player.posuser1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelGhostBueno = new javax.swing.JLabel();
        jLabelGhostMalo = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelMostarUsuario = new javax.swing.JLabel();
        jLabelMostrarPassword = new javax.swing.JLabel();
        jLabelPuntos = new javax.swing.JLabel();
        jLabelMostrarPuntos = new javax.swing.JLabel();
        jLabelRegresar = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 600));
        setMinimumSize(new java.awt.Dimension(750, 600));
        setPreferredSize(new java.awt.Dimension(750, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelGhostBueno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/GhostPlayer1.png"))); // NOI18N
        getContentPane().add(jLabelGhostBueno);
        jLabelGhostBueno.setBounds(420, 250, 50, 50);

        jLabelGhostMalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/GhostPlayer2.png"))); // NOI18N
        getContentPane().add(jLabelGhostMalo);
        jLabelGhostMalo.setBounds(550, 250, 50, 50);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(251, 255, 68));
        jLabelUsuario.setText("Usuario:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(400, 320, 50, 14);

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(251, 255, 68));
        jLabelPassword.setText("Password:");
        getContentPane().add(jLabelPassword);
        jLabelPassword.setBounds(400, 350, 63, 17);

        jLabelMostarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMostarUsuario.setForeground(new java.awt.Color(251, 255, 68));
        jLabelMostarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMostarUsuario.setText("-");
        getContentPane().add(jLabelMostarUsuario);
        jLabelMostarUsuario.setBounds(530, 320, 90, 17);

        jLabelMostrarPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMostrarPassword.setForeground(new java.awt.Color(251, 255, 68));
        jLabelMostrarPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMostrarPassword.setText("-");
        getContentPane().add(jLabelMostrarPassword);
        jLabelMostrarPassword.setBounds(530, 350, 90, 17);

        jLabelPuntos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPuntos.setForeground(new java.awt.Color(251, 255, 68));
        jLabelPuntos.setText("Puntos:");
        getContentPane().add(jLabelPuntos);
        jLabelPuntos.setBounds(400, 380, 48, 17);

        jLabelMostrarPuntos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMostrarPuntos.setForeground(new java.awt.Color(251, 255, 68));
        jLabelMostrarPuntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMostrarPuntos.setText("-");
        getContentPane().add(jLabelMostrarPuntos);
        jLabelMostrarPuntos.setBounds(530, 380, 90, 17);

        jLabelRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Regresar.png"))); // NOI18N
        jLabelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelRegresarMousePressed(evt);
            }
        });
        getContentPane().add(jLabelRegresar);
        jLabelRegresar.setBounds(430, 500, 300, 65);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Sub-MenusMisDatos.png"))); // NOI18N
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 751, 602);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegresarMousePressed
        //Regresar al Menu Mi Perfil.
        MenuMiPerfil abrir = new MenuMiPerfil();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelRegresarMousePressed

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
            java.util.logging.Logger.getLogger(SubmenuMisDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubmenuMisDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubmenuMisDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubmenuMisDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubmenuMisDatos().setVisible(true);
            }
        });
    }
    
    //Funcion para actualizar datos.
    public void ActualizarDatos(int posusuario){
        jLabelMostarUsuario.setText(Player.usuarios[posusuario].user);
        jLabelMostrarPassword.setText(Player.usuarios[posusuario].password);
        jLabelMostrarPuntos.setText(""+Player.usuarios[posusuario].puntos);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelGhostBueno;
    private javax.swing.JLabel jLabelGhostMalo;
    private javax.swing.JLabel jLabelMostarUsuario;
    private javax.swing.JLabel jLabelMostrarPassword;
    private javax.swing.JLabel jLabelMostrarPuntos;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPuntos;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelUsuario;
    // End of variables declaration//GEN-END:variables
}
