package cn.bdqn.tangcco.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/8/4.
 */

/**
 * @Author: Mc
 * @Description: 教师表
 * @Date: 2017/08/04 15:11
 */

public class Teacher {

    /**
     * teacher_idint(11) NOT NULL教师ID
     * teacher_namevarchar(15) NULL教师名称
     * teacher_descvarchar(30) NULL教师描述
     * teacher_statusvarchar(4) NULL教师状态
     * create_timedatetime NULL创建时间
     * update_timedatetime NULL修改时间
     */

    private Integer teacherId;
    private String teacherName;
    private String teacherDesc;
    private String teacherStatus;
    private Date createTime;
    private Date updateTime;

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherDesc='" + teacherDesc + '\'' +
                ", teacherStatus='" + teacherStatus + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherDesc() {
        return teacherDesc;
    }

    public void setTeacherDesc(String teacherDesc) {
        this.teacherDesc = teacherDesc;
    }

    public String getTeacherStatus() {
        return teacherStatus;
    }

    public void setTeacherStatus(String teacherStatus) {
        this.teacherStatus = teacherStatus;
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
