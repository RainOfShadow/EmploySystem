package cn.org.y24.EmploySystem.entity.sql;

public class GraduateScoreSheet {
    private String id;
    private String school;
    private String graduateIdCardNo;
    private String subject;
    private float score;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGraduateIdCardNo() {
        return graduateIdCardNo;
    }

    public void setGraduateIdCardNo(String graduateIdCardNo) {
        this.graduateIdCardNo = graduateIdCardNo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public GraduateScoreSheet(String id, String school, String graduateIdCardNo, String subject, float score) {
        this.id = id;
        this.school = school;
        this.graduateIdCardNo = graduateIdCardNo;
        this.subject = subject;
        this.score = score;
    }
}
