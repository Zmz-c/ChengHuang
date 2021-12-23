package com.zlh.CH.security;

import com.zlh.CH.Service.logimpl;
import com.zlh.CH.entity.logtab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomUserService implements UserDetailsService {
    @Autowired
    private logimpl log;

    @Autowired
    private PasswordEncoder PasswordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //通过用户名获取到用户信息
        logtab userInfo=log.userInfo(username);
        System.out.println(userInfo.getUsername());
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + userInfo.getRole().name()));
        return new User(userInfo.getUsername(),PasswordEncoder.encode(userInfo.getPassword()),authorities);
    }
}
