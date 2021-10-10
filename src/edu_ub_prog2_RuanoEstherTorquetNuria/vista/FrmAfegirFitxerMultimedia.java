package edu_ub_prog2_RuanoEstherTorquetNuria.vista;

import edu.ub.prog2.RuanoEstherTorquetNuria.controlador.Controlador;
import edu.ub.prog2.utils.AplicacioException;
import static edu_ub_prog2_RuanoEstherTorquetNuria.vista.AplicacioUB4.setAddedCorrectly;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 * @author Esther Ruano Hortoneda
 * @author Nuria Torquet Luna 
 * 
 * La classe FrmAfegirFitxerMultimedia s'instancia quan l'usuari vol afegir un
 * fitxer a la biblioteca. En recull la informació i crida al mètode afegirVideo
 * o afegirAudio amb el controlador que té com a atribut en funció de la selecció 
 * de l'usuari
 **/

public class FrmAfegirFitxerMultimedia extends javax.swing.JDialog {
    
    /**
     * Atributs de la classe: una instància de Controlador  per poder cridar als mètodes 
     * i diversos atributs del tipus string, float o int per tal d'enmagatzemar
     * les dades de l'arxiu que s'afegira
     */
    private Controlador controlador;
    private String nom, cami, descripcio, codec, camiImatge;
    private float durada, fps;
    private int amplada, alcada, kbps;
    
    /**
     * Constructor de la classe. 
     * Crida al constructor de JDialog mitjançant dos dels atributs que li són passats
     * com a paràmetre. El tercer el fa servir per instanciar l'atribut Controlador.
     * Crida als mètodes initComponents() i relateImageWithButtons().
     * Seguidament afegeix els dos radioButtons a un buttonGroup, de manera que 
     * només es pot seleccionar o bé Audio o bé Video. Fa visibles els components
     * necessaris per afegir un Audio.
     */
    public FrmAfegirFitxerMultimedia(java.awt.Frame parent, boolean modal, Controlador c) {
        super(parent, modal);
   
        initComponents();
        relateImageWithButtons();
        buttonGroup1.add(radioButtonAudio);
        buttonGroup1.add(radioButtonVideo);
        radioButtonAudio.setSelected(true);
        controlador = c;
        textAmplada.setVisible(false);
        textAlcada.setVisible(false);
        etAmplada.setVisible(false);
        etAlcada.setVisible(false);
        this.setResizable(false);
    }

