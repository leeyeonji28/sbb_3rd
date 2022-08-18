package com.mysite3.sbb_3rd.answer.dao;

import com.mysite3.sbb_3rd.answer.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
