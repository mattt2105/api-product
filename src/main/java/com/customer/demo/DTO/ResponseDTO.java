package com.customer.demo.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseDTO {

    private List<ProductDTO> data;
    private List<StatusDTO>status;

    public ResponseDTO(){}
    public ResponseDTO(List<ProductDTO> data, List<StatusDTO> status) {
        this.data = data;
        this.status = status;
    }
}
