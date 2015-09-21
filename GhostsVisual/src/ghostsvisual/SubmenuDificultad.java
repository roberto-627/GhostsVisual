package ghostsvisual;

/*
 * @author Roberto Melara
 */
public class SubmenuDificultad extends javax.swing.JFrame {

    /**
     * Creates new form SubmenuDificultad
     */
    public SubmenuDificultad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNormal = new javax.swing.JLabel();
        jLabelExpert = new javax.swing.JLabel();
        jLabelGenius = new javax.swing.JLabel();
        jLabelSeleccion = new javax.swing.JLabel();
        jLabelRegresar = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 600));
        setMinimumSize(new java.awt.Dimension(750, 600));
        setPreferredSize(new java.awt.Dimension(750, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Normal.png"))); // NOI18N
        jLabelNormal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelNormalMousePressed(evt);
            }
        });
        getContentPane().add(jLabelNormal);
        jLabelNormal.setBounds(370, 180, 269, 48);

        jLabelExpert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Expert.png"))); // NOI18N
        jLabelExpert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelExpertMousePressed(evt);
            }
        });
        getContentPane().add(jLabelExpert);
        jLabelExpert.setBounds(370, 250, 270, 60);

        jLabelGenius.setForeground(new java.awt.Color(251, 255, 68));
        jLabelGenius.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Genius.png"))); // NOI18N
        jLabelGenius.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelGeniusMousePressed(evt);
            }
        });
        getContentPane().add(jLabelGenius);
        jLabelGenius.setBounds(370, 330, 270, 50);

        jLabelSeleccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSeleccion.setForeground(new java.awt.Color(251, 255, 68));
        jLabelSeleccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelSeleccion);
        jLabelSeleccion.setBounds(280, 400, 450, 30);

        jLabelRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Regresar.png"))); // NOI18N
        jLabelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelRegresarMousePressed(evt);
            }
        });
        getContentPane().add(jLabelRegresar);
        jLabelRegresar.setBounds(430, 470, 300, 65);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Sub-MenusDificultad.png"))); // NOI18N
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 751, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelNormalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNormalMousePressed
        //Establecer dificultad como Normal.
        GhostsMenuPrincipal.Dificultad = 0;
        //Informar al usuario del cambio.
        jLabelSeleccion.setText("Dificultad Normal seleccionada, suerte!");
    }//GEN-LAST:event_jLabelNormalMousePressed

    private void jLabelExpertMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExpertMousePressed
        //Establecer dificultad como Expert.
        GhostsMenuPrincipal.Dificultad = 1;
        //Informar al usuario del cambio.
        jLabelSeleccion.setText("Dificultad Expert seleccionada, mucha suerte!");
    }//GEN-LAST:event_jLabelExpertMousePressed

    private void jLabelGeniusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGeniusMousePressed
        //Establecer dificultad como Genius.
        GhostsMenuPrincipal.Dificultad = 2;
        //Informar al usuario del cambio.
        jLabelSeleccion.setText("Dificultad Genius seleccionada, mucha mucha suerte!");
    }//GEN-LAST:event_jLabelGeniusMousePressed

    private void jLabelRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegresarMousePressed
        // Regresar al Menu de Configuracion.
        //Regresar al menu principal.
        MenuConfiguracion abrir = new MenuConfiguracion();
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
            java.util.logging.Logger.getLogger(SubmenuDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubmenuDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubmenuDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubmenuDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubmenuDificultad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelExpert;
    private javax.swing.JLabel jLabelGenius;
    private javax.swing.JLabel jLabelNormal;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelSeleccion;
    // End of variables declaration//GEN-END:variables
}
