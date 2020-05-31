package com.mera.lection5.ex1;

public abstract class Figure {
    protected int x, y;


    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figure() {
        x = 0;
        y = 0;
    }

    enum Quadrant {
        I,
        II,
        III,
        IV,
        on_axis
    }

    public Quadrant getQuadrant(){
        if (this.y==0 || this.x==0){
            return Quadrant.on_axis;
        }
        if (this.y>0){
            if (this.x>0){
                return Quadrant.I;
            }
            else
                return Quadrant.II;
        }
        else{
            if (this.x>0){
                return Quadrant.IV;
            }
            else
                return Quadrant.III;
        }

    }

    public abstract double square();





}
