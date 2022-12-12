package com.study.springboot202210kyungmin.web.controller;

import com.study.springboot202210kyungmin.web.dto.RequestStudyDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class ControllerStudy {

    @GetMapping("/study/page")
    public String 페이지응답(){
        return "page_study";
    }

    @ResponseBody //문자열 응답시에는 responsebody 붙음.
    @GetMapping("/study/text/1")
    public String 문자열데이터응답(){
        return "문자열을 응답";
    }

    @ResponseBody
    @GetMapping("/study/text/2")
    public String 요청데이터Params(String data1, int data2){
        return "문자열" + data1 + ", 숫자: " + data2 ;
    }


    @ResponseBody
    @GetMapping("/study/text/3")
    public String 요청데이터obj(RequestStudyDto requestStudyDto){  // 원래 괄호 안 내용 : Map<String, Object > requestData
        return requestStudyDto.toString();
    }

    @ResponseBody
    @PostMapping("/study/student/1")
    public String getJsonAjax(@RequestBody RequestStudyDto requestStudyDto) {
        return requestStudyDto.toString();
    }

    @ResponseBody
    @GetMapping("/study/student/2")
    public ResponseEntity<?> getJsonAjax2(){
        RequestStudyDto requestStudyDto = new RequestStudyDto();
        requestStudyDto.setName ("aaa");
        requestStudyDto.setEmail ("abc@abc.com");
        requestStudyDto.setAddress ("부산시 북구");

        return new ResponseEntity<> (requestStudyDto, HttpStatus.OK);



    }


}
