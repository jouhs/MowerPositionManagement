package com.jouhs;

import com.jouhs.model.MowerPosition;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
class MowerPositionManagementTest {

    @Test
    public void testMoveNorth() {
        int x = 1, y = 1;
        char direction = 'N';
        MowerPosition mowerPosition = new MowerPosition(x,y, direction);
        mowerPosition.move();
        assertThat(mowerPosition.getY()).isEqualTo(y-1);
        assertThat(mowerPosition.getDirection()).isEqualTo('N');
    }

    @Test
    public void testMoveSouth() {
        int x = 1, y = 1;
        char direction = 'S';
        MowerPosition mowerPosition = new MowerPosition(x,y, direction);
        mowerPosition.move();
        assertThat(mowerPosition.getY()).isEqualTo(y-1);
        assertThat(mowerPosition.getDirection()).isEqualTo('S');
    }

    @Test
    public void testMoveEast() {
        int x = 1, y = 1;
        char direction = 'E';
        MowerPosition mowerPosition = new MowerPosition(x,y, direction);
        mowerPosition.move();
        assertThat(mowerPosition.getX()).isEqualTo(x+1);
        assertThat(mowerPosition.getDirection()).isEqualTo('E');
    }

    @Test
    public void testMoveWest() {
        int x = 1, y = 1;
        char direction = 'W';
        MowerPosition mowerPosition = new MowerPosition(x,y, direction);
        mowerPosition.move();
        assertThat(mowerPosition.getX()).isEqualTo(x-1);
        assertThat(mowerPosition.getDirection()).isEqualTo('S');
    }

    @Test
    public void testTurnLeft() {
        int x = 1, y = 1;
        char direction = 'W';
        MowerPosition mowerPosition = new MowerPosition(x,y, direction);
        mowerPosition.turnLeft();
        assertThat(mowerPosition.getDirection()).isEqualTo('S');
    }

}