package com.vld.repository;


import com.vld.model.Bar;
import com.vld.utils.HibernateUtil;
import org.hibernate.Session;

import javax.transaction.Transactional;
import java.util.List;

public class BarRepository {
    public Bar get(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Bar bar = session.get(Bar.class, id);
        session.getTransaction().commit();
        session.close();
        return bar;
    }

    public List<Bar> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Bar> bars = session.createQuery("select b from bars b left join fetch b.alcoholList", Bar.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return bars;
    }

    @Transactional
    public Bar create(Bar bar) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(bar);
        session.getTransaction().commit();
        session.close();
        return bar;
    }

    @Transactional
    public Bar update(Bar bar) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(bar);
        session.getTransaction().commit();
        session.close();
        return bar;
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
