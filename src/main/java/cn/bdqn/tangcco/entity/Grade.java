package cn.bdqn.tangcco.entity;

/**
 * Created by Administrator on 2017/8/4.
 */

import java.util.Date;

/**
 * @Author: Mc
 * @Description: 班级表
 * @Date: 2017/08/04 15:11
 */

public class Grade {

    /**
     * grade_idint(11) NOT NULL班级ID
     * grade_namevarchar(20) NULL班级名称
     * grade_descvarchar(40) NULL班级描述
     * grade_starttimedate NULL开班时间
     * grade_statusvarchar(10) NULL班级状态
     * create_timedatetime NULL创建时间
     * update_timedatetime NULL修改时间
     */

    private Integer gradeId;
    private String gradeName;
    private String gradeDesc;
    private Date gradeStartTime;
    private String gradeStatus;
    private Date createTime;
    private Date updateTime;

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId=" + gradeId +
                ", gradeName='" + gradeName + '\'' +
                ", gradeDesc='" + gradeDesc + '\'' +
                ", gradeStartTime=" + gradeStartTime +
                ", gradeStatus='" + gradeStatus + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getGradeDesc() {
        return gradeDesc;
    }

    public void setGradeDesc(String gradeDesc) {
        this.gradeDesc = gradeDesc;
    }

    public Date getGradeStartTime() {
        return gradeStartTime;
    }

    public void setGradeStartTime(Date gradeStartTime) {
        this.gradeStartTime = gradeStartTime;
    }

    public String getGradeStatus() {
        return gradeStatus;
    }

    public void setGradeStatus(String gradeStatus) {
        this.gradeStatus = gradeStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
