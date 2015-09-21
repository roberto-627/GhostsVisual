package ghostsvisual;

/*
Author Roberto Melara
 */

public class GhostsMenuInicio extends javax.swing.JFrame { 
    
    public GhostsMenuInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelSignIn = new javax.swing.JLabel();
        jLabelSignUp = new javax.swing.JLabel();
        jLabelSalir = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(380, 302));
        setMinimumSize(new java.awt.Dimension(380, 302));
        setResizable(false);

        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabelSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Sign In.png"))); // NOI18N
        jLabelSignIn.setToolTipText(null);
        jLabelSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSignInMousePressed(evt);
            }
        });
        jPanel1.add(jLabelSignIn);
        jLabelSignIn.setBounds(50, 100, 80, 30);

        jLabelSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Sign Up.png"))); // NOI18N
        jLabelSignUp.setToolTipText(null);
        jLabelSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSignUpMousePressed(evt);
            }
        });
        jPanel1.add(jLabelSignUp);
        jLabelSignUp.setBounds(50, 140, 80, 30);

        jLabelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Salir10.png"))); // NOI18N
        jLabelSalir.setToolTipText(null);
        jLabelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSalirMousePressed(evt);
            }
        });
        jPanel1.add(jLabelSalir);
        jLabelSalir.setBounds(60, 180, 60, 20);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Background.png"))); // NOI18N
        jPanel1.add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 380, 302);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelSignInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignInMousePressed
        //Ir a ventana de Sign In.
        SignIn abrir = new SignIn();
        abrir.setVisible(true);
        this.setVisible(false);
                
    }//GEN-LAST:event_jLabelSignInMousePressed

    private void jLabelSignUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignUpMousePressed
        //Ir a ventana de Sign Up.
        SignUp abrir = new SignUp();
        abrir.setVisible(true);
        this.setVisible(false);     
    }//GEN-LAST:event_jLabelSignUpMousePressed

    private void jLabelSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMousePressed
        //Salir del programa.
        System.exit(0);
    }//GEN-LAST:event_jLabelSalirMousePressed
    

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GhostsMenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GhostsMenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GhostsMenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GhostsMenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GhostsMenuInicio().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBackground;
    private static javax.swing.JLabel jLabelSalir;
    private static javax.swing.JLabel jLabelSignIn;
    private static javax.swing.JLabel jLabelSignUp;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
