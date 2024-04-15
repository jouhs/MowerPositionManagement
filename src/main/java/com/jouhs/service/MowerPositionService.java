package com.jouhs.service;

import com.jouhs.model.MowerPosition;

public class MowerPositionService {
    public MowerPosition executeActions(String actions, int x, int y, char direction, int xMaxValue, int yMaxValue){
        MowerPosition mowerPosition = new MowerPosition(x, y, direction);
        actions.chars().forEach(
                c -> {
                    switch (c){
                        case 'A' :
                            mowerPosition.move(xMaxValue, yMaxValue);
                            break;
                        case 'G' :
                            mowerPosition.turnLeft();
                            break;
                        case 'D' :
                            mowerPosition.turnRight();
                            break;
                    }


                }
        );

        return mowerPosition;
    }
}
