package com.krishna.seatbooking.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
public class Section {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String layoutInfo;

	@JsonManagedReference
	@OneToMany(mappedBy = "section", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Seat> seats;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the layoutInfo
	 */
	public String getLayoutInfo() {
		return layoutInfo;
	}

	/**
	 * @param layoutInfo the layoutInfo to set
	 */
	public void setLayoutInfo(String layoutInfo) {
		this.layoutInfo = layoutInfo;
	}
}
