package com.singular.jwt.payload;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class JwtAuthenticationResponse implements Serializable {

	private static final long serialVersionUID = 2579929370131992922L;
	
	private String token;
	private final String tokenType = "Bearer";

}
