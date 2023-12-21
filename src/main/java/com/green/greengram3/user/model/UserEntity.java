package com.green.greengram3.user.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Data
public class UserEntity {
    private int iuser;
    private String uid;
    private String upw;
    private String nm;
    private String pic;
    private String firebaseToken;
    private String createdAt;
    private String updatedAt;
}
