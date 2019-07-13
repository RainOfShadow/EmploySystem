package cn.org.y24.EmploySystem.entity.sql;

import java.util.Date;

public class ContractInfo {
    private String graduateId;
    private String companyId;
    /// 职位名称
    private String name;
    private Date begin;
    private Date end;
    private String description;

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getGraduateId() {
        return graduateId;
    }

    public void setGraduateId(String graduateId) {
        this.graduateId = graduateId;
    }

    public ContractInfo(String graduateId, String companyId, String name, Date begin, Date end, String description) {
        this.graduateId = graduateId;
        this.companyId = companyId;
        this.name = name;
        this.begin = begin;
        this.end = end;
        this.description = description;
    }
}
