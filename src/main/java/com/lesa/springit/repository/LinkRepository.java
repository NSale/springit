package com.lesa.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lesa.springit.domain.Link;

public interface LinkRepository extends JpaRepository<Link, Long>{
	
	
}
