package com.usa.nj.gov.ed.request;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;


@Data
@XmlRootElement(name="indi-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class IndvInfoRequest {
private Integer indvId;
private Long ssn;
private String firstName;
private String lastName;
private String planName;
private Date dob;
private String gender;
private Double monthlyIncome;
private Integer noofKids;
private String martialStatus;
private boolean getFlag;


}
