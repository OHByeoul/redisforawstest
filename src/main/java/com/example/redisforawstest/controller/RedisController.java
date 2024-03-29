package com.example.redisforawstest.controller;

import com.example.redisforawstest.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RedisController {
    private final RedisService redisService;

    @GetMapping("/")
    public String test() {
        redisService.redisString();
        return "tttttestt2";
    }
}
