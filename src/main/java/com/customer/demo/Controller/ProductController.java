package com.customer.demo.Controller;

import com.customer.demo.DTO.ProductDTO;
import com.customer.demo.DTO.ResponseDTO;
import com.customer.demo.DTO.StatusDTO;
import com.customer.demo.Service.ProductServices;
import com.customer.demo.Service.StatusServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductController {

    @Autowired
    ProductServices productServices;

    @Autowired
    StatusServices statusServices;


    @GetMapping("getAllProduct")
    public List<ProductDTO> getAllProduct(){
        return productServices.getAllProduct();
    }

    @GetMapping("getAllStatus")
    List<StatusDTO>getAllStatus(){
        return statusServices.getAllStatus();
    }


    @GetMapping("getAllProductsAndStatuses")
    ResponseEntity<ResponseDTO>getAllProductsAndStatuses(){

        ResponseDTO dto = new ResponseDTO();
        try{
            List<ProductDTO> products = productServices.getAllProduct();
            List<StatusDTO> statuses = statusServices.getAllStatus();

            dto.setData(products);
            dto.setStatus(statuses);

            return  ResponseEntity.status(HttpStatus.OK).body(dto);
        }catch (Exception e){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }






























}
