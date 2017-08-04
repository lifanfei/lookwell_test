package cn.bdqn.tangcco.entity;

/**
 * Created by Administrator on 2017/8/4.
 */

import java.util.Date;

/**
 *@Author: Mc
 *@Description: 章节表
 *@Date: 2017/08/04 15:11
 */

public class Chapter {
    /**
     *
     * chapter_idint(11) NOT NULL章节ID
     * course_idint(11) NULL课程ID
     * chapter_namevarchar(20) NULL章节名称
     * durationint(11) NULL章节课时
     * create_timedatetime NULL创建时间
     * update_timedatetime NULL修改时间
     */
    private Integer chapterId;
    private Course course;
    private String chapterName;
    private int duration;
    private Date createTime;
    private Date updateTime;

    @Override
    public String toString() {
        return "Chapter{" +
                "chapterId=" + chapterId +
                ", course=" + course +
                ", chapterName='" + chapterName + '\'' +
                ", duration=" + duration +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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
