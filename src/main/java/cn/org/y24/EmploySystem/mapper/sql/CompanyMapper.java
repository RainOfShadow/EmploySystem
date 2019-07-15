package cn.org.y24.EmploySystem.mapper.sql;

import cn.org.y24.EmploySystem.entity.sql.CompanyUserAdditionalInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CompanyMapper {
    @Select("select * from COMPANY where username=#{username} ")
    CompanyUserAdditionalInfo findCompanyInfoByUsername(String username);

    @Insert("insert into COMPANY values(#{id},#{name},#{username},#{telephone},#{email},#{inspection})")
    int addCompanyInfo(String id,
                       String name,
                       String username,
                       String telephone,
                       String email,
                       String inspection);

    @Delete("delete from COMPANY where username=#{username} ")
    int deleteCompanyInfo(String username);
}
