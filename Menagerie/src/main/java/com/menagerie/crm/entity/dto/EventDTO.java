package com.menagerie.crm.entity.dto;

import java.util.Date;

import com.menagerie.crm.entity.Pet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventDTO {

	private int id;

	private Pet pet;

	private Date date;

	private String type;

	private String remark;

}
