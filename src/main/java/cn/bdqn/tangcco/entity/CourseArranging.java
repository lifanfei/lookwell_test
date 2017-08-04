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

public class CourseArranging {

    /**
     * arranging_idint(11) NOT NULL课程安排ID
     * grade_idint(11) NULL班级ID
     * time_idint(11) NULL时间段ID
     * teacher_idint(11) NULL教师ID
     * room_idint(11) NULL教室ID
     * chapter_idint(11) NULL章节ID
     * arranging_datedate NULL课程安排日期
     * create_timedatetime NULL创建时间
     * update_timedatetime NULL修改时间
     */

    private Integer arrangingId;
    private Grade grade;
    private Time time;
    private Teacher teacher;
    private Room room;
    private Chapter chapter;
    private Date arrangingDate;
    private Date createTime;
    private Date updateTime;

    @Override
    public String toString() {
        return "CourseArranging{" +
                "arrangingId=" + arrangingId +
                ", grade=" + grade +
                ", time=" + time +
                ", teacher=" + teacher +
                ", room=" + room +
                ", chapter=" + chapter +
                ", arrangingDate=" + arrangingDate +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getArrangingId() {
        return arrangingId;
    }

    public void setArrangingId(Integer arrangingId) {
        this.arrangingId = arrangingId;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    public Date getArrangingDate() {
        return arrangingDate;
    }

    public void setArrangingDate(Date arrangingDate) {
        this.arrangingDate = arrangingDate;
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
