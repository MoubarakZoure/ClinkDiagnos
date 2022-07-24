/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author MoubarakZoure
 */
public class DicoCauses {
    public   HashMap<String,String> dico=new HashMap<>();

    public HashMap<String, String> getDico() {
        return dico;
    }
    
    public DicoCauses(){
    dico.put("ten_o2c_H","elevation de la teneur en O2 au niveau de la sortie cyclone A50");
    dico.put("ten_o2c_B","chute de la teneur en O2 au niveau de la sortie cyclone A50");
    
    dico.put("ten_coc_HB","elevation brusque de la teneur en CO au niveau de la sortie cyclone A50");
    
    dico.put("temp_a50t1_HB","elevation brusque de la temperature du gaz au niveau de la sortie cyclone A50");
    
    dico.put("pression_a50p1_H","elevation  de la pression au niveau de la sortie cyclone A50");
    
    dico.put("temp_a52t1_HB","elevation brusque de la temperature du gaz au niveau de la sortie cyclone A52");
    dico.put("temp_a52t1_BB","chute brutale de la temperature du gaz au niveau de la sortie cyclone A52");
    
    dico.put("pression_a52p2_HB","elevation brutal  de la pression au niveau de la sortie cyclone A52");
    dico.put("pression_a52p2_BB","chute brutale de la pression au niveau de la sortie cyclone A52");
    
    dico.put("temp_a53t1_HB","elevation brusque de la temperature du gaz au niveau de la sortie cyclone A53");
    dico.put("temp_a53t1_BB","chute brutale de la temperature du gaz au niveau de la sortie cyclone A53");
    
    dico.put("temp_a53t2_HB","elevation brusque de la temperature de la matiere au niveau de la sortie cyclone A53");
    
    dico.put("pression_a53p1_H","elevation  de la pression au niveau de la sortie cyclone A53");
    dico.put("pression_a53p1_B","chute de la pression au niveau de la sortie cyclone A53");
    
    dico.put("temp_a54t1_HB","elevation brusque de la temperature du gaz au niveau de la sortie cyclone A54");
    dico.put("temp_a54t1_BB","chute brutale de la temperature du gaz au niveau de la sortie cyclone A54");
    
    dico.put("temp_a54t2_HB","elevation brusque de la temperature de la matiere au niveau de la sortie cyclone A54");
    
    dico.put("pression_a54p2_H","elevation  de la pression au niveau de la sortie cyclone A54");
    dico.put("pression_a54p2_B","chute de la pression au niveau de la sortie cyclone A54");
    
    dico.put("ten_o2f_H","elevation de la teneur en O2 de la boite a fumee");
    dico.put("ten_o2f_B","chute  de la teneur en O2 de la boite a fumee");
    
    dico.put("ten_cop_HB","elevation brusque de la teneur en CO de la boite a fumee");
    dico.put("ten_cop_BB","chute brutale  de la teneur en CO de la boite a fumee");
    
    dico.put("pression_w01p3_H","elevation  de la pression au niveau de la sortie de la boite a fumee");
    dico.put("pression_w01p3_B","chute de la pression au niveau de la sortie de la boite a fumee");
    
    dico.put("pression_w01p1_H","elevation  de la pression au niveau de l'entree de la boite a fumee");
    dico.put("pression_w01p1_B","chute de la pression au niveau de l'entree  de la boite a fumee");
    
    dico.put("temp_w01t1_HB","elevation brusque de la temperature du gaz au niveau de l'entree de la boite a fumee");
    dico.put("temp_w01t1_BB","chute brutale de la temperature du gaz au niveau de l'entree de la boite a fumee");
    
    dico.put("debit_v31f1_H","elevation du debit du gaz au niveau de la boite a fumee");
    dico.put("debit_v31f1_B","chute du debit du gaz au niveau de la boite a fumee");
    
    dico.put("debit_v01f1_H","elevation du debit du gaz au niveau du four");
    dico.put("debit_v01f1_B","chute du debit du gaz au niveau du four");
    
    dico.put("debit_w01x1_HB","elevation brusque du moment du four");
    dico.put("debit_w01x1_BB","chute brutale du moment du four");
    
    dico.put("debit_w01s1_HB","elevation brusque de la vitesse du four");
    dico.put("debit_w01s1_BB","chute brutale de la vitesse du four");
   
    }
    
    
    public static void main(String[] args) 
    {
        DicoCauses dic=new DicoCauses();
        System.out.println();
        Set cles=dic.getDico().keySet();
        Iterator it=cles.iterator();
        
        while(it.hasNext()){
            String cle=it.next().toString();
            System.out.println(cle+"-->"+dic.getDico().get(cle));
        
        }
        
        
   
        
    }
}
