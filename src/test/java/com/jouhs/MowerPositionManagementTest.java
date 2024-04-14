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
        assertThat(mowerPosition.getY()).isEqualTo(y+1);
        assertThat(mowerPosition.getDirection()).isEqualTo('N');
    }

}