package com.singular.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "username"
        }),
        @UniqueConstraint(columnNames = {
            "email"
        })
})
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
    @Size(max = 11)
	private String cpf;
	
	@NotBlank
	@Size(max = 40)
	private String name;
	
    @NaturalId
    @NotBlank
    @Size(max = 40)
    @Email
	private String email;
	
	@NotNull
	private LocalDate birthdate;

	@NotBlank
	private String address;
	
	@Column(name = "address_number")
	private int addressNumber;

	@NotBlank
	private String neighborhood;
	
	@NotBlank
	@Size(max = 15)
	private String username;
	
    @NotBlank
    @Size(max = 100)
	private String password;
	
	private boolean enabled;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id", foreignKey=@ForeignKey(name = "Fk_user")),
            inverseJoinColumns = @JoinColumn(name = "role_id", foreignKey=@ForeignKey(name = "Fk_role")))
    private Set<Role> roles = new HashSet<>();

}

