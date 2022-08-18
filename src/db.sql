# DB 생성
DROP DATABASE IF EXISTS sbb_third;
CREATE DATABASE sbb_third;
USE sbb_third;

# 질문 테이블 생성
CREATE TABLE Question(
    id INT(11) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `subject` VARCHAR(200) NOT NULL,
    content TEXT NOT NULL,
    create_date DATETIME NOT NULL
);

# 답변 테이블 생성
CREATE TABLE Answer(
    id INT(11) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    content TEXT NOT NULL,
    create_date DATETIME NOT NULL,
    question_id INT(11) UNSIGNED NOT NULL
);