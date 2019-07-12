package cn.org.y24.EmploySystem.mapper;

import cn.org.y24.EmploySystem.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CustomUserMapper {
    @Select("select * from User where username = #{username}")
    UserInfo findUserByName(String username);
}
