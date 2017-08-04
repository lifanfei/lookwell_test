package cn.bdqn.tangcco.entity;

/**
 * Created by Administrator on 2017/8/4.
 */

import java.util.Date;

/**
 * @Author: Mc
 * @Description: 预课表
 * @Date: 2017/08/04 15:11
 */

public class PreliminaryArrangement {

    /**
     * pa_idint(11) NOT NULL预课表ID
     * room_idint(11) NULL教室ID
     * teacher_idint(11) NULL教师ID
     * grade_idint(11) NULL班级ID
     * time_idint(11) NULL时间段ID
     * chapter_idint(11) NULL章节ID
     * create_timedatetime NULL创建时间
     * update_timedatetime NULL修改时间
     */

    private Integer paId;
    private Room room;
    private Teacher teacher;
    private Grade grade;
    private Time time;
    private Chapter chapter;
    private Date createTime;
    private Date updateTime;

    @Override
    public String toString() {
        return "PreliminaryArrangement{" +
                "paId=" + paId +
                ", room=" + room +
                ", teacher=" + teacher +
                ", grade=" + grade +
                ", time=" + time +
                ", chapter=" + chapter +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getPaId() {
        return paId;
    }

    public void setPaId(Integer paId) {
        this.paId = paId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
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
