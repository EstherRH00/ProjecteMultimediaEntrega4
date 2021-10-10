package edu_ub_prog2_RuanoEstherTorquetNuria.vista;

import edu.ub.prog2.RuanoEstherTorquetNuria.controlador.Controlador;
import edu.ub.prog2.utils.AplicacioException;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.ListSelectionModel;
import javax.swing.Timer;

/**
 * @author Esther Ruano Hortoneda
 * @author Nuria Torquet Luna 
 * 
 * La classe AplicacioUB conté la lògica del programa. Crea un objecte del tipus 
 * Controlador. Cada botó respon a un mètode la classe Controlador. 
 * AplicacioUB recull la informació per fer les crides pertinents als mètodes de 
 * Controlador. És la classe amb la qual interactua  l'usuari.
 **/

public class AplicacioUB4 extends javax.swing.JFrame {

    /**
     * Atributs de la classe: un controlador per a poder-ne cridar als mètodes 
     * en funció del que sol·liciti l'usuari, una imatge que es fa servir per 
     * il·lustrar els missatges que indiquen com han anat diverses accions i
     * un booleà que permet la comunicació entre FrmAfegirFitxerMultimedia i aquesta
     * classe. La primera n'actualitzarà el valor en funció de si s'ha pogut o no
     * afegir el fitxer amb èxit a la biblioteca, i la segona en mostrara un missatge
     * a l'usuari.
     */
    protected final static ImageIcon IMAGE_INFO = new ImageIcon(AplicacioUB4.class.getResource("/imatges/happy.png"));
    private final Controlador controlador;
    static private boolean addedCorrectly;
        
    
    /**
     * Constructor de la classe. 
     * En primer lloc mostrem durant dos segons la pantalla d'inici de l'aplicacio
     * mitjançant una instancia de la classe PantallaInici.
     * Seguidament cridem al mètode initComponents(), en el que s'inicialitzen 
     * tots els widgets de la GUI. A més, instanciem l'objecte controlador i 
     * actualitzem les JLists i mostren els fitxers de la biblioteca i dels àlbums.
     */
    public AplicacioUB4() {
        //Mostrem la pantalla d'inici
        final PantallaInici dialog = new PantallaInici(this, true);
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
                dialog.dispose();
            }
        });
        timer.setRepeats(false);
        timer.start();
        dialog.setVisible(true); 
        
        //Inicialitzem l'aplicació
        initComponents();
        this.setResizable(false);
        relateImageWithButtons();
        controlador = new Controlador();
        actualitzaTot();
    }

    /**
     * Mètode principal de la classe.
     * En primer lloc inicialitza el look and feel si és possible, seguidament 
     * fa l'objecte AplicacioUB4 visible.
     * @param args
     */
    public  static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplicacioUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicacioUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicacioUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicacioUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AplicacioUB4().setVisible(true);
        });
    }

    
    /**
     * Inicialitza tots els widgets del JFrame.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnAfegirFitxerBiblioteca = new javax.swing.JButton();
        btnEliminarBiblioteca = new javax.swing.JToggleButton();
        etBiblioteca = new javax.swing.JLabel();
        btnReproduirBiblioteca = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        llistaBiblioteca = new javax.swing.JList<>();
        etControlsReproduccio1 = new javax.swing.JLabel();
        btnReproduiFitxer = new javax.swing.JToggleButton();
        btnReproduccioAleatoria = new javax.swing.JToggleButton();
        btnReproduccioCiclica = new javax.swing.JToggleButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnReempren = new javax.swing.JToggleButton();
        btnPausa = new javax.swing.JToggleButton();
        btnAtura = new javax.swing.JToggleButton();
        btnSalta = new javax.swing.JToggleButton();
        etGestioAlbums = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        llistaAlbums = new javax.swing.JList<>();
        btnCrearAlbum = new javax.swing.JButton();
        btnEliminarAlbum = new javax.swing.JButton();
        btnReproduirAlbum = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        llistaFitxersAlbum = new javax.swing.JList<>();
        btnAfegirFitxerAlbum = new javax.swing.JButton();
        btnEliminarFitxerAlbum = new javax.swing.JButton();
        btnReproduirFitxerAlbum = new javax.swing.JButton();
        etGestioAlbumSeleccionat = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        etGuardarDades = new javax.swing.JLabel();
        etCamiGuardar = new javax.swing.JLabel();
        textGuardar = new javax.swing.JTextField();
        btnCercaGuardar = new javax.swing.JToggleButton();
        btnCercaRecuperar = new javax.swing.JToggleButton();
        textCarregar = new javax.swing.JTextField();
        etCamiRecuperar = new javax.swing.JLabel();
        etRecuperar = new javax.swing.JLabel();
        btnAcceptarGuardar = new javax.swing.JToggleButton();
        btnAcceptarRecuperar = new javax.swing.JToggleButton();
        etNomFitxer = new javax.swing.JLabel();
        textNomGuardar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(800, 600));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(738, 498));

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        btnAfegirFitxerBiblioteca.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        btnAfegirFitxerBiblioteca.setText("Afegir arxiu a la Biblioteca");
        btnAfegirFitxerBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfegirFitxerBibliotecaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAfegirFitxerBiblioteca);
        btnAfegirFitxerBiblioteca.setBounds(24, 228, 330, 27);

        btnEliminarBiblioteca.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        btnEliminarBiblioteca.setText("Eliminar fitxer(s) de la Biblioteca");
        btnEliminarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBibliotecaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarBiblioteca);
        btnEliminarBiblioteca.setBounds(24, 262, 330, 27);

        etBiblioteca.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        etBiblioteca.setText("Biblioteca");
        jPanel1.add(etBiblioteca);
        etBiblioteca.setBounds(40, 10, 140, 23);

        btnReproduirBiblioteca.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        btnReproduirBiblioteca.setText("Reproduir la Biblioteca");
        btnReproduirBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproduirBibliotecaActionPerformed(evt);
            }
        });
        jPanel1.add(btnReproduirBiblioteca);
        btnReproduirBiblioteca.setBounds(24, 296, 330, 27);

        llistaBiblioteca.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(llistaBiblioteca);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 40, 292, 178);

        etControlsReproduccio1.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        etControlsReproduccio1.setText("Controls de reproducció:");
        jPanel1.add(etControlsReproduccio1);
        etControlsReproduccio1.setBounds(20, 393, 220, 18);

        btnReproduiFitxer.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        btnReproduiFitxer.setText("Reproduir fitxer seleccionat");
        btnReproduiFitxer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproduiFitxerActionPerformed(evt);
            }
        });
        jPanel1.add(btnReproduiFitxer);
        btnReproduiFitxer.setBounds(24, 330, 330, 27);

        btnReproduccioAleatoria.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        btnReproduccioAleatoria.setText("Reproducció aleatòria");
        btnReproduccioAleatoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproduccioAleatoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnReproduccioAleatoria);
        btnReproduccioAleatoria.setBounds(104, 526, 230, 60);

        btnReproduccioCiclica.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        btnReproduccioCiclica.setText("Reproducció cíclica");
        btnReproduccioCiclica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproduccioCiclicaActionPerformed(evt);
            }
        });
        jPanel1.add(btnReproduccioCiclica);
        btnReproduccioCiclica.setBounds(608, 526, 230, 60);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(0, 375, 945, 12);

        btnReempren.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        btnReempren.setText("Reempren");
        btnReempren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReemprenActionPerformed(evt);
            }
        });
        jPanel1.add(btnReempren);
        btnReempren.setBounds(20, 448, 170, 60);

        btnPausa.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        btnPausa.setText("Pausa");
        btnPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPausa);
        btnPausa.setBounds(252, 448, 170, 60);

        btnAtura.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        btnAtura.setText("Atura");
        btnAtura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtura);
        btnAtura.setBounds(499, 448, 170, 60);

        btnSalta.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        btnSalta.setText("Salta");
        btnSalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaltaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalta);
        btnSalta.setBounds(761, 448, 170, 60);

        etGestioAlbums.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        etGestioAlbums.setText("Gestió dels àlbums");
        jPanel1.add(etGestioAlbums);
        etGestioAlbums.setBounds(420, 20, 250, 18);

        llistaAlbums.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        llistaAlbums.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        llistaAlbums.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                llistaAlbumsMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(llistaAlbums);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(420, 40, 293, 108);

        btnCrearAlbum.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        btnCrearAlbum.setText("Crear àlbum");
        btnCrearAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAlbumActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearAlbum);
        btnCrearAlbum.setBounds(728, 29, 195, 27);

        btnEliminarAlbum.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        btnEliminarAlbum.setText("Eliminar àlbum");
        btnEliminarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAlbumActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarAlbum);
        btnEliminarAlbum.setBounds(727, 73, 196, 27);

        btnReproduirAlbum.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        btnReproduirAlbum.setText("Reproduir àlbum");
        btnReproduirAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproduirAlbumActionPerformed(evt);
            }
        });
        jPanel1.add(btnReproduirAlbum);
        btnReproduirAlbum.setBounds(727, 114, 196, 27);

        llistaFitxersAlbum.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(llistaFitxersAlbum);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(416, 192, 293, 160);

        btnAfegirFitxerAlbum.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        btnAfegirFitxerAlbum.setText("Afegir fitxers a l'àlbum");
        btnAfegirFitxerAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfegirFitxerAlbumActionPerformed(evt);
            }
        });
        jPanel1.add(btnAfegirFitxerAlbum);
        btnAfegirFitxerAlbum.setBounds(727, 200, 190, 23);

        btnEliminarFitxerAlbum.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        btnEliminarFitxerAlbum.setText("Eliminar fitxer de l'àlbum");
        btnEliminarFitxerAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFitxerAlbumActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarFitxerAlbum);
        btnEliminarFitxerAlbum.setBounds(727, 257, 190, 23);

        btnReproduirFitxerAlbum.setFont(new java.awt.Font("Ink Free", 1, 11)); // NOI18N
        btnReproduirFitxerAlbum.setText("Reproduir fitxer de l'àlbum");
        btnReproduirFitxerAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproduirFitxerAlbumActionPerformed(evt);
            }
        });
        jPanel1.add(btnReproduirFitxerAlbum);
        btnReproduirFitxerAlbum.setBounds(727, 308, 190, 23);

        etGestioAlbumSeleccionat.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        etGestioAlbumSeleccionat.setText("Gestió de l'àlbum seleccionat");
        jPanel1.add(etGestioAlbumSeleccionat);
        etGestioAlbumSeleccionat.setBounds(420, 170, 240, 18);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imatges/fusta.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 960, 650);

        jTabbedPane1.addTab("Gestió fitxers", jPanel1);

        jPanel4.setLayout(null);
        jPanel4.add(jSeparator1);
        jSeparator1.setBounds(0, 351, 945, 13);

        etGuardarDades.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        etGuardarDades.setText("Guardar dades");
        jPanel4.add(etGuardarDades);
        etGuardarDades.setBounds(42, 39, 210, 30);

        etCamiGuardar.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        etCamiGuardar.setText("Camí");
        etCamiGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(etCamiGuardar);
        etCamiGuardar.setBounds(60, 100, 50, 23);

        textGuardar.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        jPanel4.add(textGuardar);
        textGuardar.setBounds(156, 100, 440, 30);

        btnCercaGuardar.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        btnCercaGuardar.setText("Cerca");
        btnCercaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(btnCercaGuardar);
        btnCercaGuardar.setBounds(611, 82, 170, 60);

        btnCercaRecuperar.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        btnCercaRecuperar.setText("Cerca");
        btnCercaRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaRecuperarActionPerformed(evt);
            }
        });
        jPanel4.add(btnCercaRecuperar);
        btnCercaRecuperar.setBounds(604, 437, 170, 60);

        textCarregar.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        jPanel4.add(textCarregar);
        textCarregar.setBounds(166, 447, 420, 30);

        etCamiRecuperar.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        etCamiRecuperar.setText("Camí");
        jPanel4.add(etCamiRecuperar);
        etCamiRecuperar.setBounds(70, 450, 50, 23);

        etRecuperar.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        etRecuperar.setText("Recuperar dades");
        jPanel4.add(etRecuperar);
        etRecuperar.setBounds(40, 380, 200, 18);

        btnAcceptarGuardar.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        btnAcceptarGuardar.setText("Acceptar");
        btnAcceptarGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptarGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAcceptarGuardar);
        btnAcceptarGuardar.setBounds(720, 250, 170, 60);

        btnAcceptarRecuperar.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        btnAcceptarRecuperar.setText("Acceptar");
        btnAcceptarRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptarRecuperarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAcceptarRecuperar);
        btnAcceptarRecuperar.setBounds(720, 560, 170, 60);

        etNomFitxer.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        etNomFitxer.setText("Nom pel fitxer");
        jPanel4.add(etNomFitxer);
        etNomFitxer.setBounds(30, 210, 130, 18);

        textNomGuardar.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        jPanel4.add(textNomGuardar);
        textNomGuardar.setBounds(160, 200, 440, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imatges/fusta.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(0, -20, 960, 690);

        jTabbedPane1.addTab("Guardar i recuperar dades", jPanel4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Associa diversos botons a imatges del package imatges per millorar l'aspecte
     * de la GUI.
     * Aquest metode podria formar part de initComponents, pero com que es codi 
     * generat no el podem modificar.
     */
    private void relateImageWithButtons(){
       Image m;
        try {
            m = ImageIO.read(getClass().getResource("/imatges/resume.png"));
            btnReempren.setIcon(new ImageIcon(m));
           m = ImageIO.read(getClass().getResource("/imatges/pause.png"));            
           btnPausa.setIcon(new ImageIcon(m));
            m = ImageIO.read(getClass().getResource("/imatges/stop.png"));          
            btnAtura.setIcon(new ImageIcon(m));
            m = ImageIO.read(getClass().getResource("/imatges/skip.png"));
            btnSalta.setIcon(new ImageIcon(m));
            m = ImageIO.read(getClass().getResource("/imatges/shuffle.png"));
            btnReproduccioAleatoria.setIcon(new ImageIcon(m));
            m = ImageIO.read(getClass().getResource("/imatges/repeat.png"));
            btnReproduccioCiclica.setIcon(new ImageIcon(m));
            m = ImageIO.read(getClass().getResource("/imatges/search.png"));
            btnCercaGuardar.setIcon(new ImageIcon(m));
            btnCercaRecuperar.setIcon(new ImageIcon(m));
            m = ImageIO.read(getClass().getResource("/imatges/ok.png"));
            btnAcceptarGuardar.setIcon(new ImageIcon(m));
           btnAcceptarRecuperar.setIcon(new ImageIcon(m));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    /**
     * ******************************************************************
     */
    /**
     * *********************** Event listeners  *************************
     */
    /**
     * ******************************************************************
     */
    
    /**
     * Cancel·la les seleccions de la jList que mostra la biblioteca i els àlbums
     * si es clica fora seu.
     * @param evt
     */
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        llistaBiblioteca.clearSelection();
        llistaAlbums.clearSelection();
    }//GEN-LAST:event_jPanel1MouseClicked

    /**
     * Crida el mètode reproduirFitxerAlbum de la classe Controlador per tal
     * de reproduir un fitxer present en un àlbum  si rep un event de l'objecte 
     * btnReproduirFitxerAlbum. 
     * Primer obtenim el títol de l'àlbum que hem seleccionat en la jList llistaAlbums. 
     * A continuació, obtenim la posició del fitxer de la jList que mostra els arxius
     * de l'album i reproduim el fitxer.
     * @param evt 
     */
    private void btnReproduirFitxerAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproduirFitxerAlbumActionPerformed
        int indxAlbum = llistaAlbums.getSelectedIndex();
        int indxFile = llistaFitxersAlbum.getSelectedIndex();
        String titol = null;
        try {
            titol = controlador.mostrarTitolAlbum(indxAlbum);
            controlador.reproduirFitxerAlbum(titol, indxFile);

        } catch (AplicacioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "error", ERROR_MESSAGE);
        }

        btnReproduirFitxerAlbum.setSelected(false);
        actualitzaBotonsControlReproduccio(true, false, false, false);
        btnReempren.setSelected(true);
    }//GEN-LAST:event_btnReproduirFitxerAlbumActionPerformed

    /**
     * Crida el mètode esborrarFitxer(string titol, int posFitxer) de la classe
     * Controlador si rep un event de l'objecte btnEliminarFitxerAlbum.
     * Obtenim el títol de l'àlbum i la posició del fitxer de 
     * la mateixa manera que el mètode anterior.
     * Actualitzem la jList que mostra l'album.
     * @param evt 
     */
    private void btnEliminarFitxerAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFitxerAlbumActionPerformed
        int indxAlbum = llistaAlbums.getSelectedIndex();
        String titol = null;
        try {
            titol = controlador.mostrarTitolAlbum(indxAlbum);
            actualitzaAlbum();
        } catch (AplicacioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "error", ERROR_MESSAGE);
        }
        int posFitxer = llistaFitxersAlbum.getSelectedIndex();
        //getSelectedIndex retorna -1 si no n'hi ha cap de seleccionat
        if (posFitxer != -1) {
            try {
                controlador.esborrarFitxer(titol, posFitxer);
                actualitzaAlbum();
                JOptionPane.showMessageDialog(this, "Fitxer eliminat de l'àlbum correctament", "Eliminar fitxer d'un àlbum",JOptionPane.PLAIN_MESSAGE, IMAGE_INFO);
            } catch (AplicacioException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "error", ERROR_MESSAGE);
            }
        }
        btnEliminarFitxerAlbum.setSelected(false);
    }//GEN-LAST:event_btnEliminarFitxerAlbumActionPerformed

    /**
     * Crida el mètode afegirFitxer(string titol, int posFitxer) de la classe
     * Controlador si rep un event de l'objecte btnAfegirFitxerAlbum.
     * Obtenim el títol de l'àlbum i la posició del fitxer de 
     * la mateixa manera que el mètode anterior.
     * Actualitzem la jList que mostra l'album.
     * @param evt 
     */
    private void btnAfegirFitxerAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfegirFitxerAlbumActionPerformed
        int indxAlbum = llistaAlbums.getSelectedIndex();
        String titol = null;
        try {
            titol = controlador.mostrarTitolAlbum(indxAlbum);
            actualitzaAlbum();
        } catch (AplicacioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "error", ERROR_MESSAGE);
        }
        int posFitxer = llistaBiblioteca.getSelectedIndex();
        //getSelectedIndex retorna -1 si no n'hi ha cap de seleccionat
        if (posFitxer != -1) {
            try {
                controlador.afegirFitxer(titol, posFitxer);
                if(llistaBiblioteca.getSelectedValue().contains("Jeb_") && titol.equals("Steve")){
                    final ImageIcon icon = new ImageIcon(new URL("https://gamepedia.cursecdn.com/minecraft_gamepedia/b/b3/Jebsheep.gif?version=5628617d6253881f6d641552c7ab3d55"));
                    JOptionPane.showMessageDialog(null, "", "", JOptionPane.INFORMATION_MESSAGE, icon);

                }
                actualitzaAlbum();
                JOptionPane.showMessageDialog(this, "Fitxer afegit a l'àlbum correctament", "Afegir un fitxer a l'àlbum",JOptionPane.PLAIN_MESSAGE, IMAGE_INFO);
            } catch (AplicacioException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "error", ERROR_MESSAGE);
            } catch (MalformedURLException ex) {
                Logger.getLogger(AplicacioUB4.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        btnAfegirFitxerAlbum.setSelected(false);
    }//GEN-LAST:event_btnAfegirFitxerAlbumActionPerformed

    /**
     * Crida el mètode reproduirCarpeta(String titol) de la classe Controlador
     * per a reproduir un àlbum. Obtenim el títol de l'àlbum mitjançant la selecció
     * d'un element en el JList llistaAlbums.
     * @param evt 
     */
    private void btnReproduirAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproduirAlbumActionPerformed
        int indx = llistaAlbums.getSelectedIndex();
        try{
            String titol = controlador.mostrarTitolAlbum(indx);
            controlador.reproduirCarpeta(titol);
        }catch(AplicacioException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "error", ERROR_MESSAGE);
        }
        btnReproduirAlbum.setSelected(false);
        actualitzaBotonsControlReproduccio(true, false, false, false);
        btnReempren.setSelected(true);
    }//GEN-LAST:event_btnReproduirAlbumActionPerformed

    /**
     * Cridem el mètode esborrarAlbum(String titol) per eliminar un àlbum.
     * Mateix raonament que amb el mètode anterior, però a més hem d'actualitzar
     * el llistat d'àlbums que es mostren en el JList llistaAlbums.
     * @param evt 
     */
    private void btnEliminarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlbumActionPerformed
        
        int indx = llistaAlbums.getSelectedIndex();
        try{
            String titol = controlador.mostrarTitolAlbum(indx);
            controlador.esborrarAlbum(titol);
            actualitzaAlbums();
            actualitzaAlbum();
            JOptionPane.showMessageDialog(this, "Àlbum eliminat correctament", "Eliminar un àlbum",JOptionPane.PLAIN_MESSAGE, IMAGE_INFO);
        }catch(AplicacioException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "error", ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnEliminarAlbumActionPerformed

    /**
     * Crida el mètode afegirAlbum(String titol, int mida) de Controlador per
     * afegir un àlbum a la JList llistaAlbums. Demanem amb dos JOptionPane el
     * títol i la mida del nou àlbum. Si totes dues entrades són correctes,
     * afegim l'àlbum. En cas contrari, avisem de l'error amb JOptionPanes.
     * @param evt 
     */
    private void btnCrearAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAlbumActionPerformed
        String titol = JOptionPane.showInputDialog(this, "Introdueix el títol de l'àlbum", "Crear nou àlbum", JOptionPane.PLAIN_MESSAGE);
        int midaFinal = 0;
        if(titol != null && isAlpha(titol)){
            String mida = JOptionPane.showInputDialog(this, "Introdueix la capacitat màxima de l'àbum", "Establir mida de l'àlbum", JOptionPane.PLAIN_MESSAGE);
            if(mida != null){
                try{
                    midaFinal = Integer.parseInt(mida);
                }catch(HeadlessException | NumberFormatException ex){
                    JOptionPane.showMessageDialog(this,"La capacitat introduida no és vàlida, establint mida a 10", "error", JOptionPane.WARNING_MESSAGE);
                    midaFinal = 10;
                }
                try{
                    controlador.afegirAlbum(titol, midaFinal);
                    if(titol.equals("Steve")){
                        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imatges/error1.png"))); 
                        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imatges/error1.png"))); 
                    }
                    actualitzaAlbums();
                    JOptionPane.showMessageDialog(this, "Àlbum afegit correctament", "Afegir un àlbum",JOptionPane.PLAIN_MESSAGE, IMAGE_INFO);
                } catch (AplicacioException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "error", ERROR_MESSAGE);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "El nom introduit no és correcte", "error", ERROR_MESSAGE);
        }
        btnCrearAlbum.setSelected(false);
    }//GEN-LAST:event_btnCrearAlbumActionPerformed

    /**
     * Crida al mètode saltaReproduccio de controlador. Si rep una excepcio 
     * obre un JOptionPane mostrant un missatge d'error. 
     * També actualitza l'estat dels altres botons mitjançant un mètode auxiliar
     * actualitzaBotonsControlReproduccio, per evitar que hi hagi diversos botons
     * seleccionats alhora
     * @param evt
     */
    private void btnSaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaltaActionPerformed
        try {
            controlador.saltaReproduccio();
        } catch (AplicacioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "error", ERROR_MESSAGE);
        }
        actualitzaBotonsControlReproduccio(false, false, false, true);
        btnReempren.setSelected(true);
    }//GEN-LAST:event_btnSaltaActionPerformed

    /**
     * Crida al mètode aturaReproduccio de controlador. Si rep una excepcio 
     * obre un JOptionPane mostrant un missatge d'error. 
     * També actualitza l'estat dels altres botons mitjançant un mètode auxiliar
     * actualitzaBotonsControlReproduccio, per evitar que hi hagi diversos botons
     * seleccionats alhora
     * @param evt
     */
    private void btnAturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAturaActionPerformed
        try {
            controlador.aturaReproduccio();
        } catch (AplicacioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "error", ERROR_MESSAGE);
        }
        actualitzaBotonsControlReproduccio(false, false, true, false);
        btnReempren.setSelected(true);
    }//GEN-LAST:event_btnAturaActionPerformed

    /**
     * Crida al mètode pausaReproduccio de controlador. Si rep una excepcio 
     * obre un JOptionPane mostrant un missatge d'error. 
     * També actualitza l'estat dels altres botons mitjançant un mètode auxiliar
     * actualitzaBotonsControlReproduccio, per evitar que hi hagi diversos botons
     * seleccionats alhora
     * @param evt
     */
    private void btnPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausaActionPerformed
        try {
            controlador.pausaReproduccio();
        } catch (AplicacioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "error", ERROR_MESSAGE);
        }
        actualitzaBotonsControlReproduccio(false, true, false, false);
    }//GEN-LAST:event_btnPausaActionPerformed

    /**
     * Crida al mètode reemprenReproduccio de controlador. Si rep una excepcio 
     * obre un JOptionPane mostrant un missatge d'error. 
     * També actualitza l'estat dels altres botons mitjançant un mètode auxiliar
     * actualitzaBotonsControlReproduccio, per evitar que hi hagi diversos botons
     * seleccionats alhora
     * @param evt
     */
    private void btnReemprenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReemprenActionPerformed
        try {
            controlador.reemprenReproduccio();
        } catch (AplicacioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "error", ERROR_MESSAGE);
        }
        actualitzaBotonsControlReproduccio(true, false, false, false);
    }//GEN-LAST:event_btnReemprenActionPerformed

     /**
     * Crida al mètode OnOffCiclica de controlador i mostra un missatge indicant
     * l'estat de la reproducció en aquell moment. 
     * @param evt
     */
    private void btnReproduccioCiclicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproduccioCiclicaActionPerformed
        boolean aleatoria = controlador.OnOffCiclica();
        if (aleatoria) {
            JOptionPane.showMessageDialog(this, "Reproducció cíclica activada");
        } else {
            JOptionPane.showMessageDialog(this, "Reproducció cíclica desactivada");
        }
    }//GEN-LAST:event_btnReproduccioCiclicaActionPerformed

    /**
     * Crida al mètode OnOffAleatoria de controlador i mostra un missatge indicant
     * l'estat de la reproducció en aquell moment. 
     * @param evt
     */
    private void btnReproduccioAleatoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproduccioAleatoriaActionPerformed
        boolean aleatoria = controlador.OnOffAleatoria();
        if (aleatoria) {
            JOptionPane.showMessageDialog(this, "Reproducció aleatòria activada");
        } else {
            JOptionPane.showMessageDialog(this, "Reproducció aleatòria desactivada");
        }
    }//GEN-LAST:event_btnReproduccioAleatoriaActionPerformed

    /**
     * Crida el mètode reproduirFitxer(int indx) de Controlador. El fitxer que
     * volem reproduir l'obtenim amb un getter de l'índex de l'element marcat
     * a la JList. En cas d'error, ho avisem amb un JOptionPane.
     * El fitxer reproduit queda no seleccionat.
     * @param evt 
     */
    private void btnReproduiFitxerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproduiFitxerActionPerformed
        int indx = llistaBiblioteca.getSelectedIndex();
        try{
            controlador.reproduirFitxer(indx);
            llistaBiblioteca.removeSelectionInterval(indx, indx);
        }catch(AplicacioException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "error", ERROR_MESSAGE);
        }
        btnReproduiFitxer.setSelected(false);
        actualitzaBotonsControlReproduccio(true, false, false, false);
    }//GEN-LAST:event_btnReproduiFitxerActionPerformed

    /**
     * Cridem el mètode reproduirCarpeta() de Controlador. En cas de produir-se
     * un error, ho indiquem amb un JOptionPane.
     * @param evt 
     */
    private void btnReproduirBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproduirBibliotecaActionPerformed
        try{
            controlador.reproduirCarpeta();
        }catch(AplicacioException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "error", ERROR_MESSAGE);
        }
        btnReproduirBiblioteca.setSelected(false);
        actualitzaBotonsControlReproduccio(true, false, false, false);
    }//GEN-LAST:event_btnReproduirBibliotecaActionPerformed

    /**
     * Cridem el mètode esborrarFitxer(int pos) de Controlador per esborrar un
     * fitxer de la biblioteca. En el cas que l'usuari seleccioni en el JList més
     * d'un element, els guardem com a array i anem cridant successivament el 
     * mètode. Si sorgeix un error, ho avisem amb un JOptionPane.
     * Actualitzem el JList de fitxers un cop eliminat.
     * @param evt 
     */
    private void btnEliminarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBibliotecaActionPerformed
        int [] eliminar = llistaBiblioteca.getSelectedIndices();
        int eliminarLength = eliminar.length;
        int posVariation = 0;
        for(int i = 0; i < eliminarLength; i++){
            try {
                controlador.esborrarFitxer(eliminar[i] - posVariation);
                posVariation++;
            }catch(AplicacioException e){
                JOptionPane.showMessageDialog(this, e.getMessage(), "error", ERROR_MESSAGE);
            }
        }
        actualitzaBiblioteca();
        JOptionPane.showMessageDialog(this, "Fitxer/s eliminat/s de la biblioteca correctament", "Eliminar fitxer/s de la biblioteca",JOptionPane.PLAIN_MESSAGE, IMAGE_INFO);
        //Cal actualitzar l'album que estem mostrant
        int albumActual = llistaAlbums.getSelectedIndex();
        //getSelectedIndex retorna -1 si no n'hi ha cap de seleccionat
        if (albumActual != -1) {
            String titol = null;
            try {
                titol = controlador.mostrarTitolAlbum(albumActual);
                actualitzaAlbum();
            } catch (AplicacioException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "error", ERROR_MESSAGE);
            }
        }
        btnEliminarBiblioteca.setSelected(false);
    }//GEN-LAST:event_btnEliminarBibliotecaActionPerformed

    /**
     * Instancia un objecte del tipus FrmAfegirFitxerMultimedia i el fa visible.
     * Aquest objecte afegeix a la biblioteca el fitxer que l'usuari desitgi, 
     * si és possible. Finalment actualitzem la biblioteca.
     * @param evt 
     */
    private void btnAfegirFitxerBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfegirFitxerBibliotecaActionPerformed
        FrmAfegirFitxerMultimedia dialog = new FrmAfegirFitxerMultimedia(this, true, controlador);
        dialog.pack();
        dialog.setSize(650, 420);
        dialog.setVisible(true);
        actualitzaBiblioteca();//a la vegada ja s'actualitzala JComboBox
        if(!getAddedCorrectly()){
             JOptionPane.showMessageDialog(this, "Error a l'afegir el fitxer a la biblioteca", "error", ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Fitxer afegit a la biblioteca correctament", "Afegir fitxer a la biblioteca",JOptionPane.PLAIN_MESSAGE , IMAGE_INFO);
        }
        btnAfegirFitxerBiblioteca.setSelected(false);
    }//GEN-LAST:event_btnAfegirFitxerBibliotecaActionPerformed

    /**
     * Intenta recuperar les dades des de l'arxiu que l'usuari indica. Si no és 
     * possible rep una AplicacioException i obre un JOptionPane mostrant un 
     * missatge d'error.
     * Actualitza tota la interfície i deixa seleccionats els botons que responen
     * al mode de reproducció que s'ha carregat
     * @param evt 
     */
    private void btnAcceptarRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptarRecuperarActionPerformed
        if (textCarregar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Introdueix un camí", "error", ERROR_MESSAGE);
        } else {
            try {
                controlador.carregarDadesDisc(textCarregar.getText());
                actualitzaTot();
                actualitzaBotonsReproduccio();
                textCarregar.setText("");
                JOptionPane.showMessageDialog(this, "Dades recuperades amb èxit! ");
            } catch (AplicacioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "error", ERROR_MESSAGE);
        }}
        btnAcceptarRecuperar.setSelected(false);
    }//GEN-LAST:event_btnAcceptarRecuperarActionPerformed

    /**
     * Intenta guardar les dades on l'usuari indica. Si no és possible rep una
     * AplicacioException i obre un JOptionPane mostrant un missatge d'error
     * @param evt 
     */
    private void btnAcceptarGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptarGuardarActionPerformed
        if (textGuardar.getText().equals("") || textNomGuardar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Introdueix un camí", "error", ERROR_MESSAGE);
        } else {
            try {
                controlador.guardarDadesDisc(textGuardar.getText() + "\\" + textNomGuardar.getText());
                textGuardar.setText("");
                textNomGuardar.setText("");
                JOptionPane.showMessageDialog(this, "Dades guardades amb èxit! ");
            } catch (AplicacioException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "error", ERROR_MESSAGE);
            }
        }
        btnAcceptarGuardar.setSelected(false);
    }//GEN-LAST:event_btnAcceptarGuardarActionPerformed

    /**
     * Obre una finestra que permet a l'usuari navegar per les carpetes de
     * l'ordinador i seleccionar l'arxiu d'on vol recuperar les dades.
     * @param evt 
     */
    private void btnCercaRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaRecuperarActionPerformed
        File fitxer;
        JFileChooser seleccio = new JFileChooser();
        int resultat = seleccio.showOpenDialog(this);
        if (resultat == JFileChooser.APPROVE_OPTION) {
            fitxer = seleccio.getSelectedFile();
            textCarregar.setText(fitxer.getAbsolutePath());
        }
        btnCercaRecuperar.setSelected(false);
    }//GEN-LAST:event_btnCercaRecuperarActionPerformed

    /**
     * Obre una finestra que permet a l'usuari navegar per les carpetes de l'ordinador
     * i seleccionar la carpeta on vol desar les dades.
     * @param evt 
     */
    private void btnCercaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaGuardarActionPerformed
        File fitxer;
        JFileChooser seleccio = new JFileChooser();
        int resultat = seleccio.showOpenDialog(this);
        if (resultat == JFileChooser.APPROVE_OPTION){
            fitxer = seleccio.getCurrentDirectory();
            textGuardar.setText(fitxer.getAbsolutePath());
        }
        btnCercaGuardar.setSelected(false);
    }//GEN-LAST:event_btnCercaGuardarActionPerformed

    /**
     * Cada cop que un album és seleccionat a la llista, en mostrem la informació
     * a la jList llistaFitxersAlbum mitjançant una crida al metode privat 
     * actualitzaAlbum()
     * @param evt
     */
    private void llistaAlbumsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llistaAlbumsMousePressed
        actualitzaAlbum();
    }//GEN-LAST:event_llistaAlbumsMousePressed

     /**
     * ******************************************************************
     */
    /**
     * *********************** Control jLists *************************
     */
    /**
     * ******************************************************************
     */
    /**
     * Actualitza els fitxers que es mostren a la llistaBiblioteca
     */
    private void actualitzaBiblioteca(){
        List<String> aux = controlador.mostrarBiblioteca();
        String[] copia = aux.toArray(new String[aux.size()]);
        llistaBiblioteca.setListData(copia);
    }
 
    /**
     * Actualitza els fitxers que es mostren a la llistaAlbums
     */
    private void actualitzaAlbums(){
        int indx = llistaAlbums.getSelectedIndex();
        List<String> aux = controlador.mostrarLlistatAlbums();
        String[] copia = aux.toArray(new String[aux.size()]);
        llistaAlbums.setListData(copia);
        int size = llistaAlbums.getModel().getSize();
        if(size >0){
            if(indx == -1){
                indx++;
            }
            else if(indx > size-1){
                indx--;
            }
            llistaAlbums.setSelectedIndex(indx);
        }
    }

    /**
     * Actualitza la informació que es mostra sobre l'album seleccionat a la llista
     * d'àlbums, sempre que n'hi hagi algun. Si rep alguna excepcio mostra la llista
     * dels fitxers de l'album en blanc. Si no hi ha cap album a la llista, també 
     * la mostra en blanc.
     */
    private void actualitzaAlbum() {
        int indxAlbum = this.llistaAlbums.getSelectedIndex();
        int midaLlistaAlbums = this.llistaAlbums.getModel().getSize();
        boolean refresh = (midaLlistaAlbums > 0 && indxAlbum < midaLlistaAlbums);
        if (refresh) {
            try {
                String titol = controlador.mostrarTitolAlbum(indxAlbum);
                int[] indxs = llistaFitxersAlbum.getSelectedIndices();
                List<String> aux = controlador.mostrarAlbum(titol);
                String[] copia = aux.toArray(new String[aux.size()]);
                llistaFitxersAlbum.setListData(copia);
                llistaFitxersAlbum.setSelectedIndices(indxs);
            } catch (AplicacioException e) {
                llistaFitxersAlbum.setListData(new String[]{});
            }
        } else {
            llistaFitxersAlbum.setListData(new String[]{});
        }
    }

    /**
     * Actualitza la biblioteca, la llista d'albums i els fitxers de l'album que 
     * s'esta mostrant
     */
    private void actualitzaTot(){
        actualitzaBiblioteca();
        actualitzaAlbums();
        actualitzaAlbum();
    }
    
    /**
     * Selecciona els botons de mode de reproduccio segons els seus estats booleans,
     * que obtenim mitjançant els getters de controlador
     */
    private void actualitzaBotonsReproduccio() {
        if (controlador.getReproduccioAleatoria()) {
            btnReproduccioAleatoria.setSelected(true);
        } else {
            btnReproduccioAleatoria.setSelected(false);
        }
        if (controlador.getReproduccioCiclica()) {
            btnReproduccioCiclica.setSelected(true);
        } else {
            btnReproduccioCiclica.setSelected(false);
        }
    }
    
    /**
     * Actualitza l'estat dels botons de control de reproducció: reempren, pausa, 
     * atura i salta.
     * Rep 4 booleans per paràmetre, el que sigui true respon al botó que està 
     * seleccionat. Aquest mètode des-selecciona els altres.
     * @param reempren
     * @param pausa
     * @param atura
     * @param salta
     */
    private void actualitzaBotonsControlReproduccio(boolean reempren, boolean pausa, boolean atura, boolean salta){
        if(!reempren){
            btnReempren.setSelected(false);
        }
        if (!pausa){
            btnPausa.setSelected(false);
        }
        if(!atura){
            btnAtura.setSelected(false);
        }
        if(!salta){
            btnSalta.setSelected(false);
        }
    }
    
     /**
     * ******************************************************************
     */
    /**
     * ******************* Altres mètodes auxiliars  *********************
     */
    /**
     * ******************************************************************
     */ 
    
    /**
     * Retorna cert si la string passada com a parametre conté com a minim una lletra
     * @param name
     */
    private boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }

    /**
     * setter de l'atribut boolea addedCorrectly. No és privat ja que FrmAfegirFitxerMultimedia
     * hi ha de tenir accés
     * @param answer
     */
    static void setAddedCorrectly(boolean answer) {
        addedCorrectly = answer;
    }

    /**
     * getter de l'atribut boolea addedCorrectly. No és privat ja que FrmAfegirFitxerMultimedia
     * hi ha de tenir accés
     * @return boolean
     */
    static boolean getAddedCorrectly() {
        return addedCorrectly;
    }

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAcceptarGuardar;
    private javax.swing.JToggleButton btnAcceptarRecuperar;
    private javax.swing.JButton btnAfegirFitxerAlbum;
    private javax.swing.JButton btnAfegirFitxerBiblioteca;
    private javax.swing.JToggleButton btnAtura;
    private javax.swing.JToggleButton btnCercaGuardar;
    private javax.swing.JToggleButton btnCercaRecuperar;
    private javax.swing.JButton btnCrearAlbum;
    private javax.swing.JButton btnEliminarAlbum;
    private javax.swing.JToggleButton btnEliminarBiblioteca;
    private javax.swing.JButton btnEliminarFitxerAlbum;
    private javax.swing.JToggleButton btnPausa;
    private javax.swing.JToggleButton btnReempren;
    private javax.swing.JToggleButton btnReproduccioAleatoria;
    private javax.swing.JToggleButton btnReproduccioCiclica;
    private javax.swing.JToggleButton btnReproduiFitxer;
    private javax.swing.JButton btnReproduirAlbum;
    private javax.swing.JToggleButton btnReproduirBiblioteca;
    private javax.swing.JButton btnReproduirFitxerAlbum;
    private javax.swing.JToggleButton btnSalta;
    private javax.swing.JLabel etBiblioteca;
    private javax.swing.JLabel etCamiGuardar;
    private javax.swing.JLabel etCamiRecuperar;
    private javax.swing.JLabel etControlsReproduccio1;
    private javax.swing.JLabel etGestioAlbumSeleccionat;
    private javax.swing.JLabel etGestioAlbums;
    private javax.swing.JLabel etGuardarDades;
    private javax.swing.JLabel etNomFitxer;
    private javax.swing.JLabel etRecuperar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> llistaAlbums;
    private javax.swing.JList<String> llistaBiblioteca;
    private javax.swing.JList<String> llistaFitxersAlbum;
    private javax.swing.JTextField textCarregar;
    private javax.swing.JTextField textGuardar;
    private javax.swing.JTextField textNomGuardar;
    // End of variables declaration//GEN-END:variables

    
}
