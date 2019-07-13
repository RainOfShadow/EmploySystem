package cn.org.y24.EmploySystem.entity.sql;

import java.util.Date;

public class SelfReferralStuff {
    private String id;
    private Date time;
    private int workHour;
    private String workPreference;
    private float salary;
    private String content;

    public SelfReferralStuff(String id, Date time, int workHour, String workPreference, float salary, String content) {
        this.id = id;
        this.time = time;
        this.workHour = workHour;
        this.workPreference = workPreference;
        this.salary = salary;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public String getWorkPreference() {
        return workPreference;
    }

    public void setWorkPreference(String workPreference) {
        this.workPreference = workPreference;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}