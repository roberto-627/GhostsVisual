package ghostsvisual;

/*
 * @Author Roberto Melara
 */

//Importar Button Group.
import javax.swing.ButtonGroup;

public class TableroVisual extends javax.swing.JFrame {
    //Marcadores de posicion.
    public static int fila = 0;
    public static int columna =0;
    public static Tablero TableroFondo = new Tablero();
    //Contador de turnos.
    public static int turno = 0;
    //Motivo de ganador.
    public static String Razon;
    //Contadores de Fantasmas
    int GBP1 = 0;
    int GBP2 = 0;
    int GMP1 = 0;
    int GMP2 = 0;
    //Puntos por esta partida.
    int PPP1 = 0;
    int PPP2 = 0;
    //Contador de piezas a colocar.
    public static int PiezasxColocar;

    public TableroVisual() {
        initComponents();
        //Agrupar botones.
        GroupButton();
        
        //Setup del juego dependiendo de la dificultad y el modo de juego.
        //Modos de Juego Aleatorios.
        if(GhostsMenuPrincipal.Dificultad == 0 && GhostsMenuPrincipal.ModoDeJuego == 0){
            TableroFondo.SortearGhostsPlayer18x8();
            TableroFondo.SortearGhostsPlayer28x8();
            TableroFondo.PrintTablero();
        }else if(GhostsMenuPrincipal.Dificultad == 1 && GhostsMenuPrincipal.ModoDeJuego == 0){
            TableroFondo.SortearGhostsPlayer14x4();
            TableroFondo.SortearGhostsPlayer24x4();
            TableroFondo.PrintTablero();
        }else if(GhostsMenuPrincipal.Dificultad == 2 && GhostsMenuPrincipal.ModoDeJuego == 0){
            TableroFondo.SortearGhostsPlayer12x2();
            TableroFondo.SortearGhostsPlayer22x2();
            TableroFondo.PrintTablero();
        }else{
            ColocarPlayer1 colocar = new ColocarPlayer1();
            colocar.setVisible(true);
        }
        ActualizarTablero();
        ActualizarTableroLateral();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpcionesDeMovimiento = new javax.swing.ButtonGroup();
        jLabelPos00 = new javax.swing.JLabel();
        jLabelPos01 = new javax.swing.JLabel();
        jLabelPos02 = new javax.swing.JLabel();
        jLabelPos03 = new javax.swing.JLabel();
        jLabelPos04 = new javax.swing.JLabel();
        jLabelPos05 = new javax.swing.JLabel();
        jLabelPos10 = new javax.swing.JLabel();
        jLabelPos11 = new javax.swing.JLabel();
        jLabelPos12 = new javax.swing.JLabel();
        jLabelPos13 = new javax.swing.JLabel();
        jLabelPos14 = new javax.swing.JLabel();
        jLabelPos15 = new javax.swing.JLabel();
        jLabelPos20 = new javax.swing.JLabel();
        jLabelPos21 = new javax.swing.JLabel();
        jLabelPos22 = new javax.swing.JLabel();
        jLabelPos23 = new javax.swing.JLabel();
        jLabelPos24 = new javax.swing.JLabel();
        jLabelPos25 = new javax.swing.JLabel();
        jLabelPos30 = new javax.swing.JLabel();
        jLabelPos31 = new javax.swing.JLabel();
        jLabelPos32 = new javax.swing.JLabel();
        jLabelPos33 = new javax.swing.JLabel();
        jLabelPos34 = new javax.swing.JLabel();
        jLabelPos35 = new javax.swing.JLabel();
        jLabelPos40 = new javax.swing.JLabel();
        jLabelPos41 = new javax.swing.JLabel();
        jLabelPos42 = new javax.swing.JLabel();
        jLabelPos43 = new javax.swing.JLabel();
        jLabelPos44 = new javax.swing.JLabel();
        jLabelPos45 = new javax.swing.JLabel();
        jLabelPos50 = new javax.swing.JLabel();
        jLabelPos51 = new javax.swing.JLabel();
        jLabelPos52 = new javax.swing.JLabel();
        jLabelPos53 = new javax.swing.JLabel();
        jLabelPos54 = new javax.swing.JLabel();
        jLabelPos55 = new javax.swing.JLabel();
        jLabelVisualizacion = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButtonMover = new javax.swing.JButton();
        jLabelAdvertencia = new javax.swing.JLabel();
        jLabelTurnoDe = new javax.swing.JLabel();
        jLabelTurno = new javax.swing.JLabel();
        jLabelPlayer1 = new javax.swing.JLabel();
        jLabelGhostBueno = new javax.swing.JLabel();
        jLabelGhostMalo = new javax.swing.JLabel();
        jLabelPlayer2 = new javax.swing.JLabel();
        jLabelGhostMalo2 = new javax.swing.JLabel();
        jLabelGhostBueno2 = new javax.swing.JLabel();
        jLabelCantGhostsMalosPlayer1 = new javax.swing.JLabel();
        jLabelAbandonar = new javax.swing.JLabel();
        jLabelCantGhostsBuenosPlayer2 = new javax.swing.JLabel();
        jLabelCantGhostsBuenosPlayer1 = new javax.swing.JLabel();
        jLabelCantGhostsMalosPlayer2 = new javax.swing.JLabel();
        jLabelTablero = new javax.swing.JLabel();
        jLabelLateralTablero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setMaximumSize(new java.awt.Dimension(1080, 728));
        setMinimumSize(new java.awt.Dimension(1080, 728));
        setPreferredSize(new java.awt.Dimension(1080, 728));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelPos00.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos00.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos00.setText("0,0");
        jLabelPos00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos00MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos00);
        jLabelPos00.setBounds(70, 50, 90, 90);

