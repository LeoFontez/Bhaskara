package br.bhaskara;

import java.util.Scanner;

public class Bhaskara {

    private float a;
    private float b;
    private float c;
    private float delta;
    private float x;
    
    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getDelta() {
        return delta;
    }

    public void setDelta(float delta) {
        this.delta = delta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public double calcularDelta(){
        
        delta = (b*b) - 4 * a * c;
        valorX();
        return delta;
    }
   
    public float valorX(){
        float x1,x2;
        
        x1 = (float) (-b + Math.sqrt(delta) / (2 * a));
        x2 = (float) (-b - Math.sqrt(delta) / (2 * a));
        
                return x;
    }

   /* public double x2(){
        x =((-b - Math.sqrt(delta))/ (2 * a));
        return x;
    }*/
}