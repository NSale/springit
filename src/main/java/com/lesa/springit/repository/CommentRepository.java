package com.lesa.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lesa.springit.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
