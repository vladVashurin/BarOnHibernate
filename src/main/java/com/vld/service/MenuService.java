package com.vld.vld.service;


import com.vld.vld.model.Alcohol;

import java.util.List;

public interface MenuService {

    List<Alcohol> getBarAlcohol(Long barId);

    void addAlcoholToBar(Long barId, Long alcoholId);

    void deleteAlcoholFromBar(Long barId, Long alcoholId);
}
