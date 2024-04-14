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

    public String getCurrentMowerPosition() {
        return x + " " + y + " " + direction;
    }
    
    public void move(int xMaxValue, int yMaxValue) {
        switch (this.direction) {
            case 'N':
                if (this.y < yMaxValue)
                    this.y ++;
                break;
            case 'S':
                if (this.y > 0)
                    this.y --;
                break;
            case 'E':
                if (this.x < xMaxValue)
                    this.x ++;
                break;
            case 'W':
                if (this.x > 0)
                    this.x --;
                break;
        }
    }

    public void turnLeft() {
        switch (this.direction) {
            case 'N':
                this.direction = 'W';
                break;
            case 'S':
                this.direction = 'E';
                break;
            case 'E':
                this.direction = 'N';
                break;
            case 'W':
                this.direction = 'S';
                break;
        }
    }

    public void turnTurnRight() {
        switch (this.direction) {
            case 'N':
                this.direction = 'E';
                break;
            case 'S':
                this.direction = 'W';
                break;
            case 'E':
                this.direction = 'S';
                break;
            case 'W':
                this.direction = 'N';
                break;
        }
    }
}
