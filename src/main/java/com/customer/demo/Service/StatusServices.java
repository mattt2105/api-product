package com.customer.demo.Service;

import com.customer.demo.DTO.StatusDTO;
import com.customer.demo.Domain.Status;
import com.customer.demo.Repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatusServices {

    @Autowired
    StatusRepository statusRepository;

    public List<StatusDTO>getAllStatus(){
        List<Status> datasStatus = statusRepository.findAllByOrderByIdAsc();
        List<StatusDTO> dtoStatus = new ArrayList<>();

        if (datasStatus!= null && !datasStatus.isEmpty()){
            for (Status status : datasStatus){
                StatusDTO dto = new StatusDTO();

                dto.setId(status.getId());
                dto.setName(status.getName());

                dtoStatus.add(dto);
            }
        }

        return dtoStatus;
    }
}
