package cn.org.y24.EmploySystem.mapper.sql;

import cn.org.y24.EmploySystem.entity.sql.GraduateUserAdditionalInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

@Mapper
public interface GraduateInfoMapper {
    @Select("select * from GRADUATE_INFO where username=#{username}")
    GraduateUserAdditionalInfo findGraduateInfoByUsername(String username);

    @Insert("insert into GRADUATE_INFO values(#{idCardNo}, " +
            "#{name}, #{username}, #{schoolNo}, #{othersReferralStuffID}, " +
            "#{selfReferralStuffID}, #{school}, #{sex}, #{national}, #{degree}, " +
            "#{politicalLandscape}, #{emailAddress}, #{contractNo}, #{address}, " +
            "#{householdRegistration}, #{maritalStatus}, #{schoolLeftTime}, " +
            "#{schoolLeftInfo}, #{trainInfo}, #{practiceExperience}, #{resume})")
    int addGraduateInfo(String idCardNo,
                        String name,
                        String username,
                        String schoolNo,
                        String othersReferralStuffID,
                        String selfReferralStuffID,
                        String school,
                        boolean sex,
                        String national,
                        String degree,
                        String politicalLandscape,
                        String emailAddress,
                        String contractNo,
                        String address,
                        String householdRegistration,
                        String maritalStatus,
                        Date schoolLeftTime,
                        String schoolLeftInfo,
                        String trainInfo,
                        String practiceExperience,
                        String resume);

    @Delete("Delete from GRADUATE_INFO where username=#{username}")
    int deleteGraduateInfo(String username);
}
