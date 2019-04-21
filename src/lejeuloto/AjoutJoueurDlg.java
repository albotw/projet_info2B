package lejeuloto;
import java.awt.Color;
import javax.swing.JColorChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yann
 */
public class AjoutJoueurDlg extends javax.swing.JDialog {
    private boolean validated; //booleen pour savoir si l'on a validé ou annulé.
    private Color selectedColor; //couleur sélectionnée par l'utilisateur pour le joueur
    private Joueur j; //Joueur crée par la popup si elle est validée
    /**
     * Creates new form AjoutJoueurDlg
     */
    public AjoutJoueurDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal); //on appelle le constructeur de la superclasse
        initComponents(); //on initialise les composants d'interface.
        selectedColor = new Color(0, 0, 0); //on met la couleur à 0
        validated = false; //l'utilisateur n'a pas encore validé 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        North = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        West = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        East = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        South = new javax.swing.JPanel();
        Annuler = new javax.swing.JButton();
        Valider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ajout d'un nouveau joueur");
        North.add(jLabel1);

        getContentPane().add(North, java.awt.BorderLayout.NORTH);

        West.setLayout(new java.awt.GridLayout(4, 1));

        jLabel2.setText("Pseudo ");
        West.add(jLabel2);

        jLabel3.setText("Solde ");
        West.add(jLabel3);

        jLabel4.setText("Couleur ");
        West.add(jLabel4);

        getContentPane().add(West, java.awt.BorderLayout.WEST);

        East.setLayout(new java.awt.GridLayout(4, 1));
        East.add(jTextField1);

        jLabel6.setText("20.0€");
        East.add(jLabel6);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        jButton1.setText("Choisir couleur");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);

        East.add(jPanel1);

        getContentPane().add(East, java.awt.BorderLayout.EAST);

        South.setLayout(new java.awt.GridLayout(1, 2));

        Annuler.setText("Annuler");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });
        South.add(Annuler);

        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });
        South.add(Valider);

        getContentPane().add(South, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        //une fois que l'utilisateur a cliqué sur valider
        j = new Joueur(); //on instancie le joueur
        j.setSolde(20.0); //on lui définit un solde de 20 
        j.setPseudo(jTextField1.getText()); //on lui définit son pseudo a partir de ce qu'a rentré l'utilisateur
        j.setCouleur(selectedColor); //on lui définit sa couleur a partir de celle qu'a choisi l'utilisateur
        validated = true; //l'utilisateur a bien validé l'ajout du nouveau joueur
        this.setVisible(false); //on masque la fenêtre
        this.dispose(); //on détruit la fenêtre
    }//GEN-LAST:event_ValiderActionPerformed
    
    
    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
        validated = false; //l'utilisateur n'a pas validé
        
        this.setVisible(false); //on masque la fenêtre
        this.dispose(); //on détruit la fenêtre
    }//GEN-LAST:event_AnnulerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //lorsque l'utilisateur clique sur choisir une couleur
        selectedColor = JColorChooser.showDialog(this, "Choississez la couleur", selectedColor);
        //on crée une fenêtre popup pour sélectionner la couleur qui sera stockée dans selectedColor.
        jPanel2.setBackground(selectedColor);
        //on définit la couleur de fond du jpanel a coté comme étant selectedColor.
    }//GEN-LAST:event_jButton1ActionPerformed
    public boolean getOk(){return validated;}
    public Joueur getJoueur(){return j;}
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JPanel East;
    private javax.swing.JPanel North;
    private javax.swing.JPanel South;
    private javax.swing.JButton Valider;
    private javax.swing.JPanel West;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
