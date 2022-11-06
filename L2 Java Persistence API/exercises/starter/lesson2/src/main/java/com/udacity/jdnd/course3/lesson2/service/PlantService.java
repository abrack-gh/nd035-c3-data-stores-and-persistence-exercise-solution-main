package com.udacity.jdnd.course3.lesson2.service;

import com.udacity.jdnd.course3.lesson2.data.Plant;
import com.udacity.jdnd.course3.lesson2.data.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PlantService {

    @Autowired
    PlantRepository plantRepository;

    public Long save(Plant plant){
        return plantRepository.save(plant).getId();
    }

    public Boolean delivered(Long Id){
        return plantRepository.existsPlantIdAndDeliveryCompleted(Id, true);
    }

    public List<Plant> findByPriceLessThan(BigDecimal price){
        return plantRepository.findByPriceLessThan(price);
    }


    public Plant getPlantByName(String name){
        return new Plant();
    }
}
