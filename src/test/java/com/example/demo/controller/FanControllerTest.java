package com.example.demo.controller;

import com.example.demo.model.FanDirection;
import com.example.demo.model.FanModel;
import com.example.demo.model.RunningStatus;
import com.example.demo.service.FanService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
public class FanControllerTest {

    @Spy
    private FanService fanService;
    @InjectMocks
    private FanController fanController;

    @Test
    public void testPull() {

        FanModel val = fanController.pullChordOne();
        assertThat(val).isNotNull();
        assertThat(val.getSpeed()).isEqualTo(1);
        assertThat(val.getRunningStatus().name()).isEqualTo(RunningStatus.ON.name());
        // Pull Chord One till fan stops.
        fanController.pullChordOne();
        fanController.pullChordOne();
        fanController.pullChordOne();

        assertThat(val.getSpeed()).isEqualTo(0);
        assertThat(val.getRunningStatus().name()).isEqualTo(RunningStatus.OFF.name());

        // Pull Chord 1 to swhich on the fan

        fanController.pullChordOne();

        assertThat(val.getDirection().name()).isEqualTo(FanDirection.NORMAL.name());
        // Pull chord 2 to change the direction of fan
        fanController.pullChordTwo();

        assertThat(val.getDirection().name()).isEqualTo(FanDirection.REVERSE.name());

    }
}
