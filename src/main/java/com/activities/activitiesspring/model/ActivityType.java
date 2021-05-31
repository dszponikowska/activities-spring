package com.activities.activitiesspring.model;

public enum ActivityType {
    RUN("run"),
    BIKE("bike"),
    GYM("gym");

    private String description;

    ActivityType(String description) {
        this.description = description;
    }
}
