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
        switch (this.direction) {
            case 'N':
                this.y ++;
                break;
            case 'S':
                this.y --;
                break;
            case 'E':
                this.x ++;
                break;
            case 'W':
                this.x --;
                break;
        }
    }

    public void turnLeft() {
    }
}
