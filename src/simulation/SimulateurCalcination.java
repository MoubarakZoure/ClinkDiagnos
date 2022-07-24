/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

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

    public double getCOP_1() {
        return COP_1;
    }

    public void setCOP_1(double COP_1) {
        this.COP_1 = COP_1;
    }

    public double getW01T1_1() {
        return W01T1_1;
    }

    public void setW01T1_1(double W01T1_1) {
        this.W01T1_1 = W01T1_1;
    }

    public double getCOP_2() {
        return COP_2;
    }

    public void setCOP_2(double COP_2) {
        this.COP_2 = COP_2;
    }

    public double getW01T1_2() {
        return W01T1_2;
    }

    public void setW01T1_2(double W01T1_2) {
        this.W01T1_2 = W01T1_2;
    }

    public double getX_COP() {
        return X_COP;
    }

    public void setX_COP(double X_COP) {
        this.X_COP = X_COP;
    }

    public double getX_W01T1() {
        return X_W01T1;
    }

    public void setX_W01T1(double X_W01T1) {
        this.X_W01T1 = X_W01T1;
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
