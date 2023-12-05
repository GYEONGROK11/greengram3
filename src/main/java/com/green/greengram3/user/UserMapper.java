package com.green.greengram3.user;

import com.green.greengram3.user.model.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int insUser(UserSignupProcDto dto);

    UserSigninProcVo signin(UserSigninDto dto);

    UserEntity selUser(UserSelDto dto);

    int delFollow(UserFollowDto dto);

    int insFollow(UserFollowDto dto);

    UserInfoVo userInfo(UserInfoDto dto);
}
