package com.jouhs.model;

public class MowerPosition {
    private int x;
    private int y;
    private char direction;

    public MowerPosition(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
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

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public void move() {
        if (this.direction == 'N')
            this.y ++;
        else if (this.direction == 'S') {
            this.y --;
        }
    }
}
