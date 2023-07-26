package com.vld.service.imp;


import com.vld.service.MenuService;
import com.vld.model.Alcohol;

import java.util.List;

public class MenuServiceImpl implements MenuService {
    @Override
    public List<Alcohol> getBarAlcohol(Long barId) {
        return null;
    }

    @Override
    public void addAlcoholToBar(Long barId, Long alcoholId) {

    }

    @Override
    public void deleteAlcoholFromBar(Long barId, Long alcoholId) {

    }
}
