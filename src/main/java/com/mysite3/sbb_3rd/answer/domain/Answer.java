package com.mysite3.sbb_3rd.answer.domain;

import com.mysite3.sbb_3rd.question.domain.Question;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime CreateDate;

    @ManyToOne
    private Question question;
}
