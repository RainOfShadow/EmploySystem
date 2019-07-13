package cn.org.y24.EmploySystem.entity.sql;

public class CompanyRecruitment {
    private String companyId;
    private String recruitmentId;
    private String releaseTime;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getRecruitmentId() {
        return recruitmentId;
    }

    public void setRecruitmentId(String recruitmentId) {
        this.recruitmentId = recruitmentId;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public CompanyRecruitment(String companyId, String recruitmentId, String releaseTime) {
        this.companyId = companyId;
        this.recruitmentId = recruitmentId;
        this.releaseTime = releaseTime;
    }
}
