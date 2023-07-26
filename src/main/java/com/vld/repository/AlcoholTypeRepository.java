package com.vld.repository;


import com.vld.model.AlcoholType;
import com.vld.utils.HibernateUtil;
import org.hibernate.Session;

import javax.transaction.Transactional;
import java.util.List;


public class AlcoholTypeRepository {
    public AlcoholType get(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        AlcoholType aT = session.get(AlcoholType.class, id);
        session.getTransaction().commit();
        session.close();
        return aT;
    }

    public List<AlcoholType> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<AlcoholType> alcoholTypes = session.createQuery("select a from alcohol_types a", AlcoholType.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return alcoholTypes;
    }

    @Transactional
    public AlcoholType create(AlcoholType alcoholType) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(alcoholType);
        session.getTransaction().commit();
        session.close();
        return alcoholType;
    }

    @Transactional
    public AlcoholType update(AlcoholType alcoholType) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(alcoholType);
        session.getTransaction().commit();
        session.close();
        return alcoholType;
    }

    @Transactional
    public void delete(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(get(id));
        session.getTransaction().commit();
        session.close();
    }
}
