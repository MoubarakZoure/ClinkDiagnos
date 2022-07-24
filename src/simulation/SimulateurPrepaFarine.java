/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

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
    public static void main(String[] args) {
        new SimulateurPrepaFarine().startSimulation();
    }

    @Override
    public String toString() {
        return "SimulateurPrepaFarine{" + "COC_1=" + COC_1 + ", A50T1_1=" + A50T1_1 + ", A52T1_1=" + A52T1_1 + ", A52P2_1=" + A52P2_1 + ", A53T1_1=" + A53T1_1 + ", A53T2_1=" + A53T2_1 + ", A54T1_1=" + A54T1_1 + ", A54T2_1=" + A54T2_1 + ", COC_2=" + COC_2 + ", A50T1_2=" + A50T1_2 + ", A52T1_2=" + A52T1_2 + ", A52P2_2=" + A52P2_2 + ", A53T1_2=" + A53T1_2 + ", A53T2_2=" + A53T2_2 + ", A54T1_2=" + A54T1_2 + ", A54T2_2=" + A54T2_2 + ", X_COC_1=" + X_COC + ", X_A50T1_1=" + X_A50T1 + ", X_A52T1_1=" + X_A52T1 + ", X_A52P2_1=" + X_A52P2 + ", X_A53T1_1=" + X_A53T1 + ", X_A53T2_1=" + X_A53T2+ ", X_A54T1_1=" + X_A54T1 + ", X_A54T2_1=" + X_A54T2 + ", timer=" + timer + '}';
    }

    

    public double getCOC_1() {
        return COC_1;
    }

    public void setCOC_1(double COC_1) {
        this.COC_1 = COC_1;
    }

    public double getA50T1_1() {
        return A50T1_1;
    }

    public void setA50T1_1(double A50T1_1) {
        this.A50T1_1 = A50T1_1;
    }

    public double getA52T1_1() {
        return A52T1_1;
    }

    public void setA52T1_1(double A52T1_1) {
        this.A52T1_1 = A52T1_1;
    }

    public double getA52P2_1() {
        return A52P2_1;
    }

    public void setA52P2_1(double A52P2_1) {
        this.A52P2_1 = A52P2_1;
    }

    public double getA53T1_1() {
        return A53T1_1;
    }

    public void setA53T1_1(double A53T1_1) {
        this.A53T1_1 = A53T1_1;
    }

    public double getA53T2_1() {
        return A53T2_1;
    }

    public void setA53T2_1(double A53T2_1) {
        this.A53T2_1 = A53T2_1;
    }

    public double getA54T1_1() {
        return A54T1_1;
    }

    public void setA54T1_1(double A54T1_1) {
        this.A54T1_1 = A54T1_1;
    }

    public double getA54T2_1() {
        return A54T2_1;
    }

    public void setA54T2_1(double A54T2_1) {
        this.A54T2_1 = A54T2_1;
    }

    public double getCOC_2() {
        return COC_2;
    }

    public void setCOC_2(double COC_2) {
        this.COC_2 = COC_2;
    }

    public double getA50T1_2() {
        return A50T1_2;
    }

    public void setA50T1_2(double A50T1_2) {
        this.A50T1_2 = A50T1_2;
    }

    public double getA52T1_2() {
        return A52T1_2;
    }

    public void setA52T1_2(double A52T1_2) {
        this.A52T1_2 = A52T1_2;
    }

    public double getA52P2_2() {
        return A52P2_2;
    }

    public void setA52P2_2(double A52P2_2) {
        this.A52P2_2 = A52P2_2;
    }

    public double getA53T1_2() {
        return A53T1_2;
    }

    public void setA53T1_2(double A53T1_2) {
        this.A53T1_2 = A53T1_2;
    }

    public double getA53T2_2() {
        return A53T2_2;
    }

    public void setA53T2_2(double A53T2_2) {
        this.A53T2_2 = A53T2_2;
    }

    public double getA54T1_2() {
        return A54T1_2;
    }

    public void setA54T1_2(double A54T1_2) {
        this.A54T1_2 = A54T1_2;
    }

    public double getA54T2_2() {
        return A54T2_2;
    }

    public void setA54T2_2(double A54T2_2) {
        this.A54T2_2 = A54T2_2;
    }

    public double getX_COC() {
        return X_COC;
    }

    public void setX_COC(double X_COC) {
        this.X_COC = X_COC;
    }

    public double getX_A50T1() {
        return X_A50T1;
    }

    public void setX_A50T1(double X_A50T1) {
        this.X_A50T1 = X_A50T1;
    }

    public double getX_A52T1() {
        return X_A52T1;
    }

    public void setX_A52T1(double X_A52T1) {
        this.X_A52T1 = X_A52T1;
    }

    public double getX_A52P2() {
        return X_A52P2;
    }

    public void setX_A52P2(double X_A52P2) {
        this.X_A52P2 = X_A52P2;
    }

    public double getX_A53T1() {
        return X_A53T1;
    }

    public void setX_A53T1(double X_A53T1) {
        this.X_A53T1 = X_A53T1;
    }

    public double getX_A53T2() {
        return X_A53T2;
    }

    public void setX_A53T2(double X_A53T2) {
        this.X_A53T2 = X_A53T2;
    }

    public double getX_A54T1() {
        return X_A54T1;
    }

    public void setX_A54T1(double X_A54T1) {
        this.X_A54T1 = X_A54T1;
    }

    public double getX_A54T2() {
        return X_A54T2;
    }

    public void setX_A54T2(double X_A54T2) {
        this.X_A54T2 = X_A54T2;
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
