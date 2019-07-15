package cn.org.y24.EmploySystem.service;

import cn.org.y24.EmploySystem.entity.sql.CompanyUserAdditionalInfo;
import cn.org.y24.EmploySystem.mapper.sql.CompanyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CompanyService {
    @Resource
    CompanyMapper companyMapper;

    public CompanyUserAdditionalInfo findCompanyInfoByUsername(String username) {
        return companyMapper.findCompanyInfoByUsername(username);
    }

    public int addCompanyInfo(String id,
                              String name,
                              String username,
                              String contractNo,
                              String emailAddress,
                              String annualInspectionStatus) {
        return companyMapper.addCompanyInfo(id, name,
                username, contractNo, emailAddress, annualInspectionStatus);
    }

    public int deleteCompanyInfo(String username) {
        return companyMapper.deleteCompanyInfo(username);
    }
}
