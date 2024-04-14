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
                this.y = Math.min(this.y + 1, yMaxValue);
                break;
            case 'S':
                this.y = Math.max(this.y - 1, 0);
                break;
            case 'E':
                this.x = Math.min(this.x + 1, xMaxValue);
                break;
            case 'W':
                this.x = Math.max(this.x - 1, 0);
                break;
        }
    }

    public void turnLeft() {
        this.direction = switch (this.direction) {
            case 'N' -> 'W';
            case 'S' -> 'E';
            case 'E' -> 'N';
            case 'W' -> 'S';
            default -> this.direction;
        };
    }

    public void turnRight() {
        this.direction = switch (this.direction) {
            case 'N' -> 'E';
            case 'S' -> 'W';
            case 'E' -> 'S';
            case 'W' -> 'N';
            default -> this.direction;
        };
    }
}
