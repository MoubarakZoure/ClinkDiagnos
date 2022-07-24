/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.Simulation;

import java.util.Timer;
import java.util.TimerTask;
import src.VarEtatClinkerisation;

/**
 *
 * @author MoubarakZoure
 */
public class SimulateurClinkerisation {

    private double W01X1_1, W01S1_1;// vecteurs à l'instant T1
    private double W01X1_2, W01S1_2;// vecteurs à l'instant T2
    private double X_W01X1, X_W01S1;// delta

    Timer timer = new Timer();
    int t = 0;

    public void startSimulation() {

        TimerTask timerTask = new TimerTask() {

            @Override
            public void run() {
                W01X1_1 = W01X1_2;
                W01S1_1 = W01S1_2;
                W01X1_2 = ValGen.gen_W01X1();
                W01S1_2 = ValGen.gen_W01S1();
                System.out.println("t=" + (t) + "ms : " + SimulateurClinkerisation.this.toString());
                t = t + 5;

            }
        };

        timer.schedule(timerTask, 0, 5);

    }

    public VarEtatClinkerisation extractVarEtat() {
        X_W01S1 = W01S1_2 - W01S1_1;
        X_W01X1 = W01X1_2 - W01X1_1;
        return new VarEtatClinkerisation(X_W01X1, X_W01S1);

    }
    

    @Override
    public String toString() {
        return "SimulateurClinkerisation{" + "W01X1_1=" + W01X1_1 + ", W01S1_1=" + W01S1_1 + ", W01X1_2=" + W01X1_2 + ", W01S1_2=" + W01S1_2 + ", X_W01X1=" + X_W01X1 + ", X_W01S1=" + X_W01S1 + '}';
    }

    public static void main(String[] args) {
        new SimulateurClinkerisation().startSimulation();
    }
}
