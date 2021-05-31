package com.activities.activitiesspring.repository;

import com.activities.activitiesspring.model.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends CrudRepository<Activity, Long> {


}
