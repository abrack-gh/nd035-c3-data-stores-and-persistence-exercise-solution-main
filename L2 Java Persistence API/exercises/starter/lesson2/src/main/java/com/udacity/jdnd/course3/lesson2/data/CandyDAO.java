package com.udacity.jdnd.course3.lesson2.data;

import java.util.List;

public interface CandyDAO {
    List<CandyData> list();

    void addToDelivery(Long candyId, Long deliveryId);
    List<CandyData> findByDelivery(Long deliveryId);
}
