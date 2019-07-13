package cn.org.y24.EmploySystem.service;

import cn.org.y24.EmploySystem.mapper.CustomUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountService {
    @Resource
    CustomUserMapper userMapper;

    public boolean addUser(String username, String password, String role,
                           boolean accountNonExpired,
                           boolean accountNonLocked,
                           boolean credentialsNonExpired,
                           boolean enabled) {

        return userMapper.addUser(username, password, role, accountNonExpired, accountNonLocked, credentialsNonExpired, enabled) == 1;
    }

    public boolean delete(String username) {
        return userMapper.delete(username) == 1;
    }
}
