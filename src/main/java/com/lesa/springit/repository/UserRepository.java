package com.lesa.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lesa.springit.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
