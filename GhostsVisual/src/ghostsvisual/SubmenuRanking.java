package ghostsvisual;

import java.util.Arrays;

/*
 * @Author Roberto Melara
 */
public class SubmenuRanking extends javax.swing.JFrame {

    public SubmenuRanking() {
        initComponents();
        OrdenarArreglo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelRegresar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelJuego1 = new javax.swing.JLabel();
        jLabelJuego2 = new javax.swing.JLabel();
        jLabelJuego3 = new javax.swing.JLabel();
        jLabelJuego4 = new javax.swing.JLabel();
        jLabelJuego5 = new javax.swing.JLabel();
        jLabelJuego6 = new javax.swing.JLabel();
        jLabelJuego7 = new javax.swing.JLabel();
        jLabelJuego8 = new javax.swing.JLabel();
        jLabelJuego9 = new javax.swing.JLabel();
        jLabelJuego10 = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 600));
        setMinimumSize(new java.awt.Dimension(750, 600));
        setPreferredSize(new java.awt.Dimension(750, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(251, 255, 68));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("A continuacion se muestra el ranking de los mejores jugadores.");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(314, 210, 400, 17);

        jLabelRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Regresar10.png"))); // NOI18N
        jLabelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelRegresarMousePressed(evt);
            }
        });
        getContentPane().add(jLabelRegresar);
        jLabelRegresar.setBounds(570, 530, 160, 34);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(251, 255, 68));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 260, 20, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 255, 68));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 280, 20, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(251, 255, 68));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 300, 20, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(251, 255, 68));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 320, 20, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(251, 255, 68));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(330, 340, 20, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(251, 255, 68));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 360, 20, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(251, 255, 68));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 380, 20, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(251, 255, 68));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(330, 400, 20, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(251, 255, 68));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(330, 420, 20, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(251, 255, 68));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(330, 440, 20, 17);

        jLabelJuego1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelJuego1.setForeground(new java.awt.Color(251, 255, 68));
        jLabelJuego1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelJuego1);
        jLabelJuego1.setBounds(360, 260, 140, 20);

        jLabelJuego2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelJuego2.setForeground(new java.awt.Color(251, 255, 68));
        jLabelJuego2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelJuego2);
        jLabelJuego2.setBounds(360, 280, 140, 0);

        jLabelJuego3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelJuego3.setForeground(new java.awt.Color(251, 255, 68));
        jLabelJuego3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelJuego3);
        jLabelJuego3.setBounds(360, 300, 140, 0);

        jLabelJuego4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelJuego4.setForeground(new java.awt.Color(251, 255, 68));
        jLabelJuego4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelJuego4);
        jLabelJuego4.setBounds(360, 320, 140, 0);

        jLabelJuego5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelJuego5.setForeground(new java.awt.Color(251, 255, 68));
        jLabelJuego5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelJuego5);
        jLabelJuego5.setBounds(360, 340, 140, 0);

        jLabelJuego6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelJuego6.setForeground(new java.awt.Color(251, 255, 68));
        jLabelJuego6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelJuego6);
        jLabelJuego6.setBounds(360, 360, 140, 0);

        jLabelJuego7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelJuego7.setForeground(new java.awt.Color(251, 255, 68));
        jLabelJuego7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelJuego7);
        jLabelJuego7.setBounds(360, 380, 140, 0);

        jLabelJuego8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelJuego8.setForeground(new java.awt.Color(251, 255, 68));
        jLabelJuego8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelJuego8);
        jLabelJuego8.setBounds(360, 400, 140, 0);

        jLabelJuego9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelJuego9.setForeground(new java.awt.Color(251, 255, 68));
        jLabelJuego9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelJuego9);
        jLabelJuego9.setBounds(360, 420, 140, 0);

        jLabelJuego10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelJuego10.setForeground(new java.awt.Color(251, 255, 68));
        jLabelJuego10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelJuego10);
        jLabelJuego10.setBounds(360, 440, 140, 0);

        jLabelBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Roberto Melara\\Documents\\Sub-MenusRanking.png")); // NOI18N
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(1, 0, 750, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegresarMousePressed
        // Regresar al Menu de Reportes.
        MenuReportes abrir = new MenuReportes();
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
            java.util.logging.Logger.getLogger(SubmenuRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubmenuRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubmenuRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubmenuRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubmenuRanking().setVisible(true);
            }
        });
    }
    
    private void OrdenarArreglo(){
        int Almacen[] = new int[30];
        for(int pos = 0; pos <=28; pos ++){
            if(Player.usuarios[pos].user != null){
                Almacen[pos] = Player.usuarios[pos].puntos;
            }else{
                break;
            } 
        }
        
        Arrays.sort(Almacen);
        
        for(int pos = 0; pos <=28; pos ++){
            if(Player.usuarios[pos].puntos == Almacen[0]){
                jLabelJuego1.setText(Player.usuarios[pos].user + "   " +""+Player.usuarios[pos].puntos);
            }
        }
        for(int pos = 0; pos <=28; pos ++){
            if(Player.usuarios[pos].puntos == Almacen[1]){
                jLabelJuego2.setText(Player.usuarios[pos].user + "   " +""+Player.usuarios[pos].puntos);
            }
        }
        for(int pos = 0; pos <=28; pos ++){
            if(Player.usuarios[pos].puntos == Almacen[2]){
                jLabelJuego3.setText(Player.usuarios[pos].user + "   " +""+Player.usuarios[pos].puntos);
            }
        }
        for(int pos = 0; pos <=28; pos ++){
            if(Player.usuarios[pos].puntos == Almacen[3]){
                jLabelJuego4.setText(Player.usuarios[pos].user + "   " +""+Player.usuarios[pos].puntos);
            }
        }
        for(int pos = 0; pos <=28; pos ++){
            if(Player.usuarios[pos].puntos == Almacen[4]){
                jLabelJuego5.setText(Player.usuarios[pos].user + "   " +""+Player.usuarios[pos].puntos);
            }
        }
        for(int pos = 0; pos <=28; pos ++){
            if(Player.usuarios[pos].puntos == Almacen[5]){
                jLabelJuego6.setText(Player.usuarios[pos].user + "   " +""+Player.usuarios[pos].puntos);
            }
        }
        for(int pos = 0; pos <=28; pos ++){
            if(Player.usuarios[pos].puntos == Almacen[6]){
                jLabelJuego7.setText(Player.usuarios[pos].user + "   " +""+Player.usuarios[pos].puntos);
            }
        }
        for(int pos = 0; pos <=28; pos ++){
            if(Player.usuarios[pos].puntos == Almacen[7]){
                jLabelJuego8.setText(Player.usuarios[pos].user + "   " +""+Player.usuarios[pos].puntos);
            }
        }
        for(int pos = 0; pos <=28; pos ++){
            if(Player.usuarios[pos].puntos == Almacen[8]){
                jLabelJuego9.setText(Player.usuarios[pos].user + "   " +""+Player.usuarios[pos].puntos);
            }
        }
        for(int pos = 0; pos <=28; pos ++){
            if(Player.usuarios[pos].puntos == Almacen[9]){
                jLabelJuego10.setText(Player.usuarios[pos].user + "   " +""+Player.usuarios[pos].puntos);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelJuego1;
    private javax.swing.JLabel jLabelJuego10;
    private javax.swing.JLabel jLabelJuego2;
    private javax.swing.JLabel jLabelJuego3;
    private javax.swing.JLabel jLabelJuego4;
    private javax.swing.JLabel jLabelJuego5;
    private javax.swing.JLabel jLabelJuego6;
    private javax.swing.JLabel jLabelJuego7;
    private javax.swing.JLabel jLabelJuego8;
    private javax.swing.JLabel jLabelJuego9;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
