package com.activities.activitiesspring.dto;


import com.activities.activitiesspring.model.Activity;
import com.activities.activitiesspring.model.ActivityType;

import java.util.Date;

public class ActivityDto {

    private Long id;
    private ActivityType activityType;
    private Date activityDate;
    private double burnedCalories;
    private double  duringTime;

    public ActivityDto() {
    }

    public ActivityDto(Long id, ActivityType activityType, Date activityDate, double burnedCalories, double duringTime) {
        this.id = id;
        this.activityType = activityType;
        this.activityDate = activityDate;
        this.burnedCalories = burnedCalories;
        this.duringTime = duringTime;
    }

    public ActivityDto(Activity activity){
        this.id = activity.getId();
        this.activityType = activity.getActivityType();
        this.activityDate = activity.getActivityDate();
        this.burnedCalories = activity.getBurnedCalories();
        this.duringTime = activity.getDuringTime();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public double getBurnedCalories() {
        return burnedCalories;
    }

    public void setBurnedCalories(double burnedCalories) {
        this.burnedCalories = burnedCalories;
    }

    public double getDuringTime() {
        return duringTime;
    }

    public void setDuringTime(double duringTime) {
        this.duringTime = duringTime;
    }
}
