/*Done by  1. Naga Karthik Nandyala
         2. Akhila Penukonda
         3. Reddy Phanidhar Reddy
*/


package com.swe.HW3.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.swe.HW3.exception.ResourceNotFoundException;
import com.swe.HW3.model.Survey;
import com.swe.HW3.repository.SurveyRepository;
import com.swe.HW3.service.SurveyService;

@Service
public class SurveyServiceImpl implements SurveyService {

	private SurveyRepository surveyRepository;


	public SurveyServiceImpl(SurveyRepository surveyRepository) {
		super();
		this.surveyRepository = surveyRepository;
	}


	@Override
	public Survey saveSurvey(Survey survey) {
		return surveyRepository.save(survey);

	}

	@Override
	public List<Survey> getAllSurveys() {
		return surveyRepository.findAll();

	}

//This is to get all the details by ID
	@Override
	public Survey getSurveyById(long id) {
		Optional<Survey> survey = surveyRepository.findById(id);
if(survey.isPresent()) {
	return survey.get();

} else {
	throw new ResourceNotFoundException("Survey");
}

	}


//This is for the update operations
	@Override
	public Survey updateSurvey(Survey survey, long id) {
		Survey existingSurvey= surveyRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Survey")
				);

	existingSurvey.setCity(survey.getCity());
	existingSurvey.setComments(survey.getComments());
	existingSurvey.setDos(survey.getDos());
	existingSurvey.setEmail(survey.getEmail());
	existingSurvey.setFirstName(survey.getFirstName());
	existingSurvey.setLastName(survey.getLastName());
	existingSurvey.setInterested(survey.getInterested());

	existingSurvey.setLikedMost(survey.getLikedMost());
	existingSurvey.setRecommendation(survey.getRecommendation());
	existingSurvey.setState(survey.getState());
	existingSurvey.setStreetAddress(survey.getStreetAddress());
	existingSurvey.setZip(survey.getZip());

	surveyRepository.save(existingSurvey);
		return existingSurvey;
	}


	@Override
	public void deleteSurvey(long id) {

		surveyRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Survey"));
		surveyRepository.deleteById(id);

	}






}
