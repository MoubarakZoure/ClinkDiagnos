/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comWithProlog;

import Debobage.Debug;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import javax.swing.JFrame;
import org.jpl7.Atom;
import org.jpl7.Compound;
import org.jpl7.Float;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;
import src.EtatCalcination;
import src.EtatClinkerisation;
import src.EtatPrepaFarine;

/**
 *
 * @author MoubarakZoure
 */
public class ComWithPrologManager {

    public boolean isConnected = false;

    public String fileDir = "src/connaissances/diagnostic.pl";

    public boolean tryConnection() {
        String absolutePath;
        Path relative = Paths.get(fileDir);
        Path absolute = relative.toAbsolutePath();
        absolutePath = absolute.toString();

        Query q = new Query("consult", new Term[]{new Atom(absolutePath)});

        return q.hasSolution();

    }

    public Map<String, Term>[] senRequest(EtatPrepaFarine etat, JFrame this_frame) {

        if (tryConnection() == true) {
            Float O2C = new Float(etat.getO2C());
            Float COC = new Float(etat.getCOC());
            Float A50T1 = new Float(etat.getA50T1());
            Float A50P1 = new Float(etat.getA50P1());
            Float A52T1 = new Float(etat.getA52T1());
            Float A52P2 = new Float(etat.getA52P2());
            Float A53T1 = new Float(etat.getA53T1());
            Float A53T2 = new Float(etat.getA53T2());
            Float A53P1 = new Float(etat.getA53P1());
            Float A54T1 = new Float(etat.getA54T1());
            Float A54T2 = new Float(etat.getA54T2());
            Float A54P2 = new Float(etat.getA54P2());

            Float X_O2C = new Float(etat.getX_O2C());
            Float X_COC = new Float(etat.getX_COC());
            Float X_A50T1 = new Float(etat.getX_A50T1());
            Float X_A50P1 = new Float(etat.getX_A50P1());
            Float X_A52T1 = new Float(etat.getX_A52T1());
            Float X_A52P2 = new Float(etat.getX_A52P2());
            Float X_A53T1 = new Float(etat.getX_A53T1());
            Float X_A53T2 = new Float(etat.getX_A53T2());
            Float X_A53P1 = new Float(etat.getX_A53P1());
            Float X_A54T1 = new Float(etat.getX_A54T1());
            Float X_A54T2 = new Float(etat.getX_A54T2());
            Float X_A54P2 = new Float(etat.getX_A54P2());

            Atom def = new Atom("marche_perturbe"); // nom de la défaillances
            Variable X = new Variable("X");

            Term[] request_arqs = {O2C, COC, A50T1, A50P1, A52T1, A52P2, A53T1, A53T2, A53P1, A54T1,
                A54T2, A54P2, X_O2C, X_COC, X_A50T1, X_A50P1, X_A52T1, X_A52P2, X_A53T1, X_A53T2,
                X_A53P1, X_A54T1, X_A54T2, X_A54P2, def, X};
            String predicate_name = "preparer_farine";

            Compound predicate = new Compound(predicate_name, request_arqs);

            Query requete = new Query(predicate);

            return requete.allSolutions();
        } else {
            Debug.showConnectionErrorMessage(this_frame);
            return null;

        }

    }

    public Map<String, Term>[] senRequest(EtatCalcination etat, JFrame this_frame) {

        if (tryConnection() == true) {

            Float O2F = new Float(etat.getO2F());
            Float COP = new Float(etat.getCOP());
            Float W01P3 = new Float(etat.getW01P3());
            Float W01P1 = new Float(etat.getW01P1());
            Float W01T1 = new Float(etat.getW01T1());
            Float V31F1 = new Float(etat.getV31F1());

            Float X_O2F = new Float(etat.getX_O2F());
            Float X_COP = new Float(etat.getX_COP());
            Float X_W01P3 = new Float(etat.getX_W01P3());
            Float X_W01P1 = new Float(etat.getX_W01P1());
            Float X_W01T1 = new Float(etat.getX_W01T1());
            Float X_V31F1 = new Float(etat.getX_V31F1());

            Atom def = new Atom("deplacement_zone"); // nom de la défaillances
            Variable X = new Variable("X");

            Term[] request_arqs = {O2F, COP, W01P3, W01P1, W01T1, V31F1, X_O2F, X_COP,
                X_W01P3, X_W01P1, X_W01T1, X_V31F1,
                def, X};
            String predicate_name = "calcination_farine";

            Compound predicate = new Compound(predicate_name, request_arqs);

            Query requete = new Query(predicate);

            return requete.allSolutions();

        } else {

            Debug.showConnectionErrorMessage(this_frame);
            return null;

        }

    }

    public Map<String, Term>[] senRequest(EtatClinkerisation etat, JFrame this_frame) {
        if (tryConnection() == true) {
            Float V01F1 = new Float(etat.getV01F1());
            Float W01X1 = new Float(etat.getW01X1());
            Float W01S1 = new Float(etat.getW01S1());
            
            Float X_V01F1 = new Float(etat.getX_V01F1());
            Float X_W01X1 = new Float(etat.getX_W01X1());
            Float X_W01S1 = new Float(etat.getX_W01S1());
           
            
            Atom def = new Atom("mauvais_clinker"); // nom de la défaillances
            Variable X = new Variable("X");

            Term[] request_arqs = {V01F1,W01X1,W01S1,X_V01F1,X_W01X1,X_W01S1,def,X};
            String predicate_name = "clinkerisation";

            Compound predicate = new Compound(predicate_name, request_arqs);

            Query requete = new Query(predicate);

            return requete.allSolutions();

        } else {
            Debug.showConnectionErrorMessage(this_frame);
            return null;

        }

    }

    public static void main(String[] args) {
        ComWithPrologManager com = new ComWithPrologManager();
      EtatClinkerisation etat=new EtatClinkerisation(352,22000,10000,60, 10,20);
        Map<String, Term>[] m = com.senRequest(etat, null);
        for (Map<String, Term> x : m) {
            System.out.println(x.get(new Variable("X").toString()));

        }
    }

}
