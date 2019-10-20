package com.singular.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.singular.model.Role;
import com.singular.model.Role.RoleName;

public interface RoleRepository extends CrudRepository<Role, Long> {

	Optional<Role> findByName(RoleName roleName);
}