package com.study.springboot202210kyungmin.IocAndDi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {


    @Autowired
    private StudentService studentService; //studentService 주입하기 위해서는 IOC container 에 등록되어야 함.

    @Autowired
    private Test1 t1;

    @Autowired
    private Test2 t2;

    @ResponseBody
    @GetMapping("/student")
    public String printStudent() {
        Student student = Student.builder()
                .studentId(2001)
                .studentName("김경민")
                .build();

        t1.print();
        t2.print();

        studentService.printStudentInfo(student);

        return null;
    }

}
