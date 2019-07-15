package cn.org.y24.EmploySystem.service;

import cn.org.y24.EmploySystem.entity.sql.AdminUserAdditionalInfo;
import cn.org.y24.EmploySystem.mapper.sql.AdminUserAdditionalInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminInfoService {
    @Resource
    AdminUserAdditionalInfoMapper adminUserAdditionalInfoMapper;
    public AdminUserAdditionalInfo findAdminUserAdditionalInfoByUsername(String username) {
        return adminUserAdditionalInfoMapper.findAdminUserAdditionalInfoByUsername(username);
    }

    public int addAdminInfo(String username, String authenticationCode) {
        return adminUserAdditionalInfoMapper.addAdminUserAdditionalInfo(username, authenticationCode);
    }

    public int deleteAdminInfo(String username) {
        return adminUserAdditionalInfoMapper.deleteAdminUserInfo(username);
    }
}
