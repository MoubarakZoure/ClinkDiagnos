/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

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

    public double getW01X1_1() {
        return W01X1_1;
    }

    public void setW01X1_1(double W01X1_1) {
        this.W01X1_1 = W01X1_1;
    }

    public double getW01S1_1() {
        return W01S1_1;
    }

    public void setW01S1_1(double W01S1_1) {
        this.W01S1_1 = W01S1_1;
    }

    public double getW01X1_2() {
        return W01X1_2;
    }

    public void setW01X1_2(double W01X1_2) {
        this.W01X1_2 = W01X1_2;
    }

    public double getW01S1_2() {
        return W01S1_2;
    }

    public void setW01S1_2(double W01S1_2) {
        this.W01S1_2 = W01S1_2;
    }

    public double getX_W01X1() {
        return X_W01X1;
    }

    public void setX_W01X1(double X_W01X1) {
        this.X_W01X1 = X_W01X1;
    }

    public double getX_W01S1() {
        return X_W01S1;
    }

    public void setX_W01S1(double X_W01S1) {
        this.X_W01S1 = X_W01S1;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
    
    
    
}
