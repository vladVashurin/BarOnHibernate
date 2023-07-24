package com.vld.service.imp;


import com.vld.model.Bar;
import com.vld.repository.BarRepository;
import com.vld.service.BarService;

import java.util.List;

public class BarServiceImp implements BarService {

    BarRepository barRepository = new BarRepository();

    @Override
    public Bar get(Long id) {
        return barRepository.get(id);
    }

    @Override
    public List<Bar> getAll() {
        return barRepository.getAll();
    }

    @Override
    public Bar create(Bar bar) {
        return barRepository.create(bar);
    }

    @Override
    public Bar update(Bar bar) {
        return barRepository.update(bar);
    }

    @Override
    public void delete(Long id) {
        barRepository.delete(id);
    }
}
