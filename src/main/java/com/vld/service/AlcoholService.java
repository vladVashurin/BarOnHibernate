package com.vld.service;


import com.vld.model.Alcohol;

import java.util.List;

public interface AlcoholService {

    Alcohol get(Long id);

    List<Alcohol> getAll();

    Alcohol create(Alcohol alcohol);

    Alcohol update(Alcohol alcohol);

    void delete(Long id);
}