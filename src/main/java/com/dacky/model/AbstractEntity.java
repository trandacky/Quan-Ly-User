package com.dacky.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractEntity {
	
	@Column(name = "create_day")
	@CreatedDate
	private Instant createDay;

	@Column(name = "create_by")
	@CreatedBy
	private String createBy;

	@Column(name = "update_date")
	@LastModifiedDate
	private Instant updateDate;

	@Column(name = "update_by")
	@LastModifiedBy
	private String updateBy;

	public Instant getCreateDay() {
		return createDay;
	}

	public void setCreateDay(Instant createDay) {
		this.createDay = createDay;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Instant getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Instant updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

}
