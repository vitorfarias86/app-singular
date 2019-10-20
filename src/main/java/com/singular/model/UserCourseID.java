package com.singular.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;

import lombok.Data;

@Data
@Embeddable
public class UserCourseID implements Serializable{

	private static final long serialVersionUID = 3828279298522284610L;
	
	@Column(name = "user_id")
	@JoinColumn()
	private Long userId;
	
	@Column(name = "course_id")
	private Long courseId;
	
}
