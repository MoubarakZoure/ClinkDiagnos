/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.Simulation;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author MoubarakZoure
 */
public class ValGen {

    public static double gen_COC() {
        double minVal = 10;
        double maxVal = 20;
        return randomValBetween(minVal, maxVal);
    }

    public static  double gen_A50T1() {
        double minVal = 320;
        double maxVal = 450;
        return randomValBetween(minVal, maxVal);

    }

    public static  double gen_A52T1() {
        double minVal = 0;
        double maxVal = 1;
        return randomValBetween(minVal, maxVal);

    }

    public static  double gen_A52P2() {
        double minVal = 0;
        double maxVal = 1;
        return randomValBetween(minVal, maxVal);

    }

    public static  double gen_A53T1() {
        double minVal = 0;
        double maxVal = 1;
        return randomValBetween(minVal, maxVal);

    }

    public static  double gen_A53T2() {
        double minVal = 0;
        double maxVal = 1;
        return randomValBetween(minVal, maxVal);

    }

    public static  double gen_A54T1() {
        double minVal = 0;
        double maxVal = 1;
        return randomValBetween(minVal, maxVal);

    }

    public static  double gen_A54T2() {
        double minVal = 0;
        double maxVal = 1;
        return randomValBetween(minVal, maxVal);

    }

    public static  double gen_COP() {
        double minVal = 0;
        double maxVal = 1;
        return randomValBetween(minVal, maxVal);

    }

    public static  double gen_W01T1() {
        double minVal = 0;
        double maxVal = 1;
        return randomValBetween(minVal, maxVal);

    }

    public static  double gen_W01X1() {
        double minVal = 0;
        double maxVal = 1;
        return randomValBetween(minVal, maxVal);

    }

    public static  double gen_W01S1() {
        double minVal = 0;
        double maxVal = 1;
        return randomValBetween(minVal, maxVal);

    }

    public static double randomValBetween(double start, double end) {
        double val = ThreadLocalRandom.current().nextDouble(start, end);
        return val;

    }

}
