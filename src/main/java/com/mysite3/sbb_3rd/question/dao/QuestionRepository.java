package com.mysite3.sbb_3rd.question.dao;

import com.mysite3.sbb_3rd.question.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
