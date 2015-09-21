package ghostsvisual;

/*
 * @Author Roberto Melara
 */
public class ColocarPlayer1 extends javax.swing.JFrame {
    public static int PiezasxColocar = TableroVisual.PiezasxColocar;
    public static int PiezasColocadasB = 1;
    public static int PiezasColocadasM = 1;
    public static int PiezasColocadas = PiezasColocadasB +PiezasColocadasM;
    public static int fila;
    public static int columna;
        
    public ColocarPlayer1() {
        initComponents();
        jLabelColocadas.setText(""+PiezasxColocar);
        ActualizarPColocadas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPos01 = new javax.swing.JLabel();
        jLabelPos02 = new javax.swing.JLabel();
        jLabelPos03 = new javax.swing.JLabel();
        jLabelPos04 = new javax.swing.JLabel();
        jLabelPos14 = new javax.swing.JLabel();
        jLabelPos13 = new javax.swing.JLabel();
        jLabelPos12 = new javax.swing.JLabel();
        jLabelPos11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldColumna = new javax.swing.JTextField();
        jTextFieldFila = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabelColocadas = new javax.swing.JLabel();
        jLabelDisponibles = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelPos01.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPos01.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos01.setText("[0][1]");
        getContentPane().add(jLabelPos01);
        jLabelPos01.setBounds(174, 54, 80, 80);

        jLabelPos02.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPos02.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos02.setText("[0][2]");
        getContentPane().add(jLabelPos02);
        jLabelPos02.setBounds(274, 54, 80, 80);

        jLabelPos03.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPos03.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos03.setText("[0][3]");
        getContentPane().add(jLabelPos03);
        jLabelPos03.setBounds(374, 54, 90, 80);

        jLabelPos04.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPos04.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos04.setText("[0][4]");
        getContentPane().add(jLabelPos04);
        jLabelPos04.setBounds(484, 54, 80, 80);

        jLabelPos14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPos14.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos14.setText("[1][4]");
        getContentPane().add(jLabelPos14);
        jLabelPos14.setBounds(474, 154, 90, 90);

        jLabelPos13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPos13.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos13.setText("[1][3]");
        getContentPane().add(jLabelPos13);
        jLabelPos13.setBounds(374, 154, 90, 90);

        jLabelPos12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPos12.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos12.setText("[1][2]");
        getContentPane().add(jLabelPos12);
        jLabelPos12.setBounds(274, 154, 90, 90);

        jLabelPos11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPos11.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos11.setText("[1][1]");
        getContentPane().add(jLabelPos11);
        jLabelPos11.setBounds(174, 154, 80, 80);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(250, 255, 68));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("[");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(810, 140, 10, 60);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(250, 255, 68));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("]");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(870, 140, 10, 60);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(250, 255, 68));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("]");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(950, 140, 10, 60);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(250, 255, 68));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("[");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(890, 140, 10, 60);
        getContentPane().add(jTextFieldColumna);
        jTextFieldColumna.setBounds(910, 160, 30, 20);
        getContentPane().add(jTextFieldFila);
        jTextFieldFila.setBounds(830, 160, 30, 20);

        jButton1.setText("Colocar Bueno");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(780, 200, 110, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(250, 255, 68));
        jLabel15.setText("Disponibles:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(810, 250, 80, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(250, 255, 68));
        jLabel16.setText("Colocadas:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(810, 280, 70, 20);

        jButton2.setText("Colocar Malo");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(890, 200, 110, 30);

        jLabelColocadas.setForeground(new java.awt.Color(250, 255, 68));
        getContentPane().add(jLabelColocadas);
        jLabelColocadas.setBounds(900, 280, 20, 20);

        jLabelDisponibles.setForeground(new java.awt.Color(250, 255, 68));
        getContentPane().add(jLabelDisponibles);
        jLabelDisponibles.setBounds(900, 250, 20, 20);

        jLabel1.setForeground(new java.awt.Color(250, 255, 68));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(780, 314, 210, 20);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/SemiTableroPlayer1.png"))); // NOI18N
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 1000, 351);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        //Valida Dificultad.
        if(GhostsMenuPrincipal.Dificultad == 0){
            if(PiezasColocadasB < PiezasxColocar/2){
                TableroVisual.TableroFondo.ColocarBuenosPlayer18x8(Integer.parseInt(jTextFieldFila.getText()), Integer.parseInt(jTextFieldFila.getText()));
                PiezasColocadasB ++;
                ActualizarPColocadas();
            }else{
                jLabel1.setText("Maximo de ese Tipo.");
            }
        }else if(GhostsMenuPrincipal.Dificultad == 1){
            if(PiezasColocadasB < PiezasxColocar/2){
                TableroVisual.TableroFondo.ColocarBuenosPlayer14x4(Integer.parseInt(jTextFieldFila.getText()), Integer.parseInt(jTextFieldFila.getText()));
                PiezasColocadasB ++;
                ActualizarPColocadas();
            }else{
                jLabel1.setText("Maximo de ese Tipo.");
            }
        }else if(GhostsMenuPrincipal.Dificultad == 2){
            if(PiezasColocadasB < PiezasxColocar/2){
                TableroVisual.TableroFondo.ColocarBuenosPlayer12x2(Integer.parseInt(jTextFieldFila.getText()), Integer.parseInt(jTextFieldFila.getText()));
                PiezasColocadasB ++;
                ActualizarPColocadas();
            }else{
                jLabel1.setText("Maximo de ese Tipo.");
            }
        }
        ValidarContinuacion();
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        //Valida Dificultad.
        if(GhostsMenuPrincipal.Dificultad == 0){
            if(PiezasColocadasM < PiezasxColocar/2){
                TableroVisual.TableroFondo.ColocarMalosPlayer18x8(Integer.parseInt(jTextFieldFila.getText()), Integer.parseInt(jTextFieldFila.getText()));
                PiezasColocadasM ++;
                ActualizarPColocadas();
            }else{
                jLabel1.setText("Maximo de ese Tipo.");
            }
        }else if(GhostsMenuPrincipal.Dificultad == 1){
            if(PiezasColocadasM < PiezasxColocar/2){
                TableroVisual.TableroFondo.ColocarMalosPlayer14x4(Integer.parseInt(jTextFieldFila.getText()), Integer.parseInt(jTextFieldFila.getText()));
                PiezasColocadasM ++;
                ActualizarPColocadas();
            }else{
                jLabel1.setText("Maximo de ese Tipo.");
            }
        }else if(GhostsMenuPrincipal.Dificultad == 2){
            if(PiezasColocadasM < PiezasxColocar/2){
                TableroVisual.TableroFondo.ColocarMalosPlayer12x2(Integer.parseInt(jTextFieldFila.getText()), Integer.parseInt(jTextFieldFila.getText()));
                PiezasColocadasM ++;
                ActualizarPColocadas();
            }else{
                jLabel1.setText("Maximo de ese Tipo.");
            }
        }
        ValidarContinuacion();
    }//GEN-LAST:event_jButton2MousePressed

    private void ValidarContinuacion(){
        if(PiezasColocadas == PiezasxColocar){
            this.setVisible(false);
        }else{
            
        }
    }
    
    private void ActualizarPColocadas(){
        jLabelColocadas.setText("" + PiezasColocadas);
    }
    
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
            java.util.logging.Logger.getLogger(ColocarPlayer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColocarPlayer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColocarPlayer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColocarPlayer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColocarPlayer1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelColocadas;
    private javax.swing.JLabel jLabelDisponibles;
    private javax.swing.JLabel jLabelPos01;
    private javax.swing.JLabel jLabelPos02;
    private javax.swing.JLabel jLabelPos03;
    private javax.swing.JLabel jLabelPos04;
    private javax.swing.JLabel jLabelPos11;
    private javax.swing.JLabel jLabelPos12;
    private javax.swing.JLabel jLabelPos13;
    private javax.swing.JLabel jLabelPos14;
    private javax.swing.JTextField jTextFieldColumna;
    private javax.swing.JTextField jTextFieldFila;
    // End of variables declaration//GEN-END:variables
}
