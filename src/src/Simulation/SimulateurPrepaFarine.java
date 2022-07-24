/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.Simulation;

import java.util.Timer;
import java.util.TimerTask;
import src.VarEtatPrepaFarine;

/**
 *
 * @author MoubarakZoure
 */
public class SimulateurPrepaFarine {

    private double COC_1, A50T1_1, A52T1_1, A52P2_1, A53T1_1,
            A53T2_1, A54T1_1, A54T2_1;// vecteurs à l'instant T1
    private double COC_2, A50T1_2, A52T1_2, A52P2_2, A53T1_2,
            A53T2_2, A54T1_2, A54T2_2;// vecteurs à l'instant T2
    private double X_COC, X_A50T1, X_A52T1, X_A52P2, X_A53T1,
            X_A53T2, X_A54T1, X_A54T2;// delta

    Timer timer = new Timer();
    int t = 0;

    public void startSimulation() {

        TimerTask timerTask = new TimerTask() {

            @Override
            public void run() {
                COC_1 = COC_2;
                A50T1_1 = A50T1_2;
                A52T1_1 = A52T1_2;
                A52P2_1 = A52P2_2;
                A53T1_1 = A53T1_2;
                A53T2_1 = A53T2_2;
                A54T1_1 = A54T1_2;
                A54T2_1 = A54T2_2;

                COC_2 = ValGen.gen_COC();
                A50T1_2 = ValGen.gen_A50T1();
                A52T1_2 = ValGen.gen_A52T1();
                A52P2_2 = ValGen.gen_A52P2();
                A53T1_2 = ValGen.gen_A53T1();
                A53T2_2 = ValGen.gen_A53T2();
                A54T1_2 = ValGen.gen_A54T1();
                A54T2_2 = ValGen.gen_A54T2();
                System.out.println("t=" + (t) + "ms : " + SimulateurPrepaFarine.this.toString());
                t = t + 5;

            }
        };

        timer.schedule(timerTask, 0, 5);

    }

    public VarEtatPrepaFarine extractVarEtat() {
        X_COC = COC_2 - COC_1;
        X_A50T1 = A50T1_2 - A50T1_1;
        X_A52T1 = A52T1_2 - A52T1_1;
        X_A52P2 = A52P2_2 - A52P2_1;
        X_A53T1 = A53T1_2 - A53T1_1;
        X_A53T2 = A53T2_2 - A53T2_1;
        X_A54T1 = A54T1_2 - A54T1_1;
        X_A54T2 = A54T2_2 - A54T2_1;

        return new VarEtatPrepaFarine(X_COC, X_A50T1, X_A52T1, X_A52P2, X_A53T1, X_A53T2, X_A54T1, X_A54T2);
        
    }

    @Override
    public String toString() {
        return "SimulateurPrepaFarine{" + "COC_1=" + COC_1 + ", A50T1_1=" + A50T1_1 + ", A52T1_1=" + A52T1_1 + ", A52P2_1=" + A52P2_1 + ", A53T1_1=" + A53T1_1 + ", A53T2_1=" + A53T2_1 + ", A54T1_1=" + A54T1_1 + ", A54T2_1=" + A54T2_1 + ", COC_2=" + COC_2 + ", A50T1_2=" + A50T1_2 + ", A52T1_2=" + A52T1_2 + ", A52P2_2=" + A52P2_2 + ", A53T1_2=" + A53T1_2 + ", A53T2_2=" + A53T2_2 + ", A54T1_2=" + A54T1_2 + ", A54T2_2=" + A54T2_2 + ", X_COC_1=" + X_COC + ", X_A50T1_1=" + X_A50T1 + ", X_A52T1_1=" + X_A52T1 + ", X_A52P2_1=" + X_A52P2 + ", X_A53T1_1=" + X_A53T1 + ", X_A53T2_1=" + X_A53T2+ ", X_A54T1_1=" + X_A54T1 + ", X_A54T2_1=" + X_A54T2 + ", timer=" + timer + '}';
    }

    public static void main(String[] args) {
        new SimulateurPrepaFarine().startSimulation();
    }
}
