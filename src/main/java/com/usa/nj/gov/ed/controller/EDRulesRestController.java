package com.usa.nj.gov.ed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.usa.nj.gov.ed.request.IndvInfoRequest;
import com.usa.nj.gov.ed.response.PlanInfo;
import com.usa.nj.gov.ed.service.EdRulesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="Excute ed rules for cheecking elgibility of citizen of the new jersy")
@RestController
public class EDRulesRestController {
	@Autowired
	private EdRulesService service;
    
	/**
	 * this method is pertaining to check the elgibility of the citizen of  nj 
	 *
	 */
	@ApiOperation(value="checking the elgibility excuting rules by plan name",produces="application/xml,application/json",consumes="application/xml,application/json")
	@PostMapping(value="/checkElgibility" ,produces= {"application/xml","application/json"},consumes={"application/xml","application/json"})
	public @ResponseBody PlanInfo  findEligibility(@RequestBody IndvInfoRequest req) {
		PlanInfo response=null;

			 response=service.determineElgibility(req);
		
		
		return response;
		
	}
 }
