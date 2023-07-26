package com.vld.service.imp;





import com.vld.model.Alcohol;
import com.vld.repository.AlcoholRepository;
import com.vld.service.AlcoholService;

import java.util.List;

public class AlcoholServiceImpl implements AlcoholService {

    AlcoholRepository repository = new AlcoholRepository();
    @Override
    public Alcohol get(Long id) {
       return repository.get(id);
    }

    @Override
    public List<Alcohol> getAll() {
        return repository.getAll();
    }

    @Override
    public Alcohol create(Alcohol alcohol) {
        return repository.create(alcohol);
    }

    @Override
    public Alcohol update(Alcohol alcohol) {
        return repository.update(alcohol);
    }

    @Override
    public void delete(Long id) {
repository.delete(id);
    }
}
