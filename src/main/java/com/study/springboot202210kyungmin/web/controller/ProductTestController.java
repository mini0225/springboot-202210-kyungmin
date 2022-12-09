package com.study.springboot202210kyungmin.web.controller;

import com.study.springboot202210kyungmin.web.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ProductTestController {

    @GetMapping("/product/addition")
    public String loadAddition(){
        return "product/product_add";
    }

//    @PostMapping("/api/product")
//    public String registerProduct(@RequestParam String productCode,
//                                  @RequestParam String productName,
//                                  @RequestParam("price") int p,
//                                  @RequestParam int stock) { //변수명이랑 parameter명이랑 같으면 생략가능 parameter 웬만하면 표기해야 구분하기 쉬움.
//        System.out.println(productName);
//        System.out.println(p);
//
//        return "product/product_view";
//    }


    @PostMapping("/api/product")
    public String registerProduct(Model model, ProductDto productDto) {
        model.addAttribute("productDto", productDto);
        System.out.println(productDto);
        return "product/product_view";
    }


    @GetMapping("/product/addition2")
    public String loadAddition2(){
        return "product/product_add2";
    }

    @ResponseBody //annotation controller 일때 responsebody 가 있으면 데이터 응답한다.
    @PostMapping("/api/product/2")
    public String registerProduct(@RequestBody ProductDto productDto) {
        System.out.println(productDto);
        return "텍스트 데이터 응답";
    }
}
