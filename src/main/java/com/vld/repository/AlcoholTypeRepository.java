package com.vld.vld.repository;



import com.vld.vld.model.AlcoholType;
import com.vld.vld.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.transaction.Transactional;
import java.util.List;


public class AlcoholTypeRepository {
    static {

    }
    AlcoholType get(Long id) {
        return null;
    }

    List<AlcoholType> getAll() {
        return null;
    }

    @Transactional
    public static AlcoholType create(AlcoholType alcoholType) {

       Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        AlcoholType alcohol = new AlcoholType(null, 50d);
        session.save(alcohol);
        session.getTransaction().commit();
        session.close();
        return alcoholType;
    }

    AlcoholType update(AlcoholType alcoholType) {
        return null;
    }

    void delete(Long id) {

    }
}
