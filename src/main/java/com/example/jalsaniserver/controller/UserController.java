package com.example.jalsaniserver.controller;

import com.example.jalsaniserver.dto.UserMapperDto;
import com.example.jalsaniserver.service.userService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final userService userService;


    //마이페이지 조회
    @GetMapping("/users/{id}")
    public List<UserMapperDto> findMypage(@PathVariable("id") String id) throws Exception {
        return userService.findMypage();
    }
}
