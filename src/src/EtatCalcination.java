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
public class EtatCalcination {
      private double O2F,COP,W01P3,W01P1,W01T1,V31F1,
		     X_O2F,X_COP,X_W01P3,X_W01P1,X_W01T1,
                     X_V31F1;

    public EtatCalcination(double O2F, double COP, double W01P3, double W01P1, double W01T1, double V31F1, double X_O2F, double X_COP_, double X_W01P3, double X_W01P1, double X_W01T1, double X_V31F1) {
        this.O2F = O2F;
        this.COP = COP;
        this.W01P3 = W01P3;
        this.W01P1 = W01P1;
        this.W01T1 = W01T1;
        this.V31F1 = V31F1;
        this.X_O2F = X_O2F;
        this.X_COP = X_COP_;
        this.X_W01P3 = X_W01P3;
        this.X_W01P1 = X_W01P1;
        this.X_W01T1 = X_W01T1;
        this.X_V31F1 = X_V31F1;
    }

    public double getO2F() {
        return O2F;
    }

    public void setO2F(double O2F) {
        this.O2F = O2F;
    }

    public double getCOP() {
        return COP;
    }

    public void setCOP(double COP) {
        this.COP = COP;
    }

    public double getW01P3() {
        return W01P3;
    }

    public void setW01P3(double W01P3) {
        this.W01P3 = W01P3;
    }

    public double getW01P1() {
        return W01P1;
    }

    public void setW01P1(double W01P1) {
        this.W01P1 = W01P1;
    }

    public double getW01T1() {
        return W01T1;
    }

    public void setW01T1(double W01T1) {
        this.W01T1 = W01T1;
    }

    public double getV31F1() {
        return V31F1;
    }

    public void setV31F1(double V31F1) {
        this.V31F1 = V31F1;
    }

    public double getX_O2F() {
        return X_O2F;
    }

    public void setX_O2F(double X_O2F) {
        this.X_O2F = X_O2F;
    }

    public double getX_COP() {
        return X_COP;
    }

    public void setX_COP(double X_COP_) {
        this.X_COP = X_COP_;
    }

    public double getX_W01P3() {
        return X_W01P3;
    }

    public void setX_W01P3(double X_W01P3) {
        this.X_W01P3 = X_W01P3;
    }

    public double getX_W01P1() {
        return X_W01P1;
    }

    public void setX_W01P1(double X_W01P1) {
        this.X_W01P1 = X_W01P1;
    }

    public double getX_W01T1() {
        return X_W01T1;
    }

    public void setX_W01T1(double X_W01T1) {
        this.X_W01T1 = X_W01T1;
    }

    public double getX_V31F1() {
        return X_V31F1;
    }

    public void setX_V31F1(double X_V31F1) {
        this.X_V31F1 = X_V31F1;
    }

    public EtatCalcination() {
    }

    @Override
    public String toString() {
        return "EtatCalcination{" + "O2F=" + O2F + ", COP=" + COP + ", W01P3=" + W01P3 + ", W01P1=" + W01P1 + ", W01T1=" + W01T1 + ", V31F1=" + V31F1 + ", X_O2F=" + X_O2F + ", X_COP=" + X_COP + ", X_W01P3=" + X_W01P3 + ", X_W01P1=" + X_W01P1 + ", X_W01T1=" + X_W01T1 + ", X_V31F1=" + X_V31F1 + '}';
    }
      
    
    
    
      
    
    
}
