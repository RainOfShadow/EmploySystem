package cn.org.y24.EmploySystem.entity.sql;

import java.util.Date;

public class UserBehaviorLog {
    private String id;
    private String username;
    private Date time;

    public UserBehaviorLog(String id, String username, Date time) {
        this.id = id;
        this.username = username;
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
