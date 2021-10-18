package com.dacky.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user_mission")
@Entity
public class UserMission extends AbstractEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private Long id;
	
	@Column(name ="user_id")
	private String userID;
	
	@Column(name = "mission_id")
	private Long missopnId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public Long getMissopnId() {
		return missopnId;
	}

	public void setMissopnId(Long missopnId) {
		this.missopnId = missopnId;
	}
}
