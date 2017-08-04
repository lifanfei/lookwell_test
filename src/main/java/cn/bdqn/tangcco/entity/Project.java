package cn.bdqn.tangcco.entity;

/**
 * Created by Administrator on 2017/8/4.
 */

import java.util.Date;

/**
 *@Author: Mc
 *@Description: 产品表
 *@Date: 2017/08/04 15:11
 */

public class Project {

    /**
     * project_idint(11) NOT NULL产品ID
     * project_namevarchar(20) NULL产品名称
     * project_descvarchar(30) NULL产品描述
     * project_versionvarchar(10) NULL产品版本
     * project_statusvarchar(4) NULL产品状态
     * create_timedatetime NULL创建时间
     * update_timedatetime NULL修改时间
     */

    private Integer projectId;
    private String projectName;
    private String projectDesc;
    private String projectVersion;
    private String projectStatus;
    private Date createTime;
    private Date updateTime;

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectDesc='" + projectDesc + '\'' +
                ", projectVersion='" + projectVersion + '\'' +
                ", projectStatus='" + projectStatus + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
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
