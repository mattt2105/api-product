package com.customer.demo.Service;

import com.customer.demo.DTO.ProductDTO;
import com.customer.demo.Domain.Product;
import com.customer.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServices {

    @Autowired
    ProductRepository productRepository;

    public List<ProductDTO> getAllProduct(){

        List<Product> datasProduct = productRepository.findAllByOrderByIdAsc();
        List<ProductDTO> productDTOS = new ArrayList<>();

        if (datasProduct != null && !datasProduct.isEmpty()){
            for (Product product : datasProduct){

                ProductDTO dto = new ProductDTO();
                dto.setId(product.getId());
                dto.setProductID(product.getProductId());
                dto.setProductName(product.getProductName());
                dto.setAmount(product.getAmount());
                dto.setCustomerName(product.getCustomerName());
                dto.setStatus(product.getStatus());
                dto.setTransactionDate(product.getTransactionDate());
                dto.setCreateBy(product.getCreateBy());
                dto.setCreateOn(product.getCreatedOn());

                productDTOS.add(dto);

            }
        }
        return productDTOS;
    }

}
