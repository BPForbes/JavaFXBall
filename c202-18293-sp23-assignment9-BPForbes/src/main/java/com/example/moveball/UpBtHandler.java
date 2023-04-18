package com.example.moveball;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class UpBtHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        int limit = -(int) MoveBallApp.height/2;
        int mvSpd = 5;
        if (!(MoveBallApp.circle.getCenterY() - MoveBallApp.circle.getRadius() - mvSpd < limit)   ) {
            MoveBallApp.circle.setCenterY(MoveBallApp.circle.getCenterY() - mvSpd);
        }
        else {
            MoveBallApp.circle.setCenterY(limit + MoveBallApp.circle.getRadius());
        }
    }
}
