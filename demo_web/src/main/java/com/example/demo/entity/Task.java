package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Administrator on 2017/8/9 0009.
 */
@Entity
public class Task {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Boolean getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Boolean isFinished) {
        this.isFinished = isFinished;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        this.EndDate = endDate;
    }

    public String getManagerMobile() {
        return managerMobile;
    }

    public void setManagerMobile(String managerMobile) {
        this.managerMobile = managerMobile;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public String getClientMobile() {
        return clientMobile;
    }

    public void setClientMobile(String clientMobile) {
        this.clientMobile = clientMobile;
    }


    @Column(nullable = false)
    private String managerName;
    @Column(nullable = false)
    private String managerMobile;
    @Column(nullable = false)
    private String task;
    @Column(nullable = true)
    private String taskDesc;
    @Column(nullable = true)
    private Boolean isFinished;
    @Column(nullable = false)
    private String clientMobile;
    @Column(nullable = false)
    private String EndDate;

    protected Task() {}

    public Task(
            String managerName,
            String managerMobile,
            String task,
            String taskDesc,
            String clientMobile,
            Boolean isFinished,
            String EndDate) {
        this.managerName = managerName;
        this.managerMobile = managerMobile;
        this.task = task;
        this.taskDesc = taskDesc;
        this.clientMobile = clientMobile;
        this.isFinished = isFinished;
        this.EndDate = EndDate;
    }

    public Task(Task srcTask) {
        this.managerName = srcTask.getManagerName();
        this.managerMobile = srcTask.getManagerMobile();
        this.task = srcTask.getTask();
        this.taskDesc = srcTask.getTaskDesc();
        this.clientMobile = srcTask.getClientMobile();
        this.isFinished = srcTask.getIsFinished();
        this.EndDate = srcTask.getEndDate();
    }
}
