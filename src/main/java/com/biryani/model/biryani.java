package com.biryani.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
// Creating entity of biryani
@Entity
public class biryani {

	// Using Id annotation to specify primary key of entity
	@Id
	public int biryaniId;
	public String biryaniName;
	public String biryaniType;
	public String biryaniDetails;
	public int biryaniPrice;
}