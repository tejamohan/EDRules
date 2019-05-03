package com.usa.nj.gov.ed.service;

import java.util.Date;

import com.usa.nj.gov.ed.request.IndvInfoRequest;
import com.usa.nj.gov.ed.response.PlanInfo;

public class CcapRulesService implements IRulesService{

	/* (non-Javadoc)
	 * @see com.usa.nj.gov.ed.service.IRulesService#excuteRules(com.usa.nj.gov.ed.request.IndvInfoRequest)
	 * this mehod is for excute the Ccap rules and return status
	 */
	@Override
	public PlanInfo excuteRules(IndvInfoRequest request) {
		PlanInfo response=new PlanInfo();
		Double salary=request.getMonthlyIncome();
		Integer child=request.getNoofKids();
		if(salary < 1000 && child > 0) {
		response.setPlanStatus("Plan Approved");
		response.setBenfitAmount(300.00);
		response.setPlanStartDate(new Date());
		response.setPlanEndDate(new Date());
			
		}else {
			response.setPlanName(request.getPlanName());
			response.setPlanStatus("DN");
			response.setDenialReason("due to high income or having no kids");
		}
		return response;
	}

}
