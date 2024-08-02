package com.menagerie.crm.entity.dto;

import java.util.Date;
import java.util.List;

import com.menagerie.crm.entity.Event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PetDTO {

	private String name;

	private String owner;

	private String species;

	private Sex sex;

	private Date birth;

	private Date death;

	private List<Event> events;

	public enum Sex {
		M, F
	}

}
