package com.singular.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
public class UserCourse {

	@EmbeddedId
	private UserCourseID id;

	@Column(name = "credit_value")
	private double creditValue;

	@MapsId("userId") //references EmbeddedId's property
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne
    private User user;

	@MapsId("courseId") //references EmbeddedId's property
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    @ManyToOne
    private Course course;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "post_id")
	private List<CreditStatement> credits = new ArrayList<>();

}
