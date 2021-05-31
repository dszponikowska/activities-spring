package com.activities.activitiesspring.controller;

import com.activities.activitiesspring.dto.ActivityDto;
import com.activities.activitiesspring.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping(value = "/activities")
    public List<ActivityDto> getAllActivities(
            @RequestParam(value = "activityType", required = false) int activityType,
            @RequestParam(value = "activityDateFrom", required = false) Date activityDateFrom,
            @RequestParam(value = "activityDateTo", required = false) Date activityDateTo) {
        return activityService.getAllActvities();
    }

    @GetMapping(value = "/activities/{id}")
    public ActivityDto getActivityById(@PathVariable("id") Long id) {
        return activityService.getActivityById(id);
    }

    @PostMapping(value = "/activities")
    public ResponseEntity addActivity(ActivityDto activityDto) {
        activityService.addActivity(activityDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(activityDto);
    }

    @PutMapping(value = "/activities/{id}")
    public ActivityDto updateActivity(
        @RequestBody ActivityDto activityDto,
        @PathVariable("id") Long id)
    {
        return activityService.updateActivity(activityDto, id);
    }

    @DeleteMapping(value = "activity/{id}")
    public ActivityDto deleteActivityById(
            @PathVariable("id") Long id)
    {
        return activityService.deleteActivityById(id);
    }

}
