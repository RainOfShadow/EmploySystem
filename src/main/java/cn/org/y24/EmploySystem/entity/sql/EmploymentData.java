package cn.org.y24.EmploySystem.entity.sql;

import java.util.Date;

public class EmploymentData {
    private String id;
    /// 职位名称
    private String name;
    /// 就业率
    private float employment;
    /// 就业人数
    private int count;
    private Date begin;
    private Date end;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getEmployment() {
        return employment;
    }

    public void setEmployment(float employment) {
        this.employment = employment;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public EmploymentData(String id, String name, float employment, int count, Date begin, Date end) {
        this.id = id;
        this.name = name;
        this.employment = employment;
        this.count = count;
        this.begin = begin;
        this.end = end;
    }
}
