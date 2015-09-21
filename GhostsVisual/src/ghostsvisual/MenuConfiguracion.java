package ghostsvisual;

/*
 * @author Roberto Melara
 */
public class MenuConfiguracion extends javax.swing.JFrame {

    public MenuConfiguracion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDificultad = new javax.swing.JLabel();
        jLabelMododeJuego = new javax.swing.JLabel();
        jLabelRegresar = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 600));
        setMinimumSize(new java.awt.Dimension(750, 600));
        setPreferredSize(new java.awt.Dimension(750, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelDificultad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Dificultad.png"))); // NOI18N
        jLabelDificultad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelDificultadMousePressed(evt);
            }
        });
        getContentPane().add(jLabelDificultad);
        jLabelDificultad.setBounds(420, 230, 320, 60);

        jLabelMododeJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/MododeJu.png"))); // NOI18N
        jLabelMododeJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMododeJuegoMousePressed(evt);
            }
        });
        getContentPane().add(jLabelMododeJuego);
        jLabelMododeJuego.setBounds(250, 330, 490, 70);

        jLabelRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Regresar.png"))); // NOI18N
        jLabelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelRegresarMousePressed(evt);
            }
        });
        getContentPane().add(jLabelRegresar);
        jLabelRegresar.setBounds(420, 500, 300, 65);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Sub-MenusConfiguracion.png"))); // NOI18N
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 750, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegresarMousePressed
        //Regresar al menu principal.
        GhostsMenuPrincipal abrir = new GhostsMenuPrincipal();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelRegresarMousePressed

    private void jLabelDificultadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDificultadMousePressed
        //Ir al Menu de Dificultad.
        SubmenuDificultad abrir = new SubmenuDificultad();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelDificultadMousePressed

    private void jLabelMododeJuegoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMododeJuegoMousePressed
        //Ir al Menu de Modo de Juego.
        SubmenuModoDeJuego abrir = new SubmenuModoDeJuego();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelMododeJuegoMousePressed

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
            java.util.logging.Logger.getLogger(MenuConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConfiguracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelDificultad;
    private javax.swing.JLabel jLabelMododeJuego;
    private javax.swing.JLabel jLabelRegresar;
    // End of variables declaration//GEN-END:variables
}
