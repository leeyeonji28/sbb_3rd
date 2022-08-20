package com.mysite3.sbb_3rd.question.service;

import com.mysite3.sbb_3rd.DataNotFoundException;
import com.mysite3.sbb_3rd.question.dao.QuestionRepository;
import com.mysite3.sbb_3rd.question.domain.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList(){
        return this.questionRepository.findAll();
    }

    public Question getQuestion(Integer id){
        Optional<Question> question = this.questionRepository.findById(id);
        if (question.isPresent()){
            return question.get();
        } else {
            throw new DataNotFoundException("question noe found");
        }
    }
}
