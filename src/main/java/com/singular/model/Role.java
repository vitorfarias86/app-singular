package com.singular.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Enumerated(EnumType.STRING)
	@NaturalId
	@Column(length = 60)
	@Getter
	@Setter
	private RoleName name;

	@ManyToMany(mappedBy = "roles")
	@Getter
	@Setter
	private Collection<User> users;

	public enum RoleName {
		ADMIN(1), STUDENT(2), TEACHER(3), MANAGER(4);

		@Getter
		@Setter
		private int id;

		RoleName(int id) {
			this.id = id;
		}
	}
}
