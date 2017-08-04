package cn.bdqn.tangcco.entity;

/**
 * Created by Administrator on 2017/8/4.
 */

import java.util.Date;

/**
 *@Author: Mc
 *@Description: 课程表
 *@Date: 2017/08/04 15:11
 */

public class Course {
    /**
     * course_idint(11) NOT NULL课程ID
     * project_idint(11) NULL产品ID
     * course_namevarchar(50) NULL课程名称
     * course_descvarchar(30) NULL课程描述
     * create_timedatetime NULL创建时间
     * update_timedatetime NULL修改时间
     */

    private Integer courseId;
    private Project project;
    private String courseName;
    private String courseDesc;
    private Date createTime;
    private Date updateTime;

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", project=" + project +
                ", courseName='" + courseName + '\'' +
                ", courseDesc='" + courseDesc + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
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
