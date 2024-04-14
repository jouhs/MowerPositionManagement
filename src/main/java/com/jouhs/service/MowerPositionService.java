package com.jouhs.service;

import com.jouhs.model.MowerPosition;

public class MowerPositionService {
    public MowerPosition executeActions(String actions, int x, int y, char direction, int xMaxValue, int yMaxValue){
        MowerPosition mowerPosition = new MowerPosition(x, y, direction);

        return mowerPosition;
    }
}
