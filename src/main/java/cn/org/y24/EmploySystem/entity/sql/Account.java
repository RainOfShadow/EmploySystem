package cn.org.y24.EmploySystem.entity.sql;

import java.util.Date;

public class Account {

    private String id;
    private String name;
    private String password;
    private String passwordSalt;
    private String permission;
    private String status;
    private Date registerTime;

    public Account(String id, String name, String password, String passwordSalt, String permission, String status, Date registerTime) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.passwordSalt = passwordSalt;
        this.permission = permission;
        this.status = status;
        this.registerTime = registerTime;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
