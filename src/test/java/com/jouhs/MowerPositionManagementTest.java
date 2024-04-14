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
        assertThat(mowerPosition.getY()).isEqualTo(y-1);
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
        mowerPosition.turnTurnRight();
        assertThat(mowerPosition.getDirection()).isEqualTo('N');
    }

}