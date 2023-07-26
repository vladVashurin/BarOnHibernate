package com.vld.repository;


import com.vld.model.Alcohol;
import com.vld.utils.HibernateUtil;
import org.hibernate.Session;

import javax.transaction.Transactional;
import java.util.List;

public class AlcoholRepository {
    public Alcohol get(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Alcohol a = session.get(Alcohol.class, id);
        session.getTransaction().commit();
        session.close();
        return a;
    }

    public List<Alcohol> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Alcohol> alcohol = session.createQuery("select a from alcohol a", Alcohol.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return alcohol;
    }

    @Transactional
    public Alcohol create(Alcohol alcohol) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(alcohol);
        session.getTransaction().commit();
        session.close();
        return alcohol;
    }

    @Transactional
    public Alcohol update(Alcohol alcohol) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(alcohol);
        session.getTransaction().commit();
        session.close();
        return alcohol;
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
