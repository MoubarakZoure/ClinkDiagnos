/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import src.EtatClinkerisation;
import src.Simulation.SimulateurClinkerisation;
import src.formattageChamps.FormateurNombre;

/**
 *
 * @author MoubarakZoure
 */
public class VecteurEtatClinkerisation extends javax.swing.JPanel implements PaneFieldsChecker {
    
    SimulateurClinkerisation simulateur=new SimulateurClinkerisation();

    /**
     * Creates new form VecteurEtatPreparerFarine
     */
    public VecteurEtatClinkerisation() {
        initComponents();
        allowOnlyNumbers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        v01f1_fld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        w01x1_fld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        w01s1_fld = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Yu Mincho", 0, 13)); // NOI18N
        jLabel1.setText("Débit gaz Four");

        v01f1_fld.setFont(new java.awt.Font("Yu Mincho", 0, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Mincho", 0, 13)); // NOI18N
        jLabel2.setText("Moment Four");

        w01x1_fld.setFont(new java.awt.Font("Yu Mincho", 0, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Yu Mincho", 0, 13)); // NOI18N
        jLabel3.setText("Vitesse Four");

        w01s1_fld.setFont(new java.awt.Font("Yu Mincho", 0, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(v01f1_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(w01s1_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(w01x1_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v01f1_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w01s1_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w01x1_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField v01f1_fld;
    private javax.swing.JTextField w01s1_fld;
    private javax.swing.JTextField w01x1_fld;
    // End of variables declaration//GEN-END:variables

    public EtatClinkerisation extractStateVector() {
        EtatClinkerisation etat = new EtatClinkerisation();
        
        etat.setV01F1(Double.parseDouble(v01f1_fld.getText()));
        etat.setW01S1(Double.parseDouble(w01s1_fld.getText()));
        etat.setW01X1(Double.parseDouble(w01x1_fld.getText()));
        
        etat.setX_V01F1(0);
        etat.setX_W01S1(simulateur.getX_W01S1());
        etat.setX_W01X1(simulateur.getX_W01X1());
        
        return etat;
        
    }
    
    @Override
    public void checkAllFieldIsEdited(JFrame context) {
        JTextField[] textFields = {v01f1_fld, w01s1_fld, w01x1_fld};
        if (isOneFieldEmpty(textFields)) {
            JOptionPane.showMessageDialog(context, PaneFieldsChecker.emptyFld_msg, PaneFieldsChecker.emptyFld_title, JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    public boolean isOneFieldEmpty(JTextField[] textFields) {
        for (JTextField field : textFields) {
            if (field.getText().equals("")) {
                return true;
            }
        }
        
        return false;
        
    }
    
    @Override
    public void allowOnlyNumbers() {
        JTextField[] textFields = {v01f1_fld, w01s1_fld, w01x1_fld};
        for (JTextField field : textFields) {
            new FormateurNombre().formatter(field);
            
        }
        
    }
}
