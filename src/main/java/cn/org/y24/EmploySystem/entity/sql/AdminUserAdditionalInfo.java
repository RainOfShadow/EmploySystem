package cn.org.y24.EmploySystem.entity.sql;

public class AdminUserAdditionalInfo {
    private String username;
    private String AuthenticationCode;

    public AdminUserAdditionalInfo(String username, String authenticationCode) {
        this.username = username;
        AuthenticationCode = authenticationCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthenticationCode() {
        return AuthenticationCode;
    }

    public void setAuthenticationCode(String authenticationCode) {
        AuthenticationCode = authenticationCode;
    }

}
