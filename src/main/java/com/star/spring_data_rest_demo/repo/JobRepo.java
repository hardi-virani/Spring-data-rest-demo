package com.star.spring_data_rest_demo.repo;

import com.star.spring_data_rest_demo.model.JobPost_dataRest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost_dataRest, Integer> {

//    List<JobPost_dataRest> findByPostProfileContainingOrPostDescContaining(String PostProfile, String PostDesc);

}