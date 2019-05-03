package com.usa.nj.gov.ed.service;

import java.lang.reflect.Method;

import org.springframework.stereotype.Service;

import com.usa.nj.gov.ed.request.IndvInfoRequest;
import com.usa.nj.gov.ed.response.PlanInfo;


@Service
public class EdRulesServiceImpl implements EdRulesService {

	/* (non-Javadoc)
	 * @see com.usa.nj.gov.ed.service.EdRulesService#determineElgibility(com.usa.nj.gov.ed.request.IndvInfoRequest)
	 * this method is used to excute the rules  according to plan name
	 */
	@Override
	public PlanInfo determineElgibility(IndvInfoRequest request) {
		PlanInfo response = null;
		String planName = request.getPlanName();
		System.out.println(planName);
		try {
			Class clz = Class.forName("com.usa.nj.gov.ed.service." + planName + "RulesService");
			Object obj = clz.newInstance();
			Method method = clz.getDeclaredMethod("excuteRules", IndvInfoRequest.class);
			Object retValue = method.invoke(obj, request);
			response = (PlanInfo) retValue;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}

}
