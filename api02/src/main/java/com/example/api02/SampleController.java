package com.example.api02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by gavinkim at 16/11/2018
 */
@RestController
@RequestMapping(value = "/api02")
public class SampleController {

    @GetMapping("/users")
    public List<User> getUsers(){
        return createUsers();
    }


    private List<User> createUsers(){
        List<User> users = new ArrayList<>();
        IntStream.rangeClosed(1,300).forEach(index->users.add(User.builder()
                .email("test@test.com")
                .name("test")
                .phone("01012345678")
                .status("Active")
                .build()));

        return users;
    }
}
