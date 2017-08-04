package cn.bdqn.tangcco.entity;

/**
 * Created by Administrator on 2017/8/4.
 */

/**
 * @Author: Mc
 * @Description: 班级名称表
 * @Date: 2017/08/04 15:11
 */
public class GradeName {

    /**
     * granam_idint(11) NOT NULL班级名称ID
     * grade_idint(11) NULL班级ID
     * max_numint(11) NULL目前最大数
     */

    private Integer granamId;
    private Grade grade;
    private Integer maxNum;

    @Override
    public String toString() {
        return "gradeName{" +
                "granamId=" + granamId +
                ", grade=" + grade +
                ", maxNum=" + maxNum +
                '}';
    }

    public Integer getGranamId() {
        return granamId;
    }

    public void setGranamId(Integer granamId) {
        this.granamId = granamId;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }
}
