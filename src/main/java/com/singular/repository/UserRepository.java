package com.singular.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.singular.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

	public Optional<User> findByUsername(String username) throws UsernameNotFoundException;
	public Optional<User> findById(String cpf);
	List<User> findByIdIn(List<Long> userIds);
	Boolean existsByUsername(String username);
	@Override
	public <S extends User> S save(S entity);
}
