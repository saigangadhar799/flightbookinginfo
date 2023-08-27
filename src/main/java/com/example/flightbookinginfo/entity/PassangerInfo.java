package com.example.flightbookinginfo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PASSENGER_INFO")
public class PassangerInfo {
	  @Id
	    @GeneratedValue
	    private Long pId;
	    private String name;
	    private String email;
	    private String source;
	    private String Destination;
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	    private Date travelDate;
	    private String pickupTime;
	    private String arrivalTime;
	    private double fare;
}
