package br.bhaskara;

import java.util.Scanner;

public class Bhaskara {

    private int a;
    private int b;
    private int c;
    private double delta;
    private double x1;
    private double x2;
 
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double calcularDelta(){
        delta = (b*b) - 4 * a * c;
        if(delta >= 0){
            calcularRaizes();
            
        }
        return delta;
    }
    
    public void calcularRaizes(){
        x1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
        x2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a); 
    }
}