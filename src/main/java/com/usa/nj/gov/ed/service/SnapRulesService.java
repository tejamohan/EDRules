package com.usa.nj.gov.ed.service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import com.usa.nj.gov.ed.request.IndvInfoRequest;
import com.usa.nj.gov.ed.response.PlanInfo;

public class SnapRulesService implements IRulesService{

	/* (non-Javadoc)
	 * @see com.usa.nj.gov.ed.service.IRulesService#excuteRules(com.usa.nj.gov.ed.request.IndvInfoRequest)
	 * this plan is used to excute the Snap plan rules
	 */
	@Override
	public PlanInfo excuteRules(IndvInfoRequest request) {
		PlanInfo response=new PlanInfo();
		Double salary=request.getMonthlyIncome();
		if(salary>1000) {
			response.setPlanStatus("DN");
			response.setDenialReason("Due to high income");
		}else {
			response.setPlanStatus("plan Approved");
			response.setBenfitAmount(300.00);
			Date currentDate=new Date();
			LocalDateTime localdatetime=currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
			localdatetime.plusMonths(1);
			Date currentDatePlusMonth=Date.from(localdatetime.atZone(ZoneId.systemDefault()).toInstant());

			response.setPlanStartDate(new Date());
			
			response.setPlanEndDate(currentDatePlusMonth);
		}
		return response;
	}

}
