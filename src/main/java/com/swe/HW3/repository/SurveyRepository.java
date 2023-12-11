

package com.swe.HW3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swe.HW3.model.Survey;


@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {



}
