package cn.org.y24.EmploySystem.entity.sql;

public class CompanyUserAdditionalInfo {
    private String id;
    private String name;
    private String username;
    private String contractNo;
    private String emailAddress;
    private String annualInspectionStatus;

    public CompanyUserAdditionalInfo(String id, String name, String username, String contractNo, String emailAddress, String annualInspectionStatus) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.contractNo = contractNo;
        this.emailAddress = emailAddress;
        this.annualInspectionStatus = annualInspectionStatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAnnualInspectionStatus() {
        return annualInspectionStatus;
    }

    public void setAnnualInspectionStatus(String annualInspectionStatus) {
        this.annualInspectionStatus = annualInspectionStatus;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
