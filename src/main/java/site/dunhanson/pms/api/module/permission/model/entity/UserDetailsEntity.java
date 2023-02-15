package site.dunhanson.pms.api.module.permission.model.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;

/**
 * 用户账户信息
 * @author dunhanson
 * @since 2023-02015
 */
@Data
public class UserDetailsEntity implements UserDetails {
    /**
     * 权限集合
     */
    private Collection<? extends GrantedAuthority> authorities;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户名
     */
    private String username;
    /**
     * 账户过期
     */
    private boolean accountNonExpired;
    /**
     * 账户锁住
     */
    private boolean accountNonLocked;
    /**
     * 密码过期
     */
    private boolean credentialsNonExpired;
    /**
     * 启用
     */
    private boolean enabled;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
