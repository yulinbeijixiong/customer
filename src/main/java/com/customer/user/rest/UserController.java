package com.customer.user.rest;

import com.customer.user.entity.LoginDto;
import com.customer.user.mapper.UserMapper;
import com.customer.user.service.UserService;
import com.customer.utils.JWTutils;
import com.nimbusds.jose.JOSEException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Collections;

/**
 * @author oujian
 * create by 2019/1/24
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    @RequestMapping(path = "/login",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity Login(@RequestBody LoginDto loginDto) throws JOSEException {
        UserDetails userDetails = userService.loadUserByUsername(loginDto.getUsername());
        String s = JWTutils.creatToeken(userDetails);
        return ResponseEntity.ok(Collections.singletonMap("token",s));
    }
    @RequestMapping(path="/info",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity info(@RequestHeader("token")String token) throws ParseException, JOSEException {
        System.out.println(token);
        UserDetails valid = JWTutils.valid(token);
        return ResponseEntity.ok(valid);
    }
}
