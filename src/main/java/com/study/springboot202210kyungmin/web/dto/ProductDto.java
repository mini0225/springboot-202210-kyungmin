package com.study.springboot202210kyungmin.web.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data //DTO 받아올때 필요한 annotation, getter / setter가 있기 때문.

public class ProductDto {
    private String productCode;
    private String productName;
    private String price;
    private String stock;
}
