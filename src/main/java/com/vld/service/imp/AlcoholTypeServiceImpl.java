package com.vld.service.imp;


import com.vld.repository.AlcoholTypeRepository;
import com.vld.service.AlcoholTypeService;
import com.vld.model.AlcoholType;

import java.util.List;

public class AlcoholTypeServiceImpl implements AlcoholTypeService {

    AlcoholTypeRepository alcoholTypeRepository = new AlcoholTypeRepository();

    @Override
    public AlcoholType get(Long id) {
        return alcoholTypeRepository.get(id);
    }

    @Override
    public List<AlcoholType> getAll() {
        return alcoholTypeRepository.getAll();
    }

    @Override
    public AlcoholType create(AlcoholType alcoholType) {
        return alcoholTypeRepository.create(alcoholType);
    }

    @Override
    public AlcoholType update(AlcoholType alcoholType) {
        return alcoholTypeRepository.update(alcoholType);
    }

    @Override
    public void delete(Long id) {
        alcoholTypeRepository.delete(id);
    }
}
