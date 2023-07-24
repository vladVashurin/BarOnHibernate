package com.vld.vld.service;


import com.vld.vld.model.AlcoholType;

import java.util.List;

public interface AlcoholTypeService {

    AlcoholType get(Long id);

    List<AlcoholType> getAll();

    AlcoholType create(AlcoholType alcoholType);

    AlcoholType update(AlcoholType alcoholType);

    void delete(Long id);
}