package com.example.demo.controller;


import com.example.demo.model.FanModel;
import com.example.demo.model.RunningStatus;
import com.example.demo.service.FanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class FanController {

    private final FanService fanService;

    @GetMapping("/pull-chord-1")
    public FanModel pullChordOne() {
        return fanService.pullChordOne();
    }


    @GetMapping("/pull-chord-2")
    public FanModel pullChordTwo() {
        return fanService.pullChordTwo();
    }
}
