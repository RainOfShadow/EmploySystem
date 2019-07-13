package cn.org.y24.EmploySystem.entity.sql;


public class UserBehaviorInfo {
    private String id;
    private String type;
    private String description;
    private String value;

    public UserBehaviorInfo(String id, String type, String description, String value) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
