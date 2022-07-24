/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.awt.BorderLayout;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import panneauEdition.VecteurEtatCalcination;
import panneauEdition.VecteurEtatClinkerisation;
import panneauEdition.VecteurEtatPreparerFarine;

/**
 *
 * @author MoubarakZoure
 */
public class EtatSystem extends javax.swing.JFrame {
        HashMap<String,String[]> composant_fonction=new HashMap<>();
        HashMap<String,String[]> fonction_defaillance=new HashMap<>();
        VecteurEtatCalcination etatCalcination=new VecteurEtatCalcination();
        VecteurEtatClinkerisation etatClikerisation=new VecteurEtatClinkerisation();
        VecteurEtatPreparerFarine etatfEtatPreparerFarine=new VecteurEtatPreparerFarine();
        DefaultEtatPane defaultEtatPane=new  DefaultEtatPane();
        
        public void initialiserComboBoxes(){
        composant_fonction.put("Préchauffeur à cyclone",new String[]{"Préparer la farine crue"});
        composant_fonction.put("Boite à fumée",new String[]{"Calcination de la farine"});
        composant_fonction.put("Four",new String[]{"Clinkérisation"});
        fonction_defaillance.put("Préparer la farine crue",new String[]{"Marche perturbé"});
        fonction_defaillance.put("Calcination de la farine",new String[]{"Déplacement de zone"});
        fonction_defaillance.put("Clinkérisation",new String[]{"Mauvaise Clinkérisation"});
         
        

        }
        
        public void etatPaneSelection(){
        
        String select_def=defaillance_slt.getSelectedItem().toString();
            vecteur_etat_pne.removeAll();
            System.out.println("qsdcc");
            switch (select_def) {
            case "Marche perturbé":
                vecteur_etat_pne.add(etatfEtatPreparerFarine);
                break;

            case "Déplacement de zone":
                vecteur_etat_pne.add(etatCalcination);
                break;

            case "Mauvaise Clinkérisation":
                vecteur_etat_pne.add(etatClikerisation);

                break;

            default:
                vecteur_etat_pne.add(defaultEtatPane);

                break;
        }
        pack();
        }

    /**
     * Creates new form EtatSystem
     */
    public EtatSystem() {
        initComponents();
        vecteur_etat_pne.setLayout(new BorderLayout());
        vecteur_etat_pne.add(etatfEtatPreparerFarine);
        initialiserComboBoxes();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        function_slt = new javax.swing.JComboBox();
        component_slt = new javax.swing.JComboBox();
        defaillance_slt = new javax.swing.JComboBox();
        vecteur_etat_pne = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Yu Mincho", 0, 18)); // NOI18N
        jLabel2.setText("Défaillance ");

        jLabel3.setFont(new java.awt.Font("Yu Mincho", 0, 18)); // NOI18N
        jLabel3.setText("Composant  ");

        jLabel4.setFont(new java.awt.Font("Yu Mincho", 0, 18)); // NOI18N
        jLabel4.setText("Fonction           ");

        function_slt.setFont(new java.awt.Font("Yu Mincho", 0, 18)); // NOI18N
        function_slt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Préparer la farine crue" }));
        function_slt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                function_sltItemStateChanged(evt);
            }
        });

        component_slt.setFont(new java.awt.Font("Yu Mincho", 0, 18)); // NOI18N
        component_slt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Préchauffeur à cyclone", "Boite à fumée", "Four" }));
        component_slt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                component_sltItemStateChanged(evt);
            }
        });
        component_slt.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                component_sltInputMethodTextChanged(evt);
            }
        });
        component_slt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                component_sltActionPerformed(evt);
            }
        });

        defaillance_slt.setFont(new java.awt.Font("Yu Mincho", 0, 18)); // NOI18N
        defaillance_slt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Marche perturbé" }));
        defaillance_slt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                defaillance_sltItemStateChanged(evt);
            }
        });
        defaillance_slt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaillance_sltActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(component_slt, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(defaillance_slt, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(function_slt, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(component_slt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(function_slt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defaillance_slt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        vecteur_etat_pne.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout vecteur_etat_pneLayout = new javax.swing.GroupLayout(vecteur_etat_pne);
        vecteur_etat_pne.setLayout(vecteur_etat_pneLayout);
        vecteur_etat_pneLayout.setHorizontalGroup(
            vecteur_etat_pneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        vecteur_etat_pneLayout.setVerticalGroup(
            vecteur_etat_pneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("TITUS Cyberbit Basic", 0, 18)); // NOI18N
        jButton1.setText("Diagnostiquer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vecteur_etat_pne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vecteur_etat_pne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void component_sltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_component_sltActionPerformed
     
      
    }//GEN-LAST:event_component_sltActionPerformed

    
    
    private void component_sltItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_component_sltItemStateChanged
                 String selected_comp=component_slt.getSelectedItem().toString();
                 String[] his_functions=composant_fonction.get(selected_comp);// his = composant
                 String his_first_function=his_functions[0];
                 String[] first_function_defs=fonction_defaillance.get(his_first_function); // his = first function
                 function_slt.setModel(new DefaultComboBoxModel(his_functions));
                 defaillance_slt.setModel(new DefaultComboBoxModel(first_function_defs));
                 etatPaneSelection();
                 ;
    }//GEN-LAST:event_component_sltItemStateChanged

    private void function_sltItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_function_sltItemStateChanged
                 
                String selected_function=function_slt.getSelectedItem().toString();
                String[] his_defs=fonction_defaillance.get(selected_function);
                defaillance_slt.setModel(new DefaultComboBoxModel(his_defs));
                etatPaneSelection();
    }//GEN-LAST:event_function_sltItemStateChanged

    private void defaillance_sltItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_defaillance_sltItemStateChanged
            etatPaneSelection();
    }//GEN-LAST:event_defaillance_sltItemStateChanged

    private void defaillance_sltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaillance_sltActionPerformed
        
    }//GEN-LAST:event_defaillance_sltActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                
        
        
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void component_sltInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_component_sltInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_component_sltInputMethodTextChanged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EtatSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EtatSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EtatSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EtatSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EtatSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox component_slt;
    private javax.swing.JComboBox defaillance_slt;
    private javax.swing.JComboBox function_slt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel vecteur_etat_pne;
    // End of variables declaration//GEN-END:variables
}