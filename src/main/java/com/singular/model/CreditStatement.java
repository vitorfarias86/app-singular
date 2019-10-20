package com.singular.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "credit_statment")
public class CreditStatement {

	@Getter
	@Setter
	@EmbeddedId
	private UserCourseID id;

	@Enumerated(EnumType.STRING)
	@NaturalId
	@Column(length = 60)
	private StatmentType type;
	
	private Instant creditedAt;
	
	
	public enum StatmentType {
		CREDIT(1), DEBIT(2);

		@Getter
		@Setter
		private int id;

		StatmentType(int id) {
			this.id = id;
		}
	}
}
