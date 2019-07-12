package cn.org.y24.EmploySystem.provider;

import cn.org.y24.EmploySystem.service.CustomUserDetailsService;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
    @Resource
    CustomUserDetailsService userDetailsService;

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();
        UserDetails user = userDetailsService.loadUserByUsername(username);
        if (user == null) {
            throw new BadCredentialsException(String.format("Not exists User[%s]", username));
        }
        // 如果用户没有设置启用或禁用状态，或者用户被设为禁用，则抛出 DisabledException
        Optional<Boolean> enabled = Optional.of(user.isEnabled());
        if (!enabled.orElse(false)) {
            throw new DisabledException(String.format("User[%s] is disabled!", username));
        }
        // 如果用户没有过期状态或过期状态为 true 则抛出 AccountExpiredException
        Optional<Boolean> expired = Optional.of(!user.isAccountNonExpired());
        if (expired.orElse(true)) {
            throw new AccountExpiredException(String.format("User[%s] is expired!", username));
        }
        // 如果用户没有锁定状态或锁定状态为 true 则抛出 LockedException
        Optional<Boolean> locked = Optional.of(!user.isAccountNonLocked());
        if (locked.orElse(true)) {
            throw new LockedException(String.format("User[%s] is locked!", username));
        }
        if (!user.getPassword().equals(password)) {
            System.out.println("Actual password, input password: " + user.getPassword() + " " + password);
            throw new BadCredentialsException(String.format("Incorrect password for User[%s]", username));
        }
        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
        return new UsernamePasswordAuthenticationToken(username, password, authorities);
    }
}
