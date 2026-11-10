package com.nit.hk.arrays;

public class Example {

    private int x;
    private int y;

    public Example() {

    }

    public Example(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    //comment and uncomment above toString() method
    //to see the output difference in Test02 class
}