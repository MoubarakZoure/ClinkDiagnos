/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author MoubarakZoure
 */
public class EtatClinkerisation {
    private double V01F1,W01X1,W01S1,X_V01F1,X_W01X1,X_W01S1;

    public EtatClinkerisation(double V01F1, double W01X1, double W01S1, double X_V01F1, double X_W01X1, double X_W01S1) {
        this.V01F1 = V01F1;
        this.W01X1 = W01X1;
        this.W01S1 = W01S1;
        this.X_V01F1 = X_V01F1;
        this.X_W01X1 = X_W01X1;
        this.X_W01S1 = X_W01S1;
    }

    public double getV01F1() {
        return V01F1;
    }

    public void setV01F1(double V01F1) {
        this.V01F1 = V01F1;
    }

    public double getW01X1() {
        return W01X1;
    }

    public void setW01X1(double W01X1) {
        this.W01X1 = W01X1;
    }

    public double getW01S1() {
        return W01S1;
    }

    public void setW01S1(double W01S1) {
        this.W01S1 = W01S1;
    }

    public double getX_V01F1() {
        return X_V01F1;
    }

    public void setX_V01F1(double X_V01F1) {
        this.X_V01F1 = X_V01F1;
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

    public EtatClinkerisation() {
    }
    
    
    
}
