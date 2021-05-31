package com.activities.activitiesspring.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "activityType")
    private ActivityType activityType;
    @Column(name = "activityDate")
    private LocalDate activityDate;
    @Column(name = "burnedCalories")
    private double burnedCalories;
    @Column(name = "duringTime")
    private double  duringTime;

    public Activity() {
    }

    public Activity(ActivityType activityType, LocalDate activityDate, double burnedCalories, double duringTime) {
        this.activityType = activityType;
        this.activityDate = activityDate;
        this.burnedCalories = burnedCalories;
        this.duringTime = duringTime;
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

    public LocalDate getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(LocalDate activityDate) {
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
