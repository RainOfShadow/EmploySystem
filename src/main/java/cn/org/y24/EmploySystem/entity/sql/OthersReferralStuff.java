package cn.org.y24.EmploySystem.entity.sql;

import java.util.Date;

public class OthersReferralStuff {
    private String ID;
    private Date time;
    private String name;
    private String contractNo;
    private String graduateIdCardNo;

    public OthersReferralStuff(String ID, Date time, String name, String contractNo, String graduateIdCardNo) {
        this.ID = ID;
        this.time = time;
        this.name = name;
        this.contractNo = contractNo;
        this.graduateIdCardNo = graduateIdCardNo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getGraduateIdCardNo() {
        return graduateIdCardNo;
    }

    public void setGraduateIdCardNo(String graduateIdCardNo) {
        this.graduateIdCardNo = graduateIdCardNo;
    }

}
