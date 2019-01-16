package com.customer.user.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.customer.user.entity.JhiUser;
import com.customer.user.service.IJhiUserService;
import com.customer.user.service.impl.JhiUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.sql.Wrapper;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-01-10
 */
@RestController
@RequestMapping("/user")
public class JhiUserController {
    @Autowired
    public IJhiUserService iJhiUserService;
    @RequestMapping(method = RequestMethod.GET,
            path = "/get",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Map<String, String> index(@RequestBody Map map) {
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("last_name","迎烁");
        List<JhiUser> list = (List<JhiUser>) iJhiUserService.listByMap(objectObjectHashMap);
        return Collections.singletonMap("msg",list.toString());
    }
    @RequestMapping(method = RequestMethod.GET,
            path = "detele",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Map<String, String> delete() {
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("id",2L);


        Boolean b = iJhiUserService.removeById(2L);


        return Collections.singletonMap("msg",b.toString());
    }
    @RequestMapping(method = RequestMethod.GET,
            path = "update",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Map<String, String> update() {
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("id",2L);
        JhiUser jhiUser = new JhiUser();
        jhiUser.setEmail("asdfasf");
        jhiUser.setId(2L);

        Boolean b = iJhiUserService.updateById(jhiUser);
        return Collections.singletonMap("msg",b.toString());
    }
    @RequestMapping(method = RequestMethod.GET,
            path = "create",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Map<String, String> create() {

        JhiUser jhiUser = new JhiUser();
        jhiUser.setEmail("asdfasf11");
        jhiUser.setActivated(true);
        jhiUser.setCreatedBy("oujian");
        jhiUser.setCreatedTime(System.currentTimeMillis());
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(System.currentTimeMillis() / 1000, 0, ZoneOffset.ofHours(8));
        jhiUser.setCreatedDate(localDateTime);
        Boolean b = iJhiUserService.save(jhiUser);

        return Collections.singletonMap("msg",b.toString());
    }
}
