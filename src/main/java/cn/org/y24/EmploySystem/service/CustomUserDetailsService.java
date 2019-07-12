package cn.org.y24.EmploySystem.service;

import cn.org.y24.EmploySystem.mapper.CustomUserMapper;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Resource
    CustomUserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails user = userMapper.findUserByName(username);
        if (user == null) {
            return null;
        }
        return new User(user.getUsername(), user.getPassword(), user.getAuthorities());
    }
}
