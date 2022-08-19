package com.mysite3.sbb_3rd.question.service;

import com.mysite3.sbb_3rd.question.dao.QuestionRepository;
import com.mysite3.sbb_3rd.question.domain.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList(){
        return this.questionRepository.findAll();
    }
}
