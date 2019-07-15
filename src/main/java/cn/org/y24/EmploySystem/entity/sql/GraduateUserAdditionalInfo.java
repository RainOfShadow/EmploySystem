package cn.org.y24.EmploySystem.entity.sql;

import java.util.Date;

public class GraduateUserAdditionalInfo {
    ///
    private String idCardNo;
    ///
    private String name;
    ///
    private String username;
    ///
    private String schoolNo;
    ///
    private String othersReferralStuffID;
    ///
    private String selfReferralStuffID;
    ///
    private String school;
    ///
    private boolean sex;
    ///
    private String national;
    /// 学历
    private String degree;
    /// 政治面貌
    private String politicalLandscape;
    ///
    private String emailAddress;
    /// 联系方式
    private String contractNo;
    ///
    private String address;
    /// 户籍
    private String householdRegistration;
    /// 婚姻状况
    private String maritalStatus;
    /// 离校时间
    private Date schoolLeftTime;
    /// 离校说明
    private String schoolLeftInfo;
    /// 培训经历
    private String trainInfo;
    /// 实践经历
    private String practiceExperience;
    /// 简历
    private String resume;
    public GraduateUserAdditionalInfo(String idCardNo, String name, String username, String schoolNo, String othersReferralStuffID, String selfReferralStuffID, String school, boolean sex, String national, String degree, String politicalLandscape, String emailAddress, String contractNo, String address, String householdRegistration, String maritalStatus, Date schoolLeftTime, String schoolLeftInfo, String trainInfo, String practiceExperience, String resume) {
        this.idCardNo = idCardNo;
        this.name = name;
        this.username = username;
        this.schoolNo = schoolNo;
        this.othersReferralStuffID = othersReferralStuffID;
        this.selfReferralStuffID = selfReferralStuffID;
        this.school = school;
        this.sex = sex;
        this.national = national;
        this.degree = degree;
        this.politicalLandscape = politicalLandscape;
        this.emailAddress = emailAddress;
        this.contractNo = contractNo;
        this.address = address;
        this.householdRegistration = householdRegistration;
        this.maritalStatus = maritalStatus;
        this.schoolLeftTime = schoolLeftTime;
        this.schoolLeftInfo = schoolLeftInfo;
        this.trainInfo = trainInfo;
        this.practiceExperience = practiceExperience;
        this.resume = resume;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSchoolNo() {
        return schoolNo;
    }

    public void setSchoolNo(String schoolNo) {
        this.schoolNo = schoolNo;
    }

    public String getOthersReferralStuffID() {
        return othersReferralStuffID;
    }

    public void setOthersReferralStuffID(String othersReferralStuffID) {
        this.othersReferralStuffID = othersReferralStuffID;
    }

    public String getSelfReferralStuffID() {
        return selfReferralStuffID;
    }

    public void setSelfReferralStuffID(String selfReferralStuffID) {
        this.selfReferralStuffID = selfReferralStuffID;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPoliticalLandscape() {
        return politicalLandscape;
    }

    public void setPoliticalLandscape(String politicalLandscape) {
        this.politicalLandscape = politicalLandscape;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseholdRegistration() {
        return householdRegistration;
    }

    public void setHouseholdRegistration(String householdRegistration) {
        this.householdRegistration = householdRegistration;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Date getSchoolLeftTime() {
        return schoolLeftTime;
    }

    public void setSchoolLeftTime(Date schoolLeftTime) {
        this.schoolLeftTime = schoolLeftTime;
    }

    public String getSchoolLeftInfo() {
        return schoolLeftInfo;
    }

    public void setSchoolLeftInfo(String schoolLeftInfo) {
        this.schoolLeftInfo = schoolLeftInfo;
    }

    public String getTrainInfo() {
        return trainInfo;
    }

    public void setTrainInfo(String trainInfo) {
        this.trainInfo = trainInfo;
    }

    public String getPracticeExperience() {
        return practiceExperience;
    }

    public void setPracticeExperience(String practiceExperience) {
        this.practiceExperience = practiceExperience;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}
