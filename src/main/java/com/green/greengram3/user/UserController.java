package com.green.greengram3.user;

import com.green.greengram3.common.ResVo;
import com.green.greengram3.user.model.UserSignVo;
import com.green.greengram3.user.model.UserSigninDto;
import com.green.greengram3.user.model.UserSignupDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
@Tag(name = "유저 API",description = "유저 관련 처리")
public class UserController {
    private final UserService service;

    @PostMapping("/signup")
    @Operation(summary = "회원가입",description = "회원가입 처리")

    public ResVo postSignup(@RequestBody UserSignupDto dto){
        log.info("dto : {}",dto);
        return service.signup(dto);
    }

    @PostMapping("/signin")
    @Operation(summary = "인증",description = "아이디/비번을 활용한 인증처리")
    public UserSignVo postSignin(@RequestBody UserSigninDto dto){
        return service.signin(dto);
    }
}
