package com.example.api01;

import lombok.*;

/**
 * Created by gavinkim at 16/11/2018
 */
@Getter
@NoArgsConstructor
public class User {

    private String name;
    private String email;
    private String phone;
    private String status;

    @Builder
    public User(String name, String email, String phone, String status) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.status = status;
    }
}