        jLabelPos01.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos01.setText("0,1");
        jLabelPos01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos01MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos01);
        jLabelPos01.setBounds(170, 50, 90, 90);

        jLabelPos02.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos02.setText("0,2");
        jLabelPos02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos02MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos02);
        jLabelPos02.setBounds(270, 50, 90, 90);

        jLabelPos03.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos03.setText("0,3");
        jLabelPos03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos03MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos03);
        jLabelPos03.setBounds(380, 50, 80, 90);

        jLabelPos04.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos04.setText("0,4");
        jLabelPos04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos04MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos04);
        jLabelPos04.setBounds(480, 50, 80, 90);

        jLabelPos05.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos05.setText("0,5");
        jLabelPos05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos05MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos05);
        jLabelPos05.setBounds(580, 50, 90, 90);

        jLabelPos10.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos10.setText("1,0");
        jLabelPos10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos10MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos10);
        jLabelPos10.setBounds(60, 150, 100, 100);

        jLabelPos11.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos11.setText("1,1");
        jLabelPos11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos11MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos11);
        jLabelPos11.setBounds(166, 154, 100, 90);

        jLabelPos12.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos12.setText("1,2");
        jLabelPos12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos12MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos12);
        jLabelPos12.setBounds(276, 154, 90, 90);

        jLabelPos13.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos13.setText("1,3");
        jLabelPos13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos13MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos13);
        jLabelPos13.setBounds(376, 154, 90, 90);

        jLabelPos14.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos14.setText("1,4");
        jLabelPos14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos14MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos14);
        jLabelPos14.setBounds(476, 154, 90, 90);

        jLabelPos15.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos15.setText("1,5");
        jLabelPos15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos15MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos15);
        jLabelPos15.setBounds(576, 154, 90, 90);

        jLabelPos20.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos20.setText("2,0");
        jLabelPos20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos20MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos20);
        jLabelPos20.setBounds(66, 254, 90, 90);

        jLabelPos21.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos21.setText("2,1");
        jLabelPos21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos21MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos21);
        jLabelPos21.setBounds(166, 254, 100, 90);

        jLabelPos22.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos22.setText("2,2");
        jLabelPos22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos22MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos22);
        jLabelPos22.setBounds(270, 254, 90, 90);

        jLabelPos23.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos23.setText("2,3");
        jLabelPos23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos23MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos23);
        jLabelPos23.setBounds(376, 254, 90, 90);

        jLabelPos24.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos24.setText("2,4");
        jLabelPos24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos24MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos24);
        jLabelPos24.setBounds(476, 254, 90, 90);

        jLabelPos25.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos25.setText("2,5");
        jLabelPos25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos25MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos25);
        jLabelPos25.setBounds(576, 254, 100, 90);

        jLabelPos30.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos30.setText("3,0");
        jLabelPos30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos30MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos30);
        jLabelPos30.setBounds(66, 354, 100, 100);

        jLabelPos31.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos31.setText("3,1");
        jLabelPos31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos31MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos31);
        jLabelPos31.setBounds(166, 354, 90, 100);

        jLabelPos32.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos32.setText("3,2");
        jLabelPos32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos32MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos32);
        jLabelPos32.setBounds(266, 354, 100, 100);

        jLabelPos33.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos33.setText("3,3");
        jLabelPos33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos33MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos33);
        jLabelPos33.setBounds(376, 354, 90, 100);

        jLabelPos34.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos34.setText("3,4");
        jLabelPos34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos34MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos34);
        jLabelPos34.setBounds(476, 354, 90, 90);

        jLabelPos35.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos35.setText("3,5");
        jLabelPos35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos35MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos35);
        jLabelPos35.setBounds(576, 354, 100, 100);

        jLabelPos40.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos40.setText("4,0");
        jLabelPos40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos40MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos40);
        jLabelPos40.setBounds(66, 454, 100, 100);

        jLabelPos41.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos41.setText("4,1");
        jLabelPos41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos41MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos41);
        jLabelPos41.setBounds(166, 454, 100, 100);

        jLabelPos42.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos42.setText("4,2");
        jLabelPos42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos42MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos42);
        jLabelPos42.setBounds(266, 454, 100, 100);

        jLabelPos43.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos43.setText("4,3");
        jLabelPos43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos43MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos43);
        jLabelPos43.setBounds(366, 454, 100, 100);

        jLabelPos44.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos44.setText("4,4");
        jLabelPos44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos44MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos44);
        jLabelPos44.setBounds(476, 454, 90, 100);

        jLabelPos45.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos45.setText("4,5");
        jLabelPos45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos45MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos45);
        jLabelPos45.setBounds(576, 454, 100, 100);

        jLabelPos50.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos50.setText("5,0");
        jLabelPos50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos50MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos50);
        jLabelPos50.setBounds(66, 554, 100, 100);

        jLabelPos51.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos51.setText("5,1");
        jLabelPos51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos51MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos51);
        jLabelPos51.setBounds(166, 564, 90, 90);

        jLabelPos52.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos52.setText("5,2");
        jLabelPos52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos52MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos52);
        jLabelPos52.setBounds(266, 564, 100, 90);

        jLabelPos53.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos53.setText("5,3");
        jLabelPos53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos53MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos53);
        jLabelPos53.setBounds(376, 564, 90, 90);

        jLabelPos54.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos54.setText("5,4");
        jLabelPos54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos54MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos54);
        jLabelPos54.setBounds(476, 564, 90, 90);

        jLabelPos55.setForeground(new java.awt.Color(250, 255, 68));
        jLabelPos55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPos55.setText("5.5");
        jLabelPos55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPos55MousePressed(evt);
            }
        });
        getContentPane().add(jLabelPos55);
        jLabelPos55.setBounds(576, 564, 90, 90);

        jLabelVisualizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVisualizacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 255, 68)));
        getContentPane().add(jLabelVisualizacion);
        jLabelVisualizacion.setBounds(890, 460, 70, 80);

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setForeground(new java.awt.Color(251, 255, 68));
        jRadioButton1.setText("Arriba");
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(890, 420, 70, 23);

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setForeground(new java.awt.Color(251, 255, 68));
        jRadioButton2.setText("Abajo");
        jRadioButton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(890, 560, 70, 20);

        jRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setForeground(new java.awt.Color(251, 255, 68));
        jRadioButton3.setText("Derecha");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(980, 490, 80, 23);

        jRadioButton4.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton4.setForeground(new java.awt.Color(251, 255, 68));
        jRadioButton4.setText("Izquierda");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(790, 490, 80, 23);

        jButtonMover.setBackground(new java.awt.Color(0, 0, 0));
        jButtonMover.setForeground(new java.awt.Color(251, 255, 68));
        jButtonMover.setText("Mover");
        jButtonMover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonMoverMousePressed(evt);
            }
        });
        getContentPane().add(jButtonMover);
        jButtonMover.setBounds(890, 600, 80, 23);

        jLabelAdvertencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAdvertencia.setForeground(new java.awt.Color(251, 255, 68));
        jLabelAdvertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelAdvertencia);
        jLabelAdvertencia.setBounds(840, 640, 180, 0);

        jLabelTurnoDe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTurnoDe.setForeground(new java.awt.Color(251, 255, 68));
        jLabelTurnoDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTurnoDe.setText("Turno:");
        getContentPane().add(jLabelTurnoDe);
        jLabelTurnoDe.setBounds(890, 210, 60, 17);

        jLabelTurno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTurno.setForeground(new java.awt.Color(251, 255, 68));
        jLabelTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTurno.setText("-");
        getContentPane().add(jLabelTurno);
        jLabelTurno.setBounds(870, 230, 100, 17);

        jLabelPlayer1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPlayer1.setForeground(new java.awt.Color(251, 255, 68));
        jLabelPlayer1.setText("Player1");
        getContentPane().add(jLabelPlayer1);
        jLabelPlayer1.setBounds(770, 300, 50, 17);

        jLabelGhostBueno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelGhostBueno.setForeground(new java.awt.Color(251, 255, 68));
        jLabelGhostBueno.setText("Ghosts Buenos: ");
        getContentPane().add(jLabelGhostBueno);
        jLabelGhostBueno.setBounds(770, 330, 100, 17);

        jLabelGhostMalo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelGhostMalo.setForeground(new java.awt.Color(251, 255, 68));
        jLabelGhostMalo.setText("Ghosts Malos: ");
        getContentPane().add(jLabelGhostMalo);
        jLabelGhostMalo.setBounds(770, 350, 100, 17);

        jLabelPlayer2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPlayer2.setForeground(new java.awt.Color(251, 255, 68));
        jLabelPlayer2.setText("Player2");
        getContentPane().add(jLabelPlayer2);
        jLabelPlayer2.setBounds(930, 300, 50, 17);

        jLabelGhostMalo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelGhostMalo2.setForeground(new java.awt.Color(251, 255, 68));
        jLabelGhostMalo2.setText("Ghosts Malos: ");
        getContentPane().add(jLabelGhostMalo2);
        jLabelGhostMalo2.setBounds(930, 350, 90, 17);

        jLabelGhostBueno2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelGhostBueno2.setForeground(new java.awt.Color(251, 255, 68));
        jLabelGhostBueno2.setText("GhostsBuenos: ");
        getContentPane().add(jLabelGhostBueno2);
        jLabelGhostBueno2.setBounds(930, 330, 96, 17);

        jLabelCantGhostsMalosPlayer1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCantGhostsMalosPlayer1.setForeground(new java.awt.Color(251, 255, 68));
        jLabelCantGhostsMalosPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantGhostsMalosPlayer1.setText("0");
        getContentPane().add(jLabelCantGhostsMalosPlayer1);
        jLabelCantGhostsMalosPlayer1.setBounds(870, 350, 20, 17);

        jLabelAbandonar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAbandonar.setForeground(new java.awt.Color(251, 255, 68));
        jLabelAbandonar.setText("ABANDONAR!");
        jLabelAbandonar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAbandonarMousePressed(evt);
            }
        });
        getContentPane().add(jLabelAbandonar);
        jLabelAbandonar.setBounds(958, 660, 83, 17);

        jLabelCantGhostsBuenosPlayer2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCantGhostsBuenosPlayer2.setForeground(new java.awt.Color(251, 255, 68));
        jLabelCantGhostsBuenosPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantGhostsBuenosPlayer2.setText("0");
        getContentPane().add(jLabelCantGhostsBuenosPlayer2);
        jLabelCantGhostsBuenosPlayer2.setBounds(1030, 330, 20, 17);

        jLabelCantGhostsBuenosPlayer1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCantGhostsBuenosPlayer1.setForeground(new java.awt.Color(251, 255, 68));
        jLabelCantGhostsBuenosPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantGhostsBuenosPlayer1.setText("0");
        getContentPane().add(jLabelCantGhostsBuenosPlayer1);
        jLabelCantGhostsBuenosPlayer1.setBounds(870, 330, 20, 17);

        jLabelCantGhostsMalosPlayer2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCantGhostsMalosPlayer2.setForeground(new java.awt.Color(251, 255, 68));
        jLabelCantGhostsMalosPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantGhostsMalosPlayer2.setText("0");
        getContentPane().add(jLabelCantGhostsMalosPlayer2);
        jLabelCantGhostsMalosPlayer2.setBounds(1030, 350, 20, 17);

        jLabelTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Tablero.png"))); // NOI18N
        getContentPane().add(jLabelTablero);
        jLabelTablero.setBounds(0, 0, 736, 700);

        jLabelLateralTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ghostsvisual/Lateral Tablero.png"))); // NOI18N
        getContentPane().add(jLabelLateralTablero);
        jLabelLateralTablero.setBounds(730, 0, 350, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelPos00MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos00MousePressed
        // Asignar fila y columna.
        fila = 0;
        columna =0;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos00MousePressed

    private void jLabelPos01MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos01MousePressed
        // Asignar fila y columna.
        fila = 0;
        columna =1;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos01MousePressed

    private void jLabelPos02MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos02MousePressed
        // Asignar fila y columna.
        fila = 0;
        columna =2;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos02MousePressed

    private void jLabelPos03MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos03MousePressed
        // Asignar fila y columna.
        fila = 0;
        columna =3;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos03MousePressed

    private void jLabelPos04MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos04MousePressed
        // Asignar fila y columna.
        fila = 0;
        columna =4;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos04MousePressed

    private void jLabelPos05MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos05MousePressed
        // Asignar fila y columna.
        fila = 0;
        columna =5;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos05MousePressed

    private void jLabelPos10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos10MousePressed
        // Asignar fila y columna.
        fila = 1;
        columna =0;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos10MousePressed

    private void jLabelPos11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos11MousePressed
        // Asignar fila y columna.
        fila = 1;
        columna =1;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos11MousePressed

    private void jLabelPos12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos12MousePressed
        // Asignar fila y columna.
        fila = 1;
        columna =2;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos12MousePressed

    private void jLabelPos13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos13MousePressed
        // Asignar fila y columna.
        fila = 1;
        columna =3;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos13MousePressed

    private void jLabelPos14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos14MousePressed
        // Asignar fila y columna.
        fila = 1;
        columna =4;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos14MousePressed

    private void jLabelPos15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos15MousePressed
        // Asignar fila y columna.
        fila = 1;
        columna =5;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos15MousePressed

    private void jLabelPos20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos20MousePressed
        // Asignar fila y columna.
        fila = 2;
        columna =0;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos20MousePressed

    private void jLabelPos21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos21MousePressed
        // Asignar fila y columna.
        fila = 2;
        columna =1;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos21MousePressed

    private void jLabelPos22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos22MousePressed
        // Asignar fila y columna.
        fila = 2;
        columna =2;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos22MousePressed

    private void jLabelPos23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos23MousePressed
        // Asignar fila y columna.
        fila = 2;
        columna =3;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos23MousePressed

    private void jLabelPos24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos24MousePressed
        // Asignar fila y columna.
        fila = 2;
        columna =4;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos24MousePressed

    private void jLabelPos25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos25MousePressed
        // Asignar fila y columna.
        fila = 2;
        columna =5;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos25MousePressed

    private void jLabelPos30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos30MousePressed
        // Asignar fila y columna.
        fila = 3;
        columna =0;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos30MousePressed

    private void jLabelPos31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos31MousePressed
        // Asignar fila y columna.
        fila = 3;
        columna =1;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos31MousePressed

    private void jLabelPos32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos32MousePressed
        // Asignar fila y columna.
        fila = 3;
        columna =2;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos32MousePressed

    private void jLabelPos33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos33MousePressed
        // Asignar fila y columna.
        fila = 3;
        columna =3;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos33MousePressed

    private void jLabelPos34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos34MousePressed
        // Asignar fila y columna.
        fila = 3;
        columna =4;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos34MousePressed

    private void jLabelPos35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos35MousePressed
        // Asignar fila y columna.
        fila = 3;
        columna =5;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos35MousePressed

    private void jLabelPos40MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos40MousePressed
        // Asignar fila y columna.
        fila = 4;
        columna =0;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos40MousePressed

    private void jLabelPos41MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos41MousePressed
        // Asignar fila y columna.
        fila = 4;
        columna =1;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos41MousePressed

    private void jLabelPos42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos42MousePressed
        // Asignar fila y columna.
        fila = 4;
        columna =2;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos42MousePressed

    private void jLabelPos43MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos43MousePressed
        // Asignar fila y columna.
        fila = 4;
        columna =3;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos43MousePressed

    private void jLabelPos44MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos44MousePressed
        // Asignar fila y columna.
        fila = 4;
        columna =4;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos44MousePressed

    private void jLabelPos45MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos45MousePressed
        // Asignar fila y columna.
        fila = 4;
        columna =5;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos45MousePressed

    private void jLabelPos50MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos50MousePressed
        // Asignar fila y columna.
        fila = 5;
        columna =0;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos50MousePressed

    private void jLabelPos51MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos51MousePressed
        // Asignar fila y columna.
        fila = 5;
        columna =1;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos51MousePressed

    private void jLabelPos52MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos52MousePressed
        // Asignar fila y columna.
        fila = 5;
        columna =2;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos52MousePressed

    private void jLabelPos53MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos53MousePressed
        // Asignar fila y columna.
        fila = 5;
        columna =3;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos53MousePressed

    private void jLabelPos54MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos54MousePressed
        // Asignar fila y columna.
        fila = 5;
        columna =4;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos54MousePressed

    private void jLabelPos55MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPos55MousePressed
        // Asignar fila y columna.
        fila = 5;
        columna =5;
        //Visualizacion Previa de Pieza.
        if(Tablero.tablero[fila][columna]==0){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[fila][columna]==1 || Tablero.tablero[fila][columna]==2){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[fila][columna]==3 || Tablero.tablero[fila][columna]==4){
            jLabelVisualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }//GEN-LAST:event_jLabelPos55MousePressed

    //Funcion para mover piezas en el tablero.
    //Se imprime para que se vea lo que esta sucediendo(No para que lo vea el usuario.)
    private void jButtonMoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMoverMousePressed
        //Determina la validez de el turno y de el movimiento.
        if(turno%2 == 0){
            if(jRadioButton1.isSelected()){
            TableroFondo.MoverArribaPlayer1(fila, columna);
            turno ++;
            ActualizarTablero();
            ActualizarTableroLateral();
            DeterminarSiHayGanador();
            TableroFondo.PrintTablero();
          }else if(jRadioButton2.isSelected()){
            TableroFondo.MoverAbajoPlayer1(fila, columna);
            turno ++;
            ActualizarTablero();
            ActualizarTableroLateral();
            DeterminarSiHayGanador();
            TableroFondo.PrintTablero();
          }else if(jRadioButton3.isSelected()){
            TableroFondo.MoverDerechaPlayer1(fila, columna);
            turno ++;
            ActualizarTablero();
            ActualizarTableroLateral();
            DeterminarSiHayGanador();
            TableroFondo.PrintTablero();
          }else if(jRadioButton4.isSelected()){
            TableroFondo.MoverIzquierdaPlayer1(fila, columna);
            turno ++;
            ActualizarTablero();
            ActualizarTableroLateral();
            DeterminarSiHayGanador();
            TableroFondo.PrintTablero();
          }
        }else if(turno%2 != 0){
           if(jRadioButton1.isSelected()){
            TableroFondo.MoverArribaPlayer2(fila, columna);
            turno ++;
            ActualizarTablero();
            ActualizarTableroLateral();
            DeterminarSiHayGanador();
            TableroFondo.PrintTablero();
          }else if(jRadioButton2.isSelected()){
            TableroFondo.MoverAbajoPlayer2(fila, columna);
            turno ++;
            ActualizarTablero();
            ActualizarTableroLateral();
            DeterminarSiHayGanador();
            TableroFondo.PrintTablero();
          }else if(jRadioButton3.isSelected()){
            TableroFondo.MoverDerechaPlayer2(fila, columna);
            turno ++;
            ActualizarTablero();
            ActualizarTableroLateral();
            DeterminarSiHayGanador();
            TableroFondo.PrintTablero();
          }else if(jRadioButton4.isSelected()){
            TableroFondo.MoverIzquierdaPlayer2(fila, columna);
            turno ++;
            ActualizarTablero();
            ActualizarTableroLateral();
            DeterminarSiHayGanador();
            TableroFondo.PrintTablero();
          } 
        }
    }//GEN-LAST:event_jButtonMoverMousePressed

    //Abandonar Partida.
    private void jLabelAbandonarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAbandonarMousePressed
        //Determina en que turno se abandono el jeugo.
        if(turno%2==0){
            for(int c =0; c<=9; c++){
                if(Player.usuarios[Player.posuser1].ult10[c] == null){
                    Player.usuarios[Player.posuser1].ult10[c] = "Perdida";
                    break;
                }
            }
            for(int c =0; c<=9; c++){
                if(Player.usuarios[Player.posuser2].ult10[c] == null){
                    Player.usuarios[Player.posuser2].ult10[c] = "Ganada";
                    break;
                }
            }
            Player.usuarios[Player.posuser1].puntos =  Player.usuarios[Player.posuser1].puntos + PPP1;
            Player.usuarios[Player.posuser2].puntos =  Player.usuarios[Player.posuser2].puntos + PPP2;
            Player.usuarios[Player.posuser2].puntos =  Player.usuarios[Player.posuser2].puntos + 100;
        }else{
            for(int c =0; c<=9; c++){
                if(Player.usuarios[Player.posuser2].ult10[c] == null){
                    Player.usuarios[Player.posuser2].ult10[c] = "Perdida";
                    break;
                }     
            }
            for(int c =0; c<=9; c++){
                if(Player.usuarios[Player.posuser1].ult10[c] == null){
                    Player.usuarios[Player.posuser1].ult10[c] = "Ganada";
                    break;
                }
            }
            Player.usuarios[Player.posuser1].puntos =  Player.usuarios[Player.posuser1].puntos + PPP1;
            Player.usuarios[Player.posuser2].puntos =  Player.usuarios[Player.posuser2].puntos + PPP2;
            Player.usuarios[Player.posuser1].puntos =  Player.usuarios[Player.posuser1].puntos + 100;
        }
        //Regresar al Menu Principal.
        GhostsMenuPrincipal abrir = new GhostsMenuPrincipal();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelAbandonarMousePressed
    
    //Incluir botones en Grupo.
    private void GroupButton(){
      ButtonGroup bg1 = new ButtonGroup();
      bg1.add(jRadioButton1);
      bg1.add(jRadioButton2);
      bg1.add(jRadioButton3);
      bg1.add(jRadioButton4);
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
            java.util.logging.Logger.getLogger(TableroVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableroVisual().setVisible(true);
            }
        });
    }
    
    //Funcion para actualizar el tablero luego de cada movimiento.
    //Harcodeada Fea.
    private void ActualizarTablero(){
        //Actualizar Tablero para player 1.
        if(Tablero.tablero[0][0] == 0){
           jLabelPos00.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[0][0] == 1){
           jLabelPos00.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[0][0] == 2){
           jLabelPos00.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[0][1] == 0){
           jLabelPos01.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[0][1] == 1){
           jLabelPos01.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[0][1] == 2){
           jLabelPos01.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[0][2] == 0){
           jLabelPos02.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[0][2] == 1){
           jLabelPos02.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[0][2] == 2){
           jLabelPos02.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[0][3] == 0){
           jLabelPos03.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[0][3] == 1){
           jLabelPos03.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[0][3] == 2){
           jLabelPos03.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[0][4] == 0){
           jLabelPos04.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[0][4] == 1){
           jLabelPos04.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[0][4] == 2){
           jLabelPos04.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[0][5] == 0){
           jLabelPos05.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[0][5] == 1){
           jLabelPos05.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[0][5] == 2){
           jLabelPos05.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        //F1.
        if(Tablero.tablero[1][0] == 0){
           jLabelPos10.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[1][0] == 1){
           jLabelPos10.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[1][0] == 2){
           jLabelPos10.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[1][1] == 0){
           jLabelPos11.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[1][1] == 1){
           jLabelPos11.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[1][1] == 2){
           jLabelPos11.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[1][2] == 0){
           jLabelPos12.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[1][2] == 1){
           jLabelPos12.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[1][2] == 2){
           jLabelPos12.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[1][3] == 0){
           jLabelPos13.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[1][3] == 1){
           jLabelPos13.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[1][3] == 2){
           jLabelPos13.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[1][4] == 0){
           jLabelPos14.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[1][4] == 1){
           jLabelPos14.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[1][4] == 2){
           jLabelPos14.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[1][5] == 0){
           jLabelPos15.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[1][5] == 1){
           jLabelPos15.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[1][5] == 2){
           jLabelPos15.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        //F2
        if(Tablero.tablero[2][0] == 0){
           jLabelPos20.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[2][0] == 1){
           jLabelPos20.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[2][0] == 2){
           jLabelPos20.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[2][1] == 0){
           jLabelPos21.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[2][1] == 1){
           jLabelPos21.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[2][1] == 2){
           jLabelPos21.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[2][2] == 0){
           jLabelPos22.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[2][2] == 1){
           jLabelPos22.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[2][2] == 2){
           jLabelPos22.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[2][3] == 0){
           jLabelPos23.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[2][3] == 1){
           jLabelPos23.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[2][3] == 2){
           jLabelPos23.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[2][4] == 0){
           jLabelPos24.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[2][4] == 1){
           jLabelPos24.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[2][4] == 2){
           jLabelPos24.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[2][5] == 0){
           jLabelPos25.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[2][5] == 1){
           jLabelPos25.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[2][5] == 2){
           jLabelPos25.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        //F2.
        if(Tablero.tablero[3][0] == 0){
           jLabelPos30.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[3][0] == 1){
           jLabelPos30.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[3][0] == 2){
           jLabelPos30.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[3][1] == 0){
           jLabelPos31.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[3][1] == 1){
           jLabelPos31.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[3][1] == 2){
           jLabelPos31.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[3][2] == 0){
           jLabelPos32.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[3][2] == 1){
           jLabelPos32.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[3][2] == 2){
           jLabelPos32.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[3][3] == 0){
           jLabelPos33.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[3][3] == 1){
           jLabelPos33.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[3][3] == 2){
           jLabelPos33.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[3][4] == 0){
           jLabelPos34.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[3][4] == 1){
           jLabelPos34.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[3][4] == 2){
           jLabelPos34.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[3][5] == 0){
           jLabelPos35.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[3][5] == 1){
           jLabelPos35.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[3][5] == 2){
           jLabelPos35.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[4][0] == 0){
           jLabelPos40.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[4][0] == 1){
           jLabelPos40.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[4][0] == 2){
           jLabelPos40.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[4][1] == 0){
           jLabelPos41.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[4][1] == 1){
           jLabelPos41.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[4][1] == 2){
           jLabelPos41.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[4][2] == 0){
           jLabelPos42.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[4][2] == 1){
           jLabelPos42.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[4][2] == 2){
           jLabelPos42.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[4][3] == 0){
           jLabelPos43.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[4][3] == 1){
           jLabelPos43.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[4][3] == 2){
           jLabelPos43.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[4][4] == 0){
           jLabelPos44.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[4][4] == 1){
           jLabelPos44.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[4][4] == 2){
           jLabelPos44.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[4][5] == 0){
           jLabelPos45.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[4][5] == 1){
           jLabelPos45.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[4][5] == 2){
           jLabelPos45.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        //F1.
        if(Tablero.tablero[5][0] == 0){
           jLabelPos50.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[5][0] == 1){
           jLabelPos50.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[5][0] == 2){
           jLabelPos50.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[5][1] == 0){
           jLabelPos51.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[5][1] == 1){
           jLabelPos51.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[5][1] == 2){
           jLabelPos51.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[5][2] == 0){
           jLabelPos52.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[5][2] == 1){
           jLabelPos52.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[5][2] == 2){
           jLabelPos52.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[5][3] == 0){
           jLabelPos53.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[5][3] == 1){
           jLabelPos53.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[5][3] == 2){
           jLabelPos53.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[5][4] == 0){
           jLabelPos54.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[5][4] == 1){
           jLabelPos54.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[5][4] == 2){
           jLabelPos54.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        if(Tablero.tablero[5][5] == 0){
           jLabelPos55.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[5][5] == 1){
           jLabelPos55.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }else if(Tablero.tablero[5][5] == 2){
           jLabelPos55.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer1.png")));
        }
        //Actualizar Tablero para player 2.
        if(Tablero.tablero[0][0] == 0){
           jLabelPos00.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[0][0] == 3){
           jLabelPos00.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[0][0] == 4){
           jLabelPos00.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[0][1] == 0){
           jLabelPos01.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[0][1] == 3){
           jLabelPos01.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[0][1] == 4){
           jLabelPos01.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[0][2] == 0){
           jLabelPos02.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[0][2] == 3){
           jLabelPos02.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[0][2] == 4){
           jLabelPos02.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[0][3] == 0){
           jLabelPos03.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[0][3] == 3){
           jLabelPos03.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[0][3] == 4){
           jLabelPos03.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[0][4] == 0){
           jLabelPos04.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[0][4] == 3){
           jLabelPos04.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[0][4] == 4){
           jLabelPos04.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[0][5] == 0){
           jLabelPos05.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[0][5] == 3){
           jLabelPos05.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[0][5] == 4){
           jLabelPos05.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        //F1.
        if(Tablero.tablero[1][0] == 0){
           jLabelPos10.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[1][0] == 3){
           jLabelPos10.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[1][0] == 4){
           jLabelPos10.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[1][1] == 0){
           jLabelPos11.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[1][1] == 3){
           jLabelPos11.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[1][1] == 4){
           jLabelPos11.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[1][2] == 0){
           jLabelPos12.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[1][2] == 3){
           jLabelPos12.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[1][2] == 4){
           jLabelPos12.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[1][3] == 0){
           jLabelPos13.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[1][3] == 3){
           jLabelPos13.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[1][3] == 4){
           jLabelPos13.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[1][4] == 0){
           jLabelPos14.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[1][4] == 3){
           jLabelPos14.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[1][4] == 4){
           jLabelPos14.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[1][5] == 0){
           jLabelPos15.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[1][5] == 3){
           jLabelPos15.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[1][5] == 4){
           jLabelPos15.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        //F2
        if(Tablero.tablero[2][0] == 0){
           jLabelPos20.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[2][0] == 3){
           jLabelPos20.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[2][0] == 4){
           jLabelPos20.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[2][1] == 0){
           jLabelPos21.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[2][1] == 3){
           jLabelPos21.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[2][1] == 4){
           jLabelPos21.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[2][2] == 0){
           jLabelPos22.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[2][2] == 3){
           jLabelPos22.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[2][2] == 4){
           jLabelPos22.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[2][3] == 0){
           jLabelPos23.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[2][3] == 3){
           jLabelPos23.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[2][3] == 4){
           jLabelPos23.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[2][4] == 0){
           jLabelPos24.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[2][4] == 3){
           jLabelPos24.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[2][4] == 4){
           jLabelPos24.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[2][5] == 0){
           jLabelPos25.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[2][5] == 3){
           jLabelPos25.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[2][5] == 4){
           jLabelPos25.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        //F2.
        if(Tablero.tablero[3][0] == 0){
           jLabelPos30.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[3][0] == 3){
           jLabelPos30.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[3][0] == 4){
           jLabelPos30.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[3][1] == 0){
           jLabelPos31.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[3][1] == 3){
           jLabelPos31.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[3][1] == 4){
           jLabelPos31.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[3][2] == 0){
           jLabelPos32.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[3][2] == 3){
           jLabelPos32.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[3][2] == 4){
           jLabelPos32.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[3][3] == 0){
           jLabelPos33.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[3][3] == 3){
           jLabelPos33.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[3][3] == 4){
           jLabelPos33.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[3][4] == 0){
           jLabelPos34.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[3][4] == 3){
           jLabelPos34.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[3][4] == 4){
           jLabelPos34.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[3][5] == 0){
           jLabelPos35.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[3][5] == 3){
           jLabelPos35.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[3][5] == 4){
           jLabelPos35.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[4][0] == 0){
           jLabelPos40.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[4][0] == 3){
           jLabelPos40.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[4][0] == 4){
           jLabelPos40.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[4][1] == 0){
           jLabelPos41.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[4][1] == 3){
           jLabelPos41.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[4][1] == 4){
           jLabelPos41.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[4][2] == 0){
           jLabelPos42.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[4][2] == 3){
           jLabelPos42.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[4][2] == 4){
           jLabelPos42.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[4][3] == 0){
           jLabelPos43.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[4][3] == 3){
           jLabelPos43.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[4][3] == 4){
           jLabelPos43.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[4][4] == 0){
           jLabelPos44.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[4][4] == 3){
           jLabelPos44.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[4][4] == 4){
           jLabelPos44.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[4][5] == 0){
           jLabelPos45.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[4][5] == 3){
           jLabelPos45.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[4][5] == 4){
           jLabelPos45.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        //F1.
        if(Tablero.tablero[5][0] == 0){
           jLabelPos50.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[5][0] == 3){
           jLabelPos50.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[5][0] == 4){
           jLabelPos50.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[5][1] == 0){
           jLabelPos51.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[5][1] == 3){
           jLabelPos51.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[5][1] == 4){
           jLabelPos51.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[5][2] == 0){
           jLabelPos52.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[5][2] == 3){
           jLabelPos52.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[5][2] == 4){
           jLabelPos52.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[5][3] == 0){
           jLabelPos53.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[5][3] == 3){
           jLabelPos53.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[5][3] == 4){
           jLabelPos53.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[5][4] == 0){
           jLabelPos54.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azul.png")));
        }else if(Tablero.tablero[5][4] == 3){
           jLabelPos54.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[5][4] == 4){
           jLabelPos54.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
        if(Tablero.tablero[5][5] == 0){
           jLabelPos55.setIcon(new javax.swing.ImageIcon(getClass().getResource("Negro.png")));
        }else if(Tablero.tablero[5][5] == 3){
           jLabelPos55.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }else if(Tablero.tablero[5][5] == 4){
           jLabelPos55.setIcon(new javax.swing.ImageIcon(getClass().getResource("GhostPlayer2.png")));
        }
    }
    
    //Actualiza la cantidad de fantasmas, puntos y turno.
    private void ActualizarTableroLateral(){
        //InicializarContadores.
        GBP1 = 0;
        GBP2 = 0;
        GMP1 = 0;
        GMP2 = 0;
        //Determinar Turno.
        if(turno%2==0){
            jLabelTurno.setText("Player1");
        }else{
            jLabelTurno.setText("Player2");
        }
        
        //Determinar Cant de Ghosts Buenos y malos de cada Player.
        for(int f = 0; f <= 5; f++){
            for(int c =0; c <= 5; c++){
                if(Tablero.tablero[f][c] == 0){
                    //Do nothing.
                }else if(Tablero.tablero[f][c] == 1){
                    GMP1 ++;
                }else if(Tablero.tablero[f][c] == 2){
                    GBP1++;
                }else if(Tablero.tablero[f][c] == 3){
                    GMP2++;
                }else if(Tablero.tablero[f][c] == 4){
                    GBP2++;
                }
            }
        }
        //Asignar las cantidades de fantasmas a los labels.
        jLabelCantGhostsBuenosPlayer1.setText("" + GBP1);
        jLabelCantGhostsBuenosPlayer2.setText("" + GBP2);
        jLabelCantGhostsMalosPlayer1.setText("" + GMP1);
        jLabelCantGhostsMalosPlayer2.setText("" + GMP2);        
    }
    
    //Determina si hay un ganador y porque.
    private void DeterminarSiHayGanador(){
        //Determinar si ha llegado un Ghost Bueno del Player 1 al otro lado.
        if(Tablero.tablero[5][0] == 2 || Tablero.tablero[5][5] == 2){
            for(int c =0; c<=9; c++){
                if(Player.usuarios[Player.posuser1].ult10[c] == null){
                    Player.usuarios[Player.posuser1].ult10[c] = "Ganada";
                }
            }
            for(int c =0; c<=9; c++){
                if(Player.usuarios[Player.posuser2].ult10[c] == null){
                    Player.usuarios[Player.posuser2].ult10[c] = "Perdida";
                }     
            }
            Player.usuarios[Player.posuser1].puntos =  Player.usuarios[Player.posuser1].puntos + 100;
            GanaPlayer1 abrir = new GanaPlayer1();
            abrir.setVisible(true);
            Razon = "Saco Ghost Bueno del Castillo.";
        }else if(Tablero.tablero[0][0] == 4 || Tablero.tablero[0][5] == 4){
            for(int c =0; c<=9; c++){
                if(Player.usuarios[Player.posuser1].ult10[c] == null){
                    Player.usuarios[Player.posuser1].ult10[c] = "Perdida";
                }
            }
            for(int c =0; c<= 9; c++){
                if(Player.usuarios[Player.posuser2].ult10[c] == null){
                    Player.usuarios[Player.posuser2].ult10[c] = "Ganada";
                }     
            }
            Player.usuarios[Player.posuser2].puntos =  Player.usuarios[Player.posuser2].puntos + 100;
            GanaPlayer2 abrir = new GanaPlayer2();
            abrir.setVisible(true);
            Razon = "Saco Ghost Bueno del Castillo.";
        }
        //Determinar si se comio todos los Ghosts Buenos del Otro Lado.
        else if(GBP2 == 0){
            for(int c =0; c<= 9; c++){
                if(Player.usuarios[Player.posuser1].ult10[c] == null){
                    Player.usuarios[Player.posuser1].ult10[c] = "Ganada";
                }
            }
            for(int c =0; c<= 9; c++){
                if(Player.usuarios[Player.posuser2].ult10[c] == null){
                    Player.usuarios[Player.posuser2].ult10[c] = "Perdida";
                }     
            }
            Player.usuarios[Player.posuser1].puntos =  Player.usuarios[Player.posuser1].puntos + 100;
            GanaPlayer1 abrir = new GanaPlayer1();
            abrir.setVisible(true);
            Razon = "Devoro los Ghosts Buenos.";
        }else if(GBP1 == 0){
            for(int c =0; c<= 9; c++){
                if(Player.usuarios[Player.posuser1].ult10[c] == null){
                    Player.usuarios[Player.posuser1].ult10[c] = "Perdida";
                }
            }
            for(int c =0; c<= 9; c++){
                if(Player.usuarios[Player.posuser2].ult10[c] == null){
                    Player.usuarios[Player.posuser2].ult10[c] = "Ganada";
                }     
            }
            Player.usuarios[Player.posuser2].puntos =  Player.usuarios[Player.posuser2].puntos + 100;
            GanaPlayer2 abrir = new GanaPlayer2();
            abrir.setVisible(true);
            Razon = "Devoro los Ghosts Buenos.";
        }
        //Determinar si le comieron todos los fantasmas malos.
        else if(GMP1 == 0){
            for(int c =0; c<= 9; c++){
                if(Player.usuarios[Player.posuser1].ult10[c] == null){
                    Player.usuarios[Player.posuser1].ult10[c] = "Ganada";
                }
            }
            for(int c =0; c<= 9; c++){
                if(Player.usuarios[Player.posuser2].ult10[c] == null){
                    Player.usuarios[Player.posuser2].ult10[c] = "Perdida";
                }     
            }
            Player.usuarios[Player.posuser1].puntos =  Player.usuarios[Player.posuser1].puntos + 100;
            GanaPlayer1 abrir = new GanaPlayer1();
            abrir.setVisible(true);
            Razon = "Le devoraron sus Ghosts Buenos.";
        }else if(GMP2 == 0){
            for(int c =0; c<= 9; c++){
                if(Player.usuarios[Player.posuser1].ult10[c] == null){
                    Player.usuarios[Player.posuser1].ult10[c] = "Perdida";
                }
            }
            for(int c =0; c<= 9; c++){
                if(Player.usuarios[Player.posuser2].ult10[c] == null){
                    Player.usuarios[Player.posuser2].ult10[c] = "Ganada";
                }     
            }
            Player.usuarios[Player.posuser2].puntos =  Player.usuarios[Player.posuser2].puntos + 100;
            GanaPlayer2 abrir = new GanaPlayer2();
            abrir.setVisible(true);
            Razon = "Le devoraron sus Ghosts Buenos.";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup OpcionesDeMovimiento;
    private javax.swing.JButton jButtonMover;
    private javax.swing.JLabel jLabelAbandonar;
    private javax.swing.JLabel jLabelAdvertencia;
    private javax.swing.JLabel jLabelCantGhostsBuenosPlayer1;
    private javax.swing.JLabel jLabelCantGhostsBuenosPlayer2;
    private javax.swing.JLabel jLabelCantGhostsMalosPlayer1;
    private javax.swing.JLabel jLabelCantGhostsMalosPlayer2;
    private javax.swing.JLabel jLabelGhostBueno;
    private javax.swing.JLabel jLabelGhostBueno2;
    private javax.swing.JLabel jLabelGhostMalo;
    private javax.swing.JLabel jLabelGhostMalo2;
    private javax.swing.JLabel jLabelLateralTablero;
    private javax.swing.JLabel jLabelPlayer1;
    private javax.swing.JLabel jLabelPlayer2;
    static javax.swing.JLabel jLabelPos00;
    static javax.swing.JLabel jLabelPos01;
    static javax.swing.JLabel jLabelPos02;
    static javax.swing.JLabel jLabelPos03;
    static javax.swing.JLabel jLabelPos04;
    static javax.swing.JLabel jLabelPos05;
    static javax.swing.JLabel jLabelPos10;
    static javax.swing.JLabel jLabelPos11;
    static javax.swing.JLabel jLabelPos12;
    static javax.swing.JLabel jLabelPos13;
    static javax.swing.JLabel jLabelPos14;
    static javax.swing.JLabel jLabelPos15;
    static javax.swing.JLabel jLabelPos20;
    static javax.swing.JLabel jLabelPos21;
    static javax.swing.JLabel jLabelPos22;
    static javax.swing.JLabel jLabelPos23;
    static javax.swing.JLabel jLabelPos24;
    static javax.swing.JLabel jLabelPos25;
    static javax.swing.JLabel jLabelPos30;
    static javax.swing.JLabel jLabelPos31;
    static javax.swing.JLabel jLabelPos32;
    static javax.swing.JLabel jLabelPos33;
    static javax.swing.JLabel jLabelPos34;
    static javax.swing.JLabel jLabelPos35;
    static javax.swing.JLabel jLabelPos40;
    static javax.swing.JLabel jLabelPos41;
    static javax.swing.JLabel jLabelPos42;
    static javax.swing.JLabel jLabelPos43;
    static javax.swing.JLabel jLabelPos44;
    static javax.swing.JLabel jLabelPos45;
    static javax.swing.JLabel jLabelPos50;
    static javax.swing.JLabel jLabelPos51;
    static javax.swing.JLabel jLabelPos52;
    static javax.swing.JLabel jLabelPos53;
    static javax.swing.JLabel jLabelPos54;
    static javax.swing.JLabel jLabelPos55;
    private javax.swing.JLabel jLabelTablero;
    private javax.swing.JLabel jLabelTurno;
    private javax.swing.JLabel jLabelTurnoDe;
    private static javax.swing.JLabel jLabelVisualizacion;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}