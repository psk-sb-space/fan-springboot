package com.example.demo.service;

import com.example.demo.model.FanDirection;
import com.example.demo.model.FanModel;
import com.example.demo.model.RunningStatus;
import org.springframework.stereotype.Service;

@Service
public class FanService {

    private static final FanModel fanStore = FanModel.builder()
            .direction(FanDirection.NORMAL)
            .speed(0)
            .runningStatus(RunningStatus.OFF)
            .message("Switched Off")
            .build();

    public FanModel pullChordOne() {
        if (fanStore.getSpeed() == 3) {
            fanStore.setSpeed(0);
            fanStore.setRunningStatus(RunningStatus.OFF);
        } else {
            fanStore.setSpeed(fanStore.getSpeed() + 1);
            fanStore.setRunningStatus(RunningStatus.ON);
        }
        fanStore.updateMessage();
        return fanStore;
    }

    public FanModel pullChordTwo() {
        if (fanStore.getDirection() == FanDirection.NORMAL) {
            fanStore.setDirection(FanDirection.REVERSE);
        } else {
            fanStore.setDirection(FanDirection.NORMAL);
        }
        fanStore.updateMessage();
        return fanStore;
    }
}
