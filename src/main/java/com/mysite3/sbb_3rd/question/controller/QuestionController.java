package com.mysite3.sbb_3rd.question.controller;

import com.mysite3.sbb_3rd.question.domain.Question;
import com.mysite3.sbb_3rd.question.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class QuestionController {

//    private final QuestionRepository questionRepository; -> service로 옮김
    private final QuestionService questionService;


    @RequestMapping("/question/list")
    public String list(Model model){
        List<Question> questionList = this.questionService.getList();
        model.addAttribute("questionList", questionList);
        return "question_list";
    }
}
