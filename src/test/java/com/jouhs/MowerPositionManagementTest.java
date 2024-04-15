package com.jouhs;

import com.jouhs.model.MowerPosition;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
class MowerPositionManagementTest {

    @Test
    public void testMoveNorth() {
        int xMaxValue = 5, yMaxValue = 5;
        int x = 1, y = 1;
        char direction = 'N';
        MowerPosition mowerPosition = new MowerPosition(x,y, direction);
        mowerPosition.move(xMaxValue, yMaxValue);
        assertThat(mowerPosition.getY()).isEqualTo(y+1);
        assertThat(mowerPosition.getDirection()).isEqualTo('N');
    }

    @Test
    public void testMoveSouth() {
        int xMaxValue = 5, yMaxValue = 5;
        int x = 1, y = 1;
        char direction = 'S';
        MowerPosition mowerPosition = new MowerPosition(x,y, direction);
        mowerPosition.move(xMaxValue, yMaxValue);
        assertThat(mowerPosition.getY()).isEqualTo(y-1);
        assertThat(mowerPosition.getDirection()).isEqualTo('S');
    }

    @Test
    public void testMoveEast() {
        int xMaxValue = 5, yMaxValue = 5;
        int x = 1, y = 1;
        char direction = 'E';
        MowerPosition mowerPosition = new MowerPosition(x,y, direction);
        mowerPosition.move(xMaxValue, yMaxValue);
        assertThat(mowerPosition.getX()).isEqualTo(x+1);
        assertThat(mowerPosition.getDirection()).isEqualTo('E');
    }

    @Test
    public void testMoveWest() {
        int xMaxValue = 5, yMaxValue = 5;
        int x = 1, y = 1;
        char direction = 'W';
        MowerPosition mowerPosition = new MowerPosition(x,y, direction);
        mowerPosition.move(xMaxValue, yMaxValue);
        assertThat(mowerPosition.getX()).isEqualTo(x-1);
        assertThat(mowerPosition.getDirection()).isEqualTo('W');
    }

    @Test
    public void testTurnLeft() {
        int x = 1, y = 1;
        char direction = 'W';
        MowerPosition mowerPosition = new MowerPosition(x,y, direction);
        mowerPosition.turnLeft();
        assertThat(mowerPosition.getDirection()).isEqualTo('S');
    }

    @Test
    public void testTurnRight() {
        int x = 1, y = 1;
        char direction = 'W';
        MowerPosition mowerPosition = new MowerPosition(x,y, direction);
        mowerPosition.turnRight();
        assertThat(mowerPosition.getDirection()).isEqualTo('N');
    }

    @Test
    public void testExtremeCases() {
        int xMaxValue = 5, yMaxValue = 5;
        int x = 1, y = 0;
        char direction = 'S';
        MowerPosition mowerPosition = new MowerPosition(x,y, direction);
        mowerPosition.move(xMaxValue, yMaxValue);
        assertThat(mowerPosition.getCurrentMowerPosition()).isEqualTo("1 0 S");

        x = 0;
        direction = 'W';
        mowerPosition = new MowerPosition(x,y, direction);
        mowerPosition.move(xMaxValue, yMaxValue);
        assertThat(mowerPosition.getCurrentMowerPosition()).isEqualTo("0 0 W");

        y = yMaxValue;
        direction = 'N';
        mowerPosition = new MowerPosition(x,y, direction);
        mowerPosition.move(xMaxValue, yMaxValue);
        assertThat(mowerPosition.getCurrentMowerPosition()).isEqualTo("0 5 N");

        x = xMaxValue;
        direction = 'E';
        mowerPosition = new MowerPosition(x,y, direction);
        mowerPosition.move(xMaxValue, yMaxValue);
        assertThat(mowerPosition.getCurrentMowerPosition()).isEqualTo("5 5 E");

    }

}