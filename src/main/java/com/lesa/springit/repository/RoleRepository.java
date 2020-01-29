package com.lesa.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lesa.springit.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
