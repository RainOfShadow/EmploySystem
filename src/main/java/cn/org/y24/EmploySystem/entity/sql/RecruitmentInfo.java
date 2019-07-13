package cn.org.y24.EmploySystem.entity.sql;

import java.util.Date;

public class RecruitmentInfo {
    private String id;
    /// 职位名称
    private String name;
    private String description;
    private float endAward;
    private float salary;
    private int required;
    private int current;
    private Date deadline;

    public RecruitmentInfo(String id, String name, String description, float endAward, float salary, int required, int current, Date deadline) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.endAward = endAward;
        this.salary = salary;
        this.required = required;
        this.current = current;
        this.deadline = deadline;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getRequired() {
        return required;
    }

    public void setRequired(int required) {
        this.required = required;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getEndAward() {
        return endAward;
    }

    public void setEndAward(float endAward) {
        this.endAward = endAward;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
