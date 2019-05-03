package com.usa.nj.gov.ed.response;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="plan-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanInfo {
private Integer planId;
private String planName;
private String planStatus;
private Date planStartDate;
private Date planEndDate;
private Double benfitAmount;
private String denialReason;


}
