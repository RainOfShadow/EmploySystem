package cn.org.y24.EmploySystem.mapper;

import cn.org.y24.EmploySystem.entity.UserInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CustomUserMapper {
    @Select("select * from User where username = #{username}")
    UserInfo findUserByName(String username);

    @Insert("insert into User values(#{username},#{password},#{role},#{accountNonExpired},#{accountNonLocked},#{credentialsNonExpired},#{enabled})")
    int addUser(String username, String password, String role,
                boolean accountNonExpired,
                boolean accountNonLocked,
                boolean credentialsNonExpired,
                boolean enabled);

    @Delete("delete from User where  username = #{username}")
    int delete(String username);
}
