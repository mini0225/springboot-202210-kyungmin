package com.study.springboot202210kyungmin.IocAndDi;

import org.springframework.stereotype.Component;

@Component //ioc container 에 bean으로 등록한다.
public class StudentServiceImpl implements StudentService {

    @Override
    public void printStudentInfo(Student student) {
        System.out.println("학번 :" + student.getStudentId());
        System.out.println("이름 :" + student.getStudentName());
    }
}