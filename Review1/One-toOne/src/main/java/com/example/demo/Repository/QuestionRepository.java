package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.QuestionModel;

public interface QuestionRepository  extends JpaRepository<QuestionModel, Integer> {

}
