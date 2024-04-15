package com.jouhs.service;

import com.jouhs.model.MowerPosition;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MowerPositionServiceTest {
    /*
    The first scenario :
        5 5
        departure: 1 2 N
        actions: GAGAGAGAA
        destination: 1 3 N
    */
    @Test
    public void testExecuteActionsForTheFirstScenario() {
        int xMaxValue = 5, yMaxValue = 5;
        int x = 1, y = 2;
        char direction = 'N';
        String actions = "GAGAGAGAA";

        MowerPositionService mowerPositionService = new MowerPositionService();
        MowerPosition mowerPosition = mowerPositionService.executeActions(actions, x, y, direction, xMaxValue, yMaxValue);

        assertThat(mowerPosition.getCurrentMowerPosition()).isEqualTo("1 3 N");
    }
}