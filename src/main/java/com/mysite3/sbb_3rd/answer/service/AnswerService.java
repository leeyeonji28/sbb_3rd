package com.mysite3.sbb_3rd.answer.service;

import com.mysite3.sbb_3rd.answer.dao.AnswerRepository;
import com.mysite3.sbb_3rd.answer.domain.Answer;
import com.mysite3.sbb_3rd.question.domain.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public void create(Question question, String content) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        this.answerRepository.save(answer);
    }
}
