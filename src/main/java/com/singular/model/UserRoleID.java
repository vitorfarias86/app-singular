package com.singular.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class UserRoleID implements Serializable{

	private static final long serialVersionUID = 2091686993120969403L;

	@Column(name = "user_id")
	private Long userId;
	@Column(name = "role_id")
	private Long roleId;
}
