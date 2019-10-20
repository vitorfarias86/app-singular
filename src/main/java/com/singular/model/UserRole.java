package com.singular.model;

import java.time.Instant;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_roles")
public class UserRole {

	@EmbeddedId
	private UserRoleID id;
	
	private Instant createdAt;
}
