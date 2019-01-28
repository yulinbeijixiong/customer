package com.customer.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;

/**
 * @author oujian
 * create by 2019/1/24
 */
@Data
public class UserDto implements UserDetails {

    private final Long id;

    private final String username;


    private final String password;

    private final String avatar;

    private final String email;


    private final Collection<? extends GrantedAuthority> authorities;

    private final boolean enabled;

    private Timestamp createTime;


    private final LocalDateTime lastPasswordResetDate;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
