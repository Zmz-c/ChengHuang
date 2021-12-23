package com.zlh.CH.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.management.relation.Role;
import java.util.Collection;

@Data
public class logtab implements UserDetails {
    private int id;
    private String username;
    private String password;
    private int vc;
    private Role role;

    public void user(logtab login){
        this.id = login.getId();
        this.username = login.getUsername();
        this.password= login.getPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return username;
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

    public enum Role{
        admin, normal
    }
}
