
/*Done by  1. Naga Karthik Nandyala
         2. Akhila Penukonda
         3. Reddy Phanidhar Reddy
*/


package com.swe.HW3.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swe.HW3.model.Survey;
import com.swe.HW3.service.SurveyService;


@RestController
@RequestMapping("/api/Survey/")
public class SurveyController {

	private SurveyService surveyService;




	public SurveyController(SurveyService surveyService) {
		super();
		this.surveyService = surveyService;
	}

@PostMapping()
public ResponseEntity<Survey> saveSurvey(@RequestBody Survey survey){
	return new ResponseEntity<>(surveyService.saveSurvey(survey), HttpStatus.CREATED);
}


@GetMapping()
public List<Survey> getAllSurveys(){
	return surveyService.getAllSurveys(); }


//This is to get all the details by ID
@GetMapping("{id}")
public ResponseEntity<Survey> getSurveyById(@PathVariable("id") long surveyid){
	return new ResponseEntity<>(surveyService.getSurveyById(surveyid), HttpStatus.OK);
}



////This is for the update operations
@PutMapping("{id}")
public ResponseEntity<Survey> updateSurvey(@PathVariable("id") long id
		, @RequestBody Survey survey){
	return new ResponseEntity<>(surveyService.updateSurvey(survey, id), HttpStatus.OK);
	}



////This is for the delete operations
@DeleteMapping("/{id}")
public ResponseEntity<String> deleteSurvey(@PathVariable("id") long id){
	surveyService.deleteSurvey(id);

	return new ResponseEntity<> ("Survey deleted succesfully", HttpStatus.OK);
}



/*
 * @Autowired private SurveyRepository SurveyRepository;
 *
 * //get all Students
 *
 *
 *
 *
 * //post the data to Database and rest api
 *
 * @PostMapping("/Survey")
 *
 * @ResponseBody public Survey createSurvey(@RequestBody Survey survey) { return
 * SurveyRepository.save(survey); }
 */


}