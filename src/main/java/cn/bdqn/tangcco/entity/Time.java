package cn.bdqn.tangcco.entity;

/**
 * Created by Administrator on 2017/8/4.
 */

/**
 * @Author: Mc
 * @Description: 时间段表
 * @Date: 2017/08/04 15:11
 */
public class Time {

    /**
     * time_idint(11) NOT NULL时间段ID
     * weekvarchar(10) NULL周
     * time_quantumvarchar(20) NULL时间段
     */

    private Integer timeId;
    private String week;
    private String timeQuantum;

    @Override
    public String toString() {
        return "Time{" +
                "timeId=" + timeId +
                ", week='" + week + '\'' +
                ", timeQuantum='" + timeQuantum + '\'' +
                '}';
    }

    public Integer getTimeId() {
        return timeId;
    }

    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getTimeQuantum() {
        return timeQuantum;
    }

    public void setTimeQuantum(String timeQuantum) {
        this.timeQuantum = timeQuantum;
    }
}
