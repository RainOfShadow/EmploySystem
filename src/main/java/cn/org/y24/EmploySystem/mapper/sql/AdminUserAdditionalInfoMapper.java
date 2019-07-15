package cn.org.y24.EmploySystem.mapper.sql;

import cn.org.y24.EmploySystem.entity.sql.AdminUserAdditionalInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminUserAdditionalInfoMapper {
    @Select("select * from ADMINUSERADDITIONALINFO where username=#{username}")
    AdminUserAdditionalInfo findAdminUserAdditionalInfoByUsername(String username);

    @Insert("insert into ADMINUSERADDITIONALINFO values(#{username},#{authenticationCode})")
    int addAdminUserAdditionalInfo(String username, String authenticationCode);

    @Delete("delete from ADMINUSERADDITIONALINFO where username=#{username}")
    int deleteAdminUserInfo(String username);
}
