package cn.org.y24.EmploySystem.service;

import cn.org.y24.EmploySystem.entity.sql.GraduateUserAdditionalInfo;
import cn.org.y24.EmploySystem.mapper.sql.GraduateInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class GraduateInfoService {
    @Resource
    GraduateInfoMapper graduateInfoMapper;

    public GraduateUserAdditionalInfo findGraduateInfoByUsername(String username) {
        return graduateInfoMapper.findGraduateInfoByUsername(username);
    }

    public int addGraduateInfo(String idCardNo,
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
                               String resume) {
        return graduateInfoMapper.addGraduateInfo(idCardNo,
                name, username, schoolNo, othersReferralStuffID,
                selfReferralStuffID, school, sex, national, degree,
                politicalLandscape, emailAddress, contractNo, address,
                householdRegistration, maritalStatus, schoolLeftTime, schoolLeftInfo,
                trainInfo, practiceExperience, resume);
    }

    public int deleteGraduate(String username) {
        return graduateInfoMapper.deleteGraduateInfo(username);
    }
}
