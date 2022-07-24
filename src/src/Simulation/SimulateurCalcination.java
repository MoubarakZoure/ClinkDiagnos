/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.Simulation;

import java.util.Timer;
import java.util.TimerTask;
import src.VarEtatCalcination;

/**
 *
 * @author MoubarakZoure
 */
public class SimulateurCalcination {

    private double COP_1, W01T1_1;// vecteurs à l'instant T1
    private double COP_2, W01T1_2;// vecteurs à l'instant T2
    private double X_COP, X_W01T1;// delta

    Timer timer = new Timer();
    int t = 0;

    public void startSimulation() {

        TimerTask timerTask = new TimerTask() {

            @Override
            public void run() {

                COP_1 = COP_2;
                W01T1_1 = W01T1_2;

                COP_2 = ValGen.gen_COP();
                W01T1_2 = ValGen.gen_W01T1();

                System.out.println("t=" + (t) + "ms : " + SimulateurCalcination.this.toString());
                t = t + 5;

            }
        };

        timer.schedule(timerTask, 0, 5);

    }

    public VarEtatCalcination extractVarEtat() {
        X_COP = COP_2 - COP_1;
        X_W01T1 = W01T1_2 - W01T1_1;

        return new VarEtatCalcination(X_COP, X_W01T1);

    }

    @Override
    public String toString() {
        return "SimulateurCalcination{" + "COP_1=" + COP_1 + ", W01T1_1=" + W01T1_1 + ", COP_2=" + COP_2 + ", W01T1_2=" + W01T1_2 + ", X_COP=" + X_COP + ", X_W01T1=" + X_W01T1 + '}';
    }

    public static void main(String[] args) {
        new SimulateurCalcination().startSimulation();
    }
}
