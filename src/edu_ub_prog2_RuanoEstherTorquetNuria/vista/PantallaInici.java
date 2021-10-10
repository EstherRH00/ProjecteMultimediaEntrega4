package edu_ub_prog2_RuanoEstherTorquetNuria.vista;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * @author Esther Ruano Hortoneda
 * @author Nuria Torquet Luna 
 * 
 * La classe PantallaInici hereda de jDialog i es mostra abans d'inicialitza la 
 * aplicació.
 **/
public class PantallaInici extends javax.swing.JDialog {

    /**
     * Constructor de la classe. Crida al constructor de JDialog amb els dos paràmetres,
     * al metode initComponents(), crea un ImageIcon de la mida apropiada amb el 
     * logotip de la universitat i el vincula a la jLabel etLogoUB
     * @param parent
     * @param modal
     */
    public PantallaInici(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ImageIcon logoUB = new ImageIcon(AplicacioUB4.class.getResource("/imatges/Logotip_UB.png"));
        Image img1 = logoUB.getImage();
        Image img2 = img1.getScaledInstance(etLogoUB.getWidth(), etLogoUB.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon logoEscala = new ImageIcon(img2);
        etLogoUB.setIcon(logoEscala);
    }

    
    /**
     * Inicialitza tots els widgets del JFrame.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etLogoUB = new javax.swing.JLabel();
        etAny = new javax.swing.JLabel();
        etTitol = new javax.swing.JLabel();
        etNomE = new javax.swing.JLabel();
        etNomN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etLogoUB.setText(" ");

        etAny.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etAny.setText("2019");

        etTitol.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etTitol.setText("AplicacioUB4");

        etNomE.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etNomE.setText("Esther Ruano");

        etNomN.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etNomN.setText("Núria Torquet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(etNomE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etNomN)))
                .addGap(330, 330, 330))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(etLogoUB, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(etTitol))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(etAny)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(etLogoUB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(etTitol)
                .addGap(37, 37, 37)
                .addComponent(etNomE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etNomN)
                .addGap(35, 35, 35)
                .addComponent(etAny)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etAny;
    private javax.swing.JLabel etLogoUB;
    private javax.swing.JLabel etNomE;
    private javax.swing.JLabel etNomN;
    private javax.swing.JLabel etTitol;
    // End of variables declaration//GEN-END:variables
}
