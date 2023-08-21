package com.example.jalsaniserver.dto.response;

import com.example.jalsaniserver.entity.User;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UserResponse {//응답클래스

    private String id;
    private String name;
    private String phone;
    private String address;
    private LocalDateTime birth;
    private String photopath;
    private String mbti;

    public UserResponse(User user) { //생성자 오버로딩
        this.id = user.getId();
        this.name = user.getName();
        this.phone = user.getPhone();
        this.address = user.getAddress();
        this.birth = user.getBirth();
        this.photopath = user.getPhotopath();
        this.mbti = user.getMbti();
    }

    @Builder
    public UserResponse(String id, String name,String phone,String address, LocalDateTime birth, String photopath, String mbti){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.birth = birth;
        this.photopath = photopath;
        this.mbti = mbti;
    }
}
