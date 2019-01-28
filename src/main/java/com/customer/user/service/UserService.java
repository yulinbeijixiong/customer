package com.customer.user.service;

import com.customer.dto.UserDto;
import com.customer.permission.entity.Permission;
import com.customer.role.entity.Role;
import com.customer.role.mapper.RoleMapper;
import com.customer.role.permissions.entity.RolesPermissions;
import com.customer.role.permissions.mapper.RolesPermissionsMapper;
import com.customer.user.entity.User;

import com.customer.user.mapper.UserMapper;
import com.customer.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author oujian
 * create by 2019/1/24
 */
@Service
public class UserService implements UserDetailsService {
    @Autowired
    public UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        HashMap<String, Object> query = new HashMap<>();
        query.put("username",s);
        query.put("enabled",1);
        List<User> users = userMapper.selectByMap(query);
        if(users!=null&&users.size()==1){
            User user = users.get(0);
            Long id = user.getId();
            HashMap<String, Object> queryAuth = new HashMap<>();
            queryAuth.put("role_id", id);
            Set<Permission> permission = userMapper.getPermission(id);
            Set<SimpleGrantedAuthority> collect = permission.stream().map(permission1 -> new SimpleGrantedAuthority("ROLE" + permission1.getName()))
                    .collect(Collectors.toSet());
            UserDto userDto = new UserDto(
                    user.getId(), user.getUsername(), user.getAvatar(), user.getEmail(),
                    user.getEmail(),collect , true, user.getLastPasswordResetTime()
            );
            return userDto;
        }
        return null;
    }

}
