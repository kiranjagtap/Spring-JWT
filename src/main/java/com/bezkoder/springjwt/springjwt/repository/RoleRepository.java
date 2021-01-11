package com.bezkoder.springjwt.springjwt.repository;

import com.bezkoder.springjwt.springjwt.model.ERole;
import com.bezkoder.springjwt.springjwt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository  extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
