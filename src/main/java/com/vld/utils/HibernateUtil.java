package com.vld.vld.utils;


import com.vld.vld.model.AlcoholType;
import com.vld.vld.repository.AlcoholTypeRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private final static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        SessionFactory sessionFactory = new Configuration().addAnnotatedClass(AlcoholType.class).buildSessionFactory();
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}