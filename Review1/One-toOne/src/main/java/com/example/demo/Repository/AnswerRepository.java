package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.AnswerModel;



public interface AnswerRepository extends JpaRepository<AnswerModel, Integer> {

}