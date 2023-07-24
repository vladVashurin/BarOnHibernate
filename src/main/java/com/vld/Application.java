package com.vld.vld;



import com.vld.vld.model.AlcoholType;
import com.vld.vld.repository.AlcoholTypeRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {

    public static void main(String[] args) {
        AlcoholType alcoholType = new AlcoholType(null, 10d);
        AlcoholTypeRepository alcoholTypeRepository = new AlcoholTypeRepository();
        alcoholTypeRepository.create(alcoholType);
    }
}
