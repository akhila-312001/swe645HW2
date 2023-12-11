/*Done by  1. Naga Karthik Nandyala
         2. Akhila Penukonda
         3. Reddy Phanidhar Reddy
*/


package com.swe.HW3.service;

import java.util.List;

import com.swe.HW3.model.Survey;

public interface SurveyService {

	Survey saveSurvey(Survey survey);
List<Survey> getAllSurveys();

Survey getSurveyById(long id);

Survey updateSurvey(Survey surveey, long id);

void deleteSurvey(long id);
}
