package com.vld.service;


import com.vld.model.Bar;

import java.util.List;

public interface BarService {

    Bar get(Long id);

    List<Bar> getAll();

    Bar create(Bar bar);

    Bar update(Bar bar);

    void delete(Long id);
}
