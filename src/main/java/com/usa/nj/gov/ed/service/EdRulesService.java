package com.usa.nj.gov.ed.service;

import com.usa.nj.gov.ed.request.IndvInfoRequest;
import com.usa.nj.gov.ed.response.PlanInfo;

public interface EdRulesService {
public PlanInfo determineElgibility(IndvInfoRequest info);
}