    /**
     * Inicialitza tots els widgets del JFrame.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnAcceptar = new javax.swing.JButton();
        etCami = new javax.swing.JLabel();
        textCami = new javax.swing.JTextField();
        etNom = new javax.swing.JLabel();
        textNom = new javax.swing.JTextField();
        etDescripcio = new javax.swing.JLabel();
        textDescripcio = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        etTipus = new javax.swing.JLabel();
        radioButtonAudio = new javax.swing.JRadioButton();
        radioButtonVideo = new javax.swing.JRadioButton();
        etDurada = new javax.swing.JLabel();
        textDurada = new javax.swing.JTextField();
        etKbpsFps = new javax.swing.JLabel();
        textKbpsFps = new javax.swing.JTextField();
        etCamiImatge = new javax.swing.JLabel();
        textCamiImatge = new javax.swing.JTextField();
        etAmplada = new javax.swing.JLabel();
        etAlcada = new javax.swing.JLabel();
        textAmplada = new javax.swing.JTextField();
        textAlcada = new javax.swing.JTextField();
        btnCerca = new javax.swing.JToggleButton();
        btnCercaImatge = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 350));
        setSize(700, 600);
        getContentPane().setLayout(null);

        btnAcceptar.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        btnAcceptar.setText("OK");
        btnAcceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcceptar);
        btnAcceptar.setBounds(130, 300, 130, 60);

        etCami.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        etCami.setText("Cami fitxer");
        getContentPane().add(etCami);
        etCami.setBounds(20, 30, 80, 18);

        textCami.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        getContentPane().add(textCami);
        textCami.setBounds(100, 20, 320, 30);

        etNom.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        etNom.setText("Nom");
        getContentPane().add(etNom);
        etNom.setBounds(27, 69, 40, 18);

        textNom.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        getContentPane().add(textNom);
        textNom.setBounds(100, 60, 320, 30);

        etDescripcio.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        etDescripcio.setText("Descripció");
        getContentPane().add(etDescripcio);
        etDescripcio.setBounds(27, 109, 80, 18);

        textDescripcio.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        getContentPane().add(textDescripcio);
        textDescripcio.setBounds(100, 100, 320, 30);

        btnCancelar.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        btnCancelar.setText("Cancel");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(290, 300, 140, 60);

        etTipus.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        etTipus.setText("Tipus");
        getContentPane().add(etTipus);
        etTipus.setBounds(27, 189, 100, 18);

        radioButtonAudio.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        radioButtonAudio.setText("Audio");
        radioButtonAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonAudioActionPerformed(evt);
            }
        });
        getContentPane().add(radioButtonAudio);
        radioButtonAudio.setBounds(27, 208, 70, 40);

        radioButtonVideo.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        radioButtonVideo.setText("Video");
        radioButtonVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonVideoActionPerformed(evt);
            }
        });
        getContentPane().add(radioButtonVideo);
        radioButtonVideo.setBounds(27, 246, 70, 30);

        etDurada.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        etDurada.setText("Durada");
        getContentPane().add(etDurada);
        etDurada.setBounds(150, 220, 70, 14);

        textDurada.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        textDurada.setText("0");
        getContentPane().add(textDurada);
        textDurada.setBounds(200, 210, 110, 30);

        etKbpsFps.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        etKbpsFps.setText("Kbps");
        getContentPane().add(etKbpsFps);
        etKbpsFps.setBounds(160, 260, 60, 15);

        textKbpsFps.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        textKbpsFps.setText("0");
        getContentPane().add(textKbpsFps);
        textKbpsFps.setBounds(200, 250, 110, 30);

        etCamiImatge.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        etCamiImatge.setText("Cami Imatge");
        getContentPane().add(etCamiImatge);
        etCamiImatge.setBounds(10, 150, 90, 15);

        textCamiImatge.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        getContentPane().add(textCamiImatge);
        textCamiImatge.setBounds(100, 140, 320, 30);

        etAmplada.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        etAmplada.setText("Amplada");
        getContentPane().add(etAmplada);
        etAmplada.setBounds(330, 220, 100, 15);

        etAlcada.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        etAlcada.setText("Alcada");
        getContentPane().add(etAlcada);
        etAlcada.setBounds(330, 260, 90, 15);

        textAmplada.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        textAmplada.setText("0");
        getContentPane().add(textAmplada);
        textAmplada.setBounds(390, 210, 100, 30);

        textAlcada.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        textAlcada.setText("0");
        getContentPane().add(textAlcada);
        textAlcada.setBounds(390, 250, 100, 30);

        btnCerca.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        btnCerca.setText("Cerca");
        btnCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerca);
        btnCerca.setBounds(450, 10, 130, 60);

        btnCercaImatge.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        btnCercaImatge.setText("Cerca");
        btnCercaImatge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaImatgeActionPerformed(evt);
            }
        });
        getContentPane().add(btnCercaImatge);
        btnCercaImatge.setBounds(450, 130, 130, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imatges/fusta.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * En funció de la opció triada per l'usuari (Video o Audio) recull les dades
     * necessaries i intenta afegir-lo a la biblioteca mitjançant l'atribut controlador.
     * Crida al setter de l'atribut booleà de AplicacioUB4 perquè mostri un missatge
     * informant de si s'ha pogut afegir amb èxit o no. En aquest segon cas 
     * també mostra un missatge amb la causa.
     * Finalment tanca la finestra
     * @param evt
     */
    private void btnAcceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptarActionPerformed
        if(radioButtonAudio.isSelected()){
            try {
                descripcio = textDescripcio.getText();
                nom = textNom.getText();
                cami = textCami.getText();
                codec = extractCodec(cami);
                kbps = Integer.parseInt(textKbpsFps.getText());
                durada = Float.parseFloat(textDurada.getText());
                camiImatge = textCamiImatge.getText();
                controlador.afegirAudio(cami, camiImatge, descripcio, codec, durada, kbps);
                setAddedCorrectly(true);
            } catch (NumberFormatException |AplicacioException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "error", ERROR_MESSAGE);
                setAddedCorrectly(false);
            }
        } else {
            try{
                descripcio = textDescripcio.getText();
                nom = textNom.getText();
                cami = textCami.getText();
                codec = extractCodec(cami);
                fps = Float.parseFloat(textKbpsFps.getText());
                durada = Float.parseFloat(textDurada.getText());
                amplada = Integer.parseInt(textAmplada.getText());
                alcada = Integer.parseInt(textAlcada.getText());
                controlador.afegirVideo(cami, descripcio, codec, durada, alcada, amplada, fps);
                setAddedCorrectly(true);
            }catch(NumberFormatException | AplicacioException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage(), "error", ERROR_MESSAGE);
                setAddedCorrectly(false);
            }            
        } 
        btnAcceptar.setSelected(false);
        this.dispose();
        
    }//GEN-LAST:event_btnAcceptarActionPerformed

    /**
     * Tanca la finestra
     * @param evt
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * Mostra els elements necessaris per introduir la informació d'un arxiu d'àudio
     * @param evt
     */
    private void radioButtonAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonAudioActionPerformed
        etKbpsFps.setText("Kbps");
        textAmplada.setVisible(false);
        textAlcada.setVisible(false);
        etAmplada.setVisible(false);
        etAlcada.setVisible(false);
        etCamiImatge.setVisible(true);
        textCamiImatge.setVisible(true);
        btnCercaImatge.setVisible(true);
    }//GEN-LAST:event_radioButtonAudioActionPerformed

    /**
     * Mostra els elements necessaris per introduir la informació d'un arxiu de video
     * @param evt
     */
    private void radioButtonVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonVideoActionPerformed
        etKbpsFps.setText("Fps");
        textAmplada.setVisible(true);
        textAlcada.setVisible(true);
        etAmplada.setVisible(true);
        etAlcada.setVisible(true);
        etCamiImatge.setVisible(false);
        textCamiImatge.setVisible(false);
        btnCercaImatge.setVisible(false);
    }//GEN-LAST:event_radioButtonVideoActionPerformed

    /**
     * Obre una finestra que permet a l'usuari navegar per les carpetes de
     * l'ordinador i seleccionar l'arxiu que vol afegir a la biblioteca.
     * @param evt 
     */
    private void btnCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaActionPerformed
        File fitxer;
        JFileChooser seleccio = new JFileChooser();
        int resultat = seleccio.showOpenDialog(this);
        if (resultat == JFileChooser.APPROVE_OPTION){
            fitxer = seleccio.getSelectedFile();
            cami = fitxer.getAbsolutePath();
            textCami.setText(cami);
        }
         btnCerca.setSelected(false);
    }//GEN-LAST:event_btnCercaActionPerformed

    /**
     * Obre una finestra que permet a l'usuari navegar per les carpetes de
     * l'ordinador i seleccionar l'arxiu que vol afegir com a imatge per acompanyar 
     * l'audio.
     * @param evt 
     */
    private void btnCercaImatgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaImatgeActionPerformed
        File fitxer;
        JFileChooser seleccio = new JFileChooser();
        int resultat = seleccio.showOpenDialog(this);
        if (resultat == JFileChooser.APPROVE_OPTION){
            fitxer = seleccio.getSelectedFile();
            camiImatge = fitxer.getAbsolutePath();
            textCamiImatge.setText(camiImatge);
        }
         btnCercaImatge.setSelected(false);
    }//GEN-LAST:event_btnCercaImatgeActionPerformed

    /**
     * Mètode de suport per no haver de demanar a l'usuari dos vegades pel codec.
     * Simplement utilitzem la funció substring per separar les últimes lletres
     * després de l'últim punt i guardar-ho com a còdec.
     * En cas de no haver-hi extensió en el path, es retorna un string buit.
     * @param path
     * @return extension
     */
    private String extractCodec( String path){
        
        String extension= path.substring(path.lastIndexOf(".")+1);
        
        return extension;
    }
    
    /**
     * Associa diversos botons a imatges del package imatges per millorar l'aspecte
     * de la GUI.
     * Aquest metode podria formar part de initComponents, pero com que es codi 
     * generat no el podem modificar.
     */
    private void relateImageWithButtons(){
       Image m;
        try {
            
            m = ImageIO.read(getClass().getResource("/imatges/search.png"));
            btnCerca.setIcon(new ImageIcon(m));
            btnCercaImatge.setIcon(new ImageIcon(m));
            
            m = ImageIO.read(getClass().getResource("/imatges/ok.png"));
            btnAcceptar.setIcon(new ImageIcon(m));
            m = ImageIO.read(getClass().getResource("/imatges/cancel.png"));
            btnCancelar.setIcon(new ImageIcon(m));
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JToggleButton btnCerca;
    private javax.swing.JToggleButton btnCercaImatge;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel etAlcada;
    private javax.swing.JLabel etAmplada;
    private javax.swing.JLabel etCami;
    private javax.swing.JLabel etCamiImatge;
    private javax.swing.JLabel etDescripcio;
    private javax.swing.JLabel etDurada;
    private javax.swing.JLabel etKbpsFps;
    private javax.swing.JLabel etNom;
    private javax.swing.JLabel etTipus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton radioButtonAudio;
    private javax.swing.JRadioButton radioButtonVideo;
    private javax.swing.JTextField textAlcada;
    private javax.swing.JTextField textAmplada;
    private javax.swing.JTextField textCami;
    private javax.swing.JTextField textCamiImatge;
    private javax.swing.JTextField textDescripcio;
    private javax.swing.JTextField textDurada;
    private javax.swing.JTextField textKbpsFps;
    private javax.swing.JTextField textNom;
    // End of variables declaration//GEN-END:variables
}
