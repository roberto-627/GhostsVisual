package ghostsvisual;

/*
 * @Author Roberto Melara
 */


public class GhostsMenuPrincipal extends javax.swing.JFrame {
    //Variables que almacenan dificultad y tipo de modo de juego.
    public static int Dificultad = 0;
    public static int ModoDeJuego = 0;
    
    public GhostsMenuPrincipal() {
        initComponents();
        jLabelNombreUsuario.setText(Player.usuarios[Player.posuser1].user + " !");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelJugar = new javax.swing.JLabel();
        jLabelConfiguracion = new javax.swing.JLabel();
        jLabelMiPerfil = new javax.swing.JLabel();
        jLabelReportes = new javax.swing.JLabel();
        jLabelSalir = new javax.swing.JLabel();
        jLabelBienvenido = new javax.swing.JLabel();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 624));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Jugar.png"))); // NOI18N
        jLabelJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelJugarMousePressed(evt);
            }
        });
        getContentPane().add(jLabelJugar);
        jLabelJugar.setBounds(50, 100, 240, 380);

        jLabelConfiguracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Configuracion.png"))); // NOI18N
        jLabelConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelConfiguracionMousePressed(evt);
            }
        });
        getContentPane().add(jLabelConfiguracion);
        jLabelConfiguracion.setBounds(670, 190, 310, 50);

        jLabelMiPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMiPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/MiPerfil.png"))); // NOI18N
        jLabelMiPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMiPerfilMousePressed(evt);
            }
        });
        getContentPane().add(jLabelMiPerfil);
        jLabelMiPerfil.setBounds(730, 320, 190, 40);

        jLabelReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Reportes.png"))); // NOI18N
        jLabelReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelReportesMousePressed(evt);
            }
        });
        getContentPane().add(jLabelReportes);
        jLabelReportes.setBounds(720, 260, 210, 40);

        jLabelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Salir.png"))); // NOI18N
        jLabelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSalirMousePressed(evt);
            }
        });
        getContentPane().add(jLabelSalir);
        jLabelSalir.setBounds(770, 380, 110, 40);

        jLabelBienvenido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(251, 255, 68));
        jLabelBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBienvenido.setText("Bienvenido ");
        getContentPane().add(jLabelBienvenido);
        jLabelBienvenido.setBounds(710, 20, 100, 30);

        jLabelNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNombreUsuario.setForeground(new java.awt.Color(251, 255, 68));
        getContentPane().add(jLabelNombreUsuario);
        jLabelNombreUsuario.setBounds(820, 20, 170, 30);

        jLabelBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Main Menu800.png"))); // NOI18N
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 1000, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMousePressed
        // SignOut del usuario actual y regreso al menu de inicio.
        GhostsMenuInicio abrir = new GhostsMenuInicio();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelSalirMousePressed

    private void jLabelConfiguracionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConfiguracionMousePressed
        //Ir al menu de Configuracion.
        MenuConfiguracion abrir = new MenuConfiguracion();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelConfiguracionMousePressed

    private void jLabelReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReportesMousePressed
        //Ir al menu de reportes.
        MenuReportes abrir = new MenuReportes();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelReportesMousePressed

    private void jLabelMiPerfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMiPerfilMousePressed
        //Ir al menu de mi perfil.
        MenuMiPerfil abrir = new MenuMiPerfil();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelMiPerfilMousePressed

    private void jLabelJugarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelJugarMousePressed
        //Ir al Juego.
        SignInPlayer2 abrir = new SignInPlayer2();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelJugarMousePressed

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
            java.util.logging.Logger.getLogger(GhostsMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GhostsMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GhostsMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GhostsMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GhostsMenuPrincipal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelConfiguracion;
    private javax.swing.JLabel jLabelJugar;
    private javax.swing.JLabel jLabelMiPerfil;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelReportes;
    private javax.swing.JLabel jLabelSalir;
    // End of variables declaration//GEN-END:variables
}
