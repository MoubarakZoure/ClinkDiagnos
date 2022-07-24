/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panneauEdition;

import javax.swing.JFrame;

/**
 *
 * @author MoubarakZoure
 */
public interface PaneFieldsChecker {
    String emptyFld_msg="Veuillez remplir tous les champs car un des champs est vide !";
    String emptyFld_title="Champ vide !";
    
 
    
    public void checkAllFieldIsEdited(JFrame context);
    public void allowOnlyNumbers();
    
}
