package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FanModel {

    private FanDirection direction;
    private RunningStatus runningStatus;
    private int speed;
    private String message;

    public void updateMessage() {
        if (runningStatus == RunningStatus.OFF) {
            message = "Fan is switched Off";
        } else {
            message = "Fan is Running at " + speed + " Speed.";
        }
    }
}
